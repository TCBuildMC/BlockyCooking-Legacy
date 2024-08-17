package xyz.tcbuildmc.minecraft.mod.blockycooking.block.machine;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.entity.machine.FishTrapBlockEntity;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.entity.machine.MachineBlockEntity;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.ModBlockEntityTypes;

public class FishTrapBlock extends WaterloggedMachineBlock {
    public FishTrapBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockEntityType<? extends MachineBlockEntity> getBlockEntityTypeForTicking() {
        return ModBlockEntityTypes.FISH_TRAP.get();
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new FishTrapBlockEntity(pos, state);
    }
}
