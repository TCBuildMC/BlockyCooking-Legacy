package xyz.tcbuildmc.minecraft.mod.blockycooking.block;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import xyz.tcbuildmc.minecraft.mod.blockycooking.BlockyCooking;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.machine.FishTrapBlock;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BlockyCooking.MOD_ID, RegistryKeys.BLOCK);

    public static final RegistrySupplier<Block> FISH_TRAP;

    static {
        FISH_TRAP = BLOCKS.register("fish_trap", () -> new FishTrapBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    }

    public static void register() {
        BLOCKS.register();
    }
}
