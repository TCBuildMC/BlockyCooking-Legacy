package xyz.tcbuildmc.minecraft.mod.blockycooking.stat;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;
import xyz.tcbuildmc.minecraft.mod.blockycooking.BlockyCooking;

public class ModCustomStats {
    public static final DeferredRegister<Identifier> CUSTOM_STATS = DeferredRegister.create(BlockyCooking.MOD_ID, RegistryKeys.CUSTOM_STAT);

    public static final RegistrySupplier<Identifier> INTERACT_WITH_FISH_TRAP;

    static {
        INTERACT_WITH_FISH_TRAP = CUSTOM_STATS.register("interact_with_fish_trap", () ->
                new Identifier(BlockyCooking.MOD_ID, "interact_with_fish_trap"));
    }

    public static void register() {
        CUSTOM_STATS.register();
        Stats.CUSTOM.getOrCreateStat(INTERACT_WITH_FISH_TRAP.get(), StatFormatter.DEFAULT);
    }
}
