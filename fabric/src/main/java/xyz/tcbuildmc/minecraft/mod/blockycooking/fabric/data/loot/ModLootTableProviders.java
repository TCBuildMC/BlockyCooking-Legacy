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
            addDrop(ModBlocks.TEA_TREE_LOG.get(), ModItems.TEA_TREE_LOG.get());
            addDrop(ModBlocks.TEA_TREE_WOOD.get(), ModItems.TEA_TREE_WOOD.get());
            addDrop(ModBlocks.STRIPPED_TEA_TREE_LOG.get(), ModItems.STRIPPED_TEA_TREE_LOG.get());
            addDrop(ModBlocks.STRIPPED_TEA_TREE_WOOD.get(), ModItems.STRIPPED_TEA_TREE_WOOD.get());
            addDrop(ModBlocks.TEA_TREE_PLANK.get(), ModItems.TEA_TREE_PLANK.get());
            addDrop(ModBlocks.TEA_TREE_LEAVES.get(), leavesDrops(ModBlocks.TEA_TREE_LEAVES.get(), ModBlocks.TEA_TREE_SAPLING.get(), 0.2f));
            addDrop(ModBlocks.TEA_TREE_SAPLING.get(), ModItems.TEA_TREE_SAPLING.get());
        }
    }
}
