package xyz.tcbuildmc.minecraft.mod.blockycooking.screen.slot;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import xyz.tcbuildmc.minecraft.mod.blockycooking.tag.ModTags;

public class FishTrapBaitSlot extends Slot {
    public FishTrapBaitSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.isIn(ModTags.FISH_TRAP_BAITS);
    }
}
