package xyz.tcbuildmc.minecraft.mod.blockycooking.util.screen;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

public class ScreenHandlerUtils {
    public static void addPlayerInventorySlots(ScreenHandler handler, PlayerInventory playerInventory) {
        int i, j;

        for (i = 0; i < 3; ++i) {
            for (j = 0; j < 9; ++j) {
                handler.addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
    }

    public static void addPlayerHotbarSlots(ScreenHandler handler, PlayerInventory playerInventory) {
        int i;

        for (i = 0; i < 9; ++i) {
            handler.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }
}
