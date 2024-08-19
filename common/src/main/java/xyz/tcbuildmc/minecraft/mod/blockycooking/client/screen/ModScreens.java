package xyz.tcbuildmc.minecraft.mod.blockycooking.client.screen;

import dev.architectury.registry.menu.MenuRegistry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import xyz.tcbuildmc.minecraft.mod.blockycooking.screen.ModScreenHandlerTypes;

@Environment(EnvType.CLIENT)
public class ModScreens {
    public static void register() {
        MenuRegistry.registerScreenFactory(ModScreenHandlerTypes.FISH_TRAP.get(), FishTrapScreen::new);
    }
}
