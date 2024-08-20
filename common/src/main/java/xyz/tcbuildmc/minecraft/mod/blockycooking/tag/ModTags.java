package xyz.tcbuildmc.minecraft.mod.blockycooking.tag;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import xyz.tcbuildmc.minecraft.mod.blockycooking.BlockyCooking;

public class ModTags {
    public static final TagKey<Item> BREAD_CRUMBS;
    public static final TagKey<Item> FISH_TRAP_BAITS;
    public static final TagKey<Biome> TEA_TREE_BIOMES;
    public static final TagKey<Item> TEA_TREE_LOGS_ITEM;
    public static final TagKey<Block> TEA_TREE_LOGS_BLOCK;

    static {
        BREAD_CRUMBS = TagKey.of(RegistryKeys.ITEM, new Identifier(BlockyCooking.MOD_ID, "bread_crumbs"));
        FISH_TRAP_BAITS = TagKey.of(RegistryKeys.ITEM, new Identifier(BlockyCooking.MOD_ID, "fish_trap_baits"));
        TEA_TREE_BIOMES = TagKey.of(RegistryKeys.BIOME, new Identifier(BlockyCooking.MOD_ID, "tea_tree_biome"));
        TEA_TREE_LOGS_ITEM = TagKey.of(RegistryKeys.ITEM, new Identifier(BlockyCooking.MOD_ID, "tea_tree_logs"));
        TEA_TREE_LOGS_BLOCK = TagKey.of(RegistryKeys.BLOCK, new Identifier(BlockyCooking.MOD_ID, "tea_tree_logs"));
    }

    public static void register() {
    }
}
