package xyz.tcbuildmc.minecraft.mod.blockycooking.fabric.data.recipe;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import xyz.tcbuildmc.minecraft.mod.blockycooking.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BREAD_CRUMB.get(), 4)
                .input(Items.BREAD)
                .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.RAW_BEEF_SKEWER.get(), 1)
                .input(Items.BEEF)
                .criterion(hasItem(Items.BEEF), conditionsFromItem(Items.BEEF))
                .offerTo(exporter);

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(ModItems.RAW_BEEF_SKEWER.get()),
                RecipeCategory.FOOD,
                ModItems.ROASTED_BEEF_SKEWER.get(),
                0.35F,
                600)
                .criterion(hasItem(ModItems.RAW_BEEF_SKEWER.get()), conditionsFromItem(ModItems.RAW_BEEF_SKEWER.get()))
                .offerTo(exporter);
    }
}
