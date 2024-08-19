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
        RAW_MUTTON_SKEWER = ITEMS.register("raw_beef_skewer", () -> new Item(
                new Item.Settings().maxCount(64).food(ModFoodComponents.RAW_MUTTON_SKEWER).arch$tab(ModItemGroups.MAIN_GROUP)));
        ROASTED_MUTTON_SKEWER = ITEMS.register("roasted_beef_skewer", () -> new Item(
                new Item.Settings().maxCount(64).food(ModFoodComponents.ROASTED_MUTTON_SKEWER).arch$tab(ModItemGroups.MAIN_GROUP)));
    }

    public static void register() {
        ITEMS.register();
    }
}
