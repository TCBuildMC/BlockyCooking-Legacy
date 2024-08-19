package xyz.tcbuildmc.minecraft.mod.blockycooking.block.machine;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.WaterloggedInventoryBlock;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.entity.machine.GUIBlockEntity;

public abstract class WaterloggedGUIBlock extends WaterloggedInventoryBlock {
    public WaterloggedGUIBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.getBlockEntity(pos) instanceof GUIBlockEntity factory) {
            player.openHandledScreen(factory);
        }
    }
}
