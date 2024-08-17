package xyz.tcbuildmc.minecraft.mod.blockycooking.client.screen;

import dev.architectury.registry.menu.MenuRegistry;
import xyz.tcbuildmc.minecraft.mod.blockycooking.screen.ModScreenHandlerTypes;

public class ModScreens {
    public static void register() {
        MenuRegistry.registerScreenFactory(ModScreenHandlerTypes.FISH_TRAP.get(), FishTrapScreen::new);
    }
}
