package xyz.tcbuildmc.minecraft.mod.blockycooking.world.feature.configured;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BushFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import xyz.tcbuildmc.minecraft.mod.blockycooking.BlockyCooking;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.ModBlocks;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> TEA_TREE_KEY = registryKey("tea_tree");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        ConfiguredFeatures.register(context,
                TEA_TREE_KEY,
                Feature.TREE,
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(ModBlocks.TEA_TREE_LOG.get()),
                        new StraightTrunkPlacer(1, 0, 0),
                        BlockStateProvider.of(ModBlocks.TEA_TREE_LEAVES.get()),
                        new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
                        new TwoLayersFeatureSize(0, 0, 0))
                        .build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BlockyCooking.MOD_ID, id));
    }
}
