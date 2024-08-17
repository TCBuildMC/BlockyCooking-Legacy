package xyz.tcbuildmc.minecraft.mod.blockycooking.tag;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import xyz.tcbuildmc.minecraft.mod.blockycooking.BlockyCooking;

public class ModTags {
    public static final TagKey<Item> BREAD_CRUMBS;
    public static final TagKey<Item> FISH_TRAP_BAITS;

    static {
        BREAD_CRUMBS = TagKey.of(RegistryKeys.ITEM, new Identifier(BlockyCooking.MOD_ID, "bread_crumbs"));
        FISH_TRAP_BAITS = TagKey.of(RegistryKeys.ITEM, new Identifier(BlockyCooking.MOD_ID, "fish_trap_baits"));
    }

    public static void register() {
    }
}
