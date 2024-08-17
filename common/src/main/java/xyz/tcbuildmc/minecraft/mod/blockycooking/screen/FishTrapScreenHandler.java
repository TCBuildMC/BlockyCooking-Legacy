package xyz.tcbuildmc.minecraft.mod.blockycooking.screen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import xyz.tcbuildmc.minecraft.mod.blockycooking.screen.slot.FishTrapBaitSlot;
import xyz.tcbuildmc.minecraft.mod.blockycooking.util.screen.ScreenHandlerUtils;

public class FishTrapScreenHandler extends ScreenHandler {
    private final Inventory inventory;

    public FishTrapScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(10));
    }

    public FishTrapScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory) {
        super(ModScreenHandlerTypes.FISH_TRAP.get(), syncId);
        checkSize(inventory, 10);
        this.inventory = inventory;
        inventory.onOpen(playerInventory.player);

        this.addSlot(new FishTrapBaitSlot(inventory, 0, 124, 35));


        int i, j;
        for (i = 0; i < 3; ++i) {
            for (j = 0; j < 3; ++j) {
                this.addSlot(new Slot(inventory, j + i * 3 + 1, 30 + j * 18, 17 + i * 18));
            }
        }

        // Lazy :D
        ScreenHandlerUtils.addPlayerInventorySlots(this, playerInventory);
        ScreenHandlerUtils.addPlayerHotbarSlots(this, playerInventory);
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);

        if (slot != null && slot.hasStack()) {
            ItemStack baseStack = slot.getStack();
            newStack = baseStack.copy();

            if (invSlot < this.inventory.size()) {
                if (!this.insertItem(baseStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(baseStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (baseStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }

        return newStack;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }
}
