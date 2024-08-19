package xyz.tcbuildmc.minecraft.mod.blockycooking.block.machine;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.entity.machine.FishTrapBlockEntity;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.entity.InventoryBlockEntity;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.entity.ModBlockEntityTypes;
import xyz.tcbuildmc.minecraft.mod.blockycooking.stat.ModCustomStats;

public class FishTrapBlock extends WaterloggedGUIBlock {
    public FishTrapBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        super.use(state, world, pos, player, hand, hit);
        player.incrementStat(ModCustomStats.INTERACT_WITH_FISH_TRAP.get());
    }

    @Override
    public BlockEntityType<? extends InventoryBlockEntity> getBlockEntityTypeForTicking() {
        return ModBlockEntityTypes.FISH_TRAP.get();
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new FishTrapBlockEntity(pos, state);
    }
}
