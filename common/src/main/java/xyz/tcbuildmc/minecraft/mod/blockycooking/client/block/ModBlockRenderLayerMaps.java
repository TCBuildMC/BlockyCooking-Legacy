package xyz.tcbuildmc.minecraft.mod.blockycooking.client.block;

import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.RenderLayer;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.ModBlocks;

@Environment(EnvType.CLIENT)
public class ModBlockRenderLayerMaps {
    public static void register() {
        RenderTypeRegistry.register(RenderLayer.getCutout(), ModBlocks.TEA_TREE_LEAVES.get(), ModBlocks.TEA_TREE_SAPLING.get());
    }
}
