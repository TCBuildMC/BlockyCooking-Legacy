package xyz.tcbuildmc.minecraft.mod.blockycooking.recipe;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.RegistryKeys;
import xyz.tcbuildmc.minecraft.mod.blockycooking.BlockyCooking;

public class ModRecipeTypes {
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(BlockyCooking.MOD_ID, RegistryKeys.RECIPE_TYPE);


    static {
    }

    public static void register() {
        RECIPE_TYPES.register();
    }
}
