package xyz.tcbuildmc.minecraft.mod.blockycooking.world.generation.tree;

import dev.architectury.registry.level.biome.BiomeModifications;
import net.minecraft.world.gen.GenerationStep;
import xyz.tcbuildmc.minecraft.mod.blockycooking.tag.ModTags;
import xyz.tcbuildmc.minecraft.mod.blockycooking.world.feature.placed.ModPlacedFeatures;

public class ModTreeGeneration {
    public static void register() {
        BiomeModifications.addProperties(biomeContext -> biomeContext.hasTag(ModTags.TEA_TREE_BIOMES),
                (biomeContext, mutable) -> mutable.getGenerationProperties()
                        .addFeature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.TEA_TREE_PLACED_KEY));
    }
}
