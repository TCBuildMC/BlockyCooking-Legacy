package xyz.tcbuildmc.minecraft.mod.blockycooking.registry.block.fabric;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.registry.tag.TagKey;
import xyz.tcbuildmc.minecraft.mod.blockycooking.registry.block.FlammableRegistry;

public final class FlammableRegistryImpl {
    public static void register(Block block, FlammableRegistry.Entry entry) {
        FlammableBlockRegistry.getDefaultInstance().add(block, entry.burnChance(), entry.spreadChance());
    }

    public static void register(TagKey<Block> blockTag, FlammableRegistry.Entry entry) {
        FlammableBlockRegistry.getDefaultInstance().add(blockTag, entry.burnChance(), entry.spreadChance());
    }

    public static void unregister(Block block) {
        FlammableBlockRegistry.getDefaultInstance().remove(block);
    }

    public static void unregister(TagKey<Block> blockTag) {
        FlammableBlockRegistry.getDefaultInstance().remove(blockTag);
    }
}
