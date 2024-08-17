package xyz.tcbuildmc.minecraft.mod.blockycooking.screen;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandlerType;
import xyz.tcbuildmc.minecraft.mod.blockycooking.BlockyCooking;

public class ModScreenHandlerTypes {
    public static final DeferredRegister<ScreenHandlerType<?>> SCREEN_HANDLERS = DeferredRegister.create(BlockyCooking.MOD_ID, RegistryKeys.SCREEN_HANDLER);

    public static final RegistrySupplier<ScreenHandlerType<FishTrapScreenHandler>> FISH_TRAP;

    static {
        FISH_TRAP = SCREEN_HANDLERS.register("fish_trap", () -> new ScreenHandlerType<>(FishTrapScreenHandler::new, FeatureFlags.VANILLA_FEATURES));
    }

    public static void register() {
        SCREEN_HANDLERS.register();
    }
}
