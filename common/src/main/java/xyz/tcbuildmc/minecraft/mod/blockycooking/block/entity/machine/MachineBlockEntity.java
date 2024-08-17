package xyz.tcbuildmc.minecraft.mod.blockycooking.block.entity.machine;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.inventory.Inventories;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.text.Text;
import net.minecraft.util.Nameable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public abstract class MachineBlockEntity extends BlockEntity implements SimpleSidedInventory, NamedScreenHandlerFactory, Nameable, BlockEntityTicker<MachineBlockEntity> {
    @Nullable
    private Text customName;

    public MachineBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @Override
    public Text getName() {
        return this.customName == null ? this.getContainerName() : this.customName;
    }

    @Override
    public Text getDisplayName() {
        return this.getName();
    }

    public abstract Text getContainerName();

    @Nullable
    @Override
    public Text getCustomName() {
        return this.customName;
    }

    public void setCustomName(@Nullable Text customName) {
        this.customName = customName;
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, this.getItems());
        if (nbt.contains("CustomName", 8)) {
            this.customName = Text.Serializer.fromJson(nbt.getString("CustomName"));
        }
    }

    @Override
    public void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, this.getItems());
        if (this.customName != null) {
            nbt.putString("CustomName", Text.Serializer.toJson(this.customName));
        }
    }

    @Override
    public void tick(World world, BlockPos pos, BlockState state, MachineBlockEntity blockEntity) {
    }
}
