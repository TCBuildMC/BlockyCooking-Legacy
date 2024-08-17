package xyz.tcbuildmc.minecraft.mod.blockycooking.mixin.access;

import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(ScreenHandler.class)
public interface ScreenHandlerAccessor {
    @Invoker("addSlot")
    Slot invokeAddSlot(Slot slot);
}
