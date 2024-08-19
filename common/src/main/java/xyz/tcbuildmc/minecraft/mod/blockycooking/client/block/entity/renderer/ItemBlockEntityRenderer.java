package xyz.tcbuildmc.minecraft.mod.blockycooking.client.block.entity.renderer;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;

public abstract class ItemBlockEntityRenderer<E extends BlockEntity> implements BlockEntityRenderer<E> {
    protected final ItemRenderer itemRenderer;

    public ItemBlockEntityRenderer(BlockEntityRendererFactory.Context ctx) {
        this.itemRenderer = ctx.getItemRenderer();
    }
}
