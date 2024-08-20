package xyz.tcbuildmc.minecraft.mod.blockycooking.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Rarity;
import xyz.tcbuildmc.minecraft.mod.blockycooking.BlockyCooking;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.ModBlocks;
import xyz.tcbuildmc.minecraft.mod.blockycooking.item.machine.TreasureWebItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BlockyCooking.MOD_ID, RegistryKeys.ITEM);

    // TODO: Add items
//    public static final RegistrySupplier<Item> PASTA;
//    public static final RegistrySupplier<Item> POTATO_SOUP;
//    public static final RegistrySupplier<Item> BEEF_STEW;
//    public static final RegistrySupplier<Item> CHICKEN_SOUP;
//    public static final RegistrySupplier<Item> PIZZA;
//    public static final RegistrySupplier<Item> APPLE_PIE;
//    public static final RegistrySupplier<Item> CORN, STRAWBERRIES;

    public static final RegistrySupplier<Item> FISH_TRAP;
    public static final RegistrySupplier<Item> TREASURE_WEB;
    public static final RegistrySupplier<Item> BREAD_CRUMB;

    public static final RegistrySupplier<Item> RAW_BEEF_SKEWER;
    public static final RegistrySupplier<Item> ROASTED_BEEF_SKEWER;
    public static final RegistrySupplier<Item> RAW_MUTTON_SKEWER;
    public static final RegistrySupplier<Item> ROASTED_MUTTON_SKEWER;

    public static final RegistrySupplier<Item> TEA_TREE_LOG;
    public static final RegistrySupplier<Item> TEA_TREE_WOOD;
    public static final RegistrySupplier<Item> STRIPPED_TEA_TREE_LOG;
    public static final RegistrySupplier<Item> STRIPPED_TEA_TREE_WOOD;
    public static final RegistrySupplier<Item> TEA_TREE_PLANK;
    public static final RegistrySupplier<Item> TEA_TREE_LEAVES;
    public static final RegistrySupplier<Item> TEA_TREE_SAPLING;

    static {
        FISH_TRAP = ITEMS.register("fish_trap", () -> new BlockItem(ModBlocks.FISH_TRAP.get(),
                new Item.Settings().maxCount(64).arch$tab(ModItemGroups.MAIN_GROUP)));
        TREASURE_WEB = ITEMS.register("treasure_web", () -> new TreasureWebItem(
                new Item.Settings().maxCount(64).arch$tab(ModItemGroups.MAIN_GROUP).rarity(Rarity.RARE)));
        BREAD_CRUMB = ITEMS.register("bread_crumb", () -> new Item(
                new Item.Settings().maxCount(64).arch$tab(ModItemGroups.MAIN_GROUP)));
        RAW_BEEF_SKEWER = ITEMS.register("raw_beef_skewer", () -> new Item(
                new Item.Settings().maxCount(64).food(ModFoodComponents.RAW_BEEF_SKEWER).arch$tab(ModItemGroups.MAIN_GROUP)));
        ROASTED_BEEF_SKEWER = ITEMS.register("roasted_beef_skewer", () -> new Item(
                new Item.Settings().maxCount(64).food(ModFoodComponents.ROASTED_BEEF_SKEWER).arch$tab(ModItemGroups.MAIN_GROUP)));
        RAW_MUTTON_SKEWER = ITEMS.register("raw_mutton_skewer", () -> new Item(
                new Item.Settings().maxCount(64).food(ModFoodComponents.RAW_MUTTON_SKEWER).arch$tab(ModItemGroups.MAIN_GROUP)));
        ROASTED_MUTTON_SKEWER = ITEMS.register("roasted_mutton_skewer", () -> new Item(
                new Item.Settings().maxCount(64).food(ModFoodComponents.ROASTED_MUTTON_SKEWER).arch$tab(ModItemGroups.MAIN_GROUP)));
        TEA_TREE_LOG = ITEMS.register("tea_tree_log", () -> new BlockItem(ModBlocks.TEA_TREE_LOG.get(),
                new Item.Settings().maxCount(64).arch$tab(ModItemGroups.MAIN_GROUP)));
        TEA_TREE_WOOD = ITEMS.register("tea_tree_wood", () -> new BlockItem(ModBlocks.TEA_TREE_WOOD.get(),
                new Item.Settings().maxCount(64).arch$tab(ModItemGroups.MAIN_GROUP)));
        STRIPPED_TEA_TREE_LOG = ITEMS.register("stripped_tea_tree_log", () -> new BlockItem(ModBlocks.STRIPPED_TEA_TREE_LOG.get(),
                new Item.Settings().maxCount(64).arch$tab(ModItemGroups.MAIN_GROUP)));
        STRIPPED_TEA_TREE_WOOD = ITEMS.register("stripped_tea_tree_wood", () -> new BlockItem(ModBlocks.STRIPPED_TEA_TREE_WOOD.get(),
                new Item.Settings().maxCount(64).arch$tab(ModItemGroups.MAIN_GROUP)));
        TEA_TREE_PLANK = ITEMS.register("tea_tree_plank", () -> new BlockItem(ModBlocks.TEA_TREE_PLANK.get(),
                new Item.Settings().maxCount(64).arch$tab(ModItemGroups.MAIN_GROUP)));
        TEA_TREE_LEAVES = ITEMS.register("tea_tree_leaves", () -> new BlockItem(ModBlocks.TEA_TREE_LEAVES.get(),
                new Item.Settings().maxCount(64).arch$tab(ModItemGroups.MAIN_GROUP)));
        TEA_TREE_SAPLING = ITEMS.register("tea_tree_sapling", () -> new BlockItem(ModBlocks.TEA_TREE_SAPLING.get(),
                new Item.Settings().maxCount(64).arch$tab(ModItemGroups.MAIN_GROUP)));
    }

    public static void register() {
        ITEMS.register();
    }
}
