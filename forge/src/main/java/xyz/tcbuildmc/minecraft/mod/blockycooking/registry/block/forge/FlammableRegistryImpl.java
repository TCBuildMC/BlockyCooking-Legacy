package xyz.tcbuildmc.minecraft.mod.blockycooking.registry.block.forge;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.TagKey;
import xyz.tcbuildmc.minecraft.mod.blockycooking.registry.block.FlammableRegistry;

import java.util.LinkedHashMap;
import java.util.Map;

public final class FlammableRegistryImpl {
    public static final Map<Block, FlammableRegistry.Entry> ENTRIES = new LinkedHashMap<>();

    public static void register(Block block, FlammableRegistry.Entry entry) {
        ENTRIES.put(block, entry);
    }

    public static void register(TagKey<Block> blockTag, FlammableRegistry.Entry entry) {
        for (RegistryEntry<Block> blockEntry : Registries.BLOCK.iterateEntries(blockTag)) {
            ENTRIES.put(blockEntry.value(), entry);
        }
    }

    public static void unregister(Block block) {
        ENTRIES.put(block, FlammableRegistry.Entry.EMPTY);
    }

    public static void unregister(TagKey<Block> blockTag) {
        for (RegistryEntry<Block> blockEntry : Registries.BLOCK.iterateEntries(blockTag)) {
            ENTRIES.put(blockEntry.value(), FlammableRegistry.Entry.EMPTY);
        }
    }
}
