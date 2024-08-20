package xyz.tcbuildmc.minecraft.mod.blockycooking.world.feature.placed;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import xyz.tcbuildmc.minecraft.mod.blockycooking.BlockyCooking;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.ModBlocks;
import xyz.tcbuildmc.minecraft.mod.blockycooking.world.feature.configured.ModConfiguredFeatures;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> TEA_TREE_PLACED_KEY = registryKey("tea_tree_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        PlacedFeatures.register(context,
                TEA_TREE_PLACED_KEY,
                registryLookup.getOrThrow(ModConfiguredFeatures.TEA_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 1),
                        ModBlocks.TEA_TREE_SAPLING.get()));
    }

    public static RegistryKey<PlacedFeature> registryKey(String id) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BlockyCooking.MOD_ID, id));
    }
}
