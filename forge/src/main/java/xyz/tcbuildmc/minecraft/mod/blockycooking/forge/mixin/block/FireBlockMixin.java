package xyz.tcbuildmc.minecraft.mod.blockycooking.forge.mixin.block;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import net.minecraft.block.Block;
import net.minecraft.block.FireBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import xyz.tcbuildmc.minecraft.mod.blockycooking.registry.block.FlammableRegistry;
import xyz.tcbuildmc.minecraft.mod.blockycooking.registry.block.forge.FlammableRegistryImpl;

@Mixin(FireBlock.class)
public abstract class FireBlockMixin {
    @Redirect(
            method = "getSpreadChance",
            at = @At(
                    value = "INVOKE",
                    target = "Lit/unimi/dsi/fastutil/objects/Object2IntMap;getInt(Ljava/lang/Object;)I",
                    remap = false
            )
    )
    private int flammableRegistryImpl$getSpreadChance(Object2IntMap<Block> instance, Object o) {
        FlammableRegistry.Entry entry = FlammableRegistryImpl.ENTRIES.getOrDefault((Block) o, FlammableRegistry.Entry.EMPTY);

        if (!entry.isEmpty()) {
            return entry.spreadChance();
        }

        return instance.getInt(o);
    }

    @Redirect(
            method = "getBurnChance(Lnet/minecraft/block/BlockState;)I",
            at = @At(
                    value = "INVOKE",
                    target = "Lit/unimi/dsi/fastutil/objects/Object2IntMap;getInt(Ljava/lang/Object;)I",
                    remap = false
            )
    )
    private int flammableRegistryImpl$getBurnChance(Object2IntMap<Block> instance, Object o) {
        FlammableRegistry.Entry entry = FlammableRegistryImpl.ENTRIES.getOrDefault((Block) o, FlammableRegistry.Entry.EMPTY);

        if (!entry.isEmpty()) {
            return entry.burnChance();
        }

        return instance.getInt(o);
    }
}
