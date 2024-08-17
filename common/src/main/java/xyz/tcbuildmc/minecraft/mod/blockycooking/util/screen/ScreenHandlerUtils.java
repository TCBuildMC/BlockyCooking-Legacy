package xyz.tcbuildmc.minecraft.mod.blockycooking.util.screen;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import xyz.tcbuildmc.minecraft.mod.blockycooking.mixin.access.ScreenHandlerAccessor;

public class ScreenHandlerUtils {
    public static void addPlayerInventorySlots(ScreenHandler handler, PlayerInventory playerInventory) {
        ScreenHandlerAccessor screenHandlerAccess = (ScreenHandlerAccessor) handler;
        int i, j;

        for (i = 0; i < 3; ++i) {
            for (j = 0; j < 9; ++j) {
                screenHandlerAccess.invokeAddSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
    }

    public static void addPlayerHotbarSlots(ScreenHandler handler, PlayerInventory playerInventory) {
        ScreenHandlerAccessor screenHandlerAccess = (ScreenHandlerAccessor) handler;
        int i;

        for (i = 0; i < 9; ++i) {
            screenHandlerAccess.invokeAddSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }
}
