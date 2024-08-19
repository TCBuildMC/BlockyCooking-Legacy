package xyz.tcbuildmc.minecraft.mod.blockycooking.block.machine;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.InventoryBlock;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.entity.machine.GUIBlockEntity;

public abstract class GUIBlock extends InventoryBlock {
    public GUIBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.getBlockEntity(pos) instanceof GUIBlockEntity factory) {
            player.openHandledScreen(factory);
        }
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        if (itemStack.hasCustomName()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof GUIBlockEntity nameable) {
                nameable.setCustomName(itemStack.getName());
            }
        }
    }
}
