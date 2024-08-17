package xyz.tcbuildmc.minecraft.mod.blockycooking.item;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import xyz.tcbuildmc.minecraft.mod.blockycooking.BlockyCooking;

public class ModItemGroups {
    public static final DeferredRegister<ItemGroup> GROUPS = DeferredRegister.create(BlockyCooking.MOD_ID, RegistryKeys.ITEM_GROUP);

    public static final RegistrySupplier<ItemGroup> MAIN_GROUP;

    static {
        MAIN_GROUP = GROUPS.register("main_group", () ->
                CreativeTabRegistry.create(
                        Text.translatable("itemGroup.blockycooking.main_group"),
                        () -> new ItemStack(Items.WHEAT)));
    }

    public static void register() {
        GROUPS.register();
    }
}
