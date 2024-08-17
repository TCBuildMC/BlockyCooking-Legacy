package xyz.tcbuildmc.minecraft.mod.blockycooking.fabric.data.loot;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.ModBlocks;
import xyz.tcbuildmc.minecraft.mod.blockycooking.item.ModItems;

public class ModLootTableProviders {
    public static final class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
        public ModBlockLootTableProvider(FabricDataOutput dataOutput) {
            super(dataOutput);
        }

        @Override
        public void generate() {
            addDrop(ModBlocks.FISH_TRAP.get(), ModItems.FISH_TRAP.get());
        }
    }
}
