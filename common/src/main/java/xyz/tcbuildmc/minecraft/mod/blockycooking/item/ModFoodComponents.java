package xyz.tcbuildmc.minecraft.mod.blockycooking.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    // TODO: Add food components
//    public static final FoodComponent PASTA = new FoodComponent.Builder()
//            .build();
//
//    public static final FoodComponent BURGER = new FoodComponent.Builder()
//            .build();
    public static final FoodComponent RAW_BEEF_SKEWER = new FoodComponent.Builder()
            .saturationModifier(0.1f)
            .hunger(2)
            .meat()
            .build();
    public static final FoodComponent ROASTED_BEEF_SKEWER = new FoodComponent.Builder()
            .saturationModifier(0.5f)
            .hunger(4)
            .arch$effect(() -> new StatusEffectInstance(StatusEffects.SATURATION, 60, 2), 1.0f)
            .meat()
            .build();
    public static final FoodComponent RAW_MUTTON_SKEWER = new FoodComponent.Builder()
            .saturationModifier(0.1f)
            .hunger(2)
            .meat()
            .build();
    public static final FoodComponent ROASTED_MUTTON_SKEWER = new FoodComponent.Builder()
            .saturationModifier(0.6f)
            .hunger(7)
            .arch$effect(() -> new StatusEffectInstance(StatusEffects.SATURATION, 80, 2), 1.0f)
            .meat()
            .build();

    public static void register() {
    }
}
