package xyz.tcbuildmc.minecraft.mod.blockycooking.world.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;
import xyz.tcbuildmc.minecraft.mod.blockycooking.world.feature.configured.ModConfiguredFeatures;

public class TeaTreeGenerator extends SaplingGenerator {
    @Nullable
    @Override
    public RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.TEA_TREE_KEY;
    }
}
