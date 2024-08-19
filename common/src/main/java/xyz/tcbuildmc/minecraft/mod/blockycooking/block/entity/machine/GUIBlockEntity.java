package xyz.tcbuildmc.minecraft.mod.blockycooking.block.entity.machine;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.text.Text;
import net.minecraft.util.Nameable;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.entity.InventoryBlockEntity;

public abstract class GUIBlockEntity extends InventoryBlockEntity implements NamedScreenHandlerFactory, Nameable {
    @Nullable
    private Text customName;

    public GUIBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
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
        if (nbt.contains("CustomName", 8)) {
            this.customName = Text.Serializer.fromJson(nbt.getString("CustomName"));
        }
    }

    @Override
    public void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        if (this.customName != null) {
            nbt.putString("CustomName", Text.Serializer.toJson(this.customName));
        }
    }
}
