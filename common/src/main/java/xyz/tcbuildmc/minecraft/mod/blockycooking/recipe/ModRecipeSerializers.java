package xyz.tcbuildmc.minecraft.mod.blockycooking.recipe;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.registry.RegistryKeys;
import xyz.tcbuildmc.minecraft.mod.blockycooking.BlockyCooking;

public class ModRecipeSerializers {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(BlockyCooking.MOD_ID, RegistryKeys.RECIPE_SERIALIZER);

    static {
    }

    public static void register() {
        RECIPE_SERIALIZERS.register();
    }
}
