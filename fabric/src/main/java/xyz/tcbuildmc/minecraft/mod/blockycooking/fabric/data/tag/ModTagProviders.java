package xyz.tcbuildmc.minecraft.mod.blockycooking.fabric.data.tag;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.ModBlocks;
import xyz.tcbuildmc.minecraft.mod.blockycooking.item.ModItems;
import xyz.tcbuildmc.minecraft.mod.blockycooking.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModTagProviders {
    public static final class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
        public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        public void configure(RegistryWrapper.WrapperLookup arg) {
            getOrCreateTagBuilder(ModTags.BREAD_CRUMBS)
                    .add(ModItems.BREAD_CRUMB.get());
            getOrCreateTagBuilder(ModTags.FISH_TRAP_BAITS)
                    .addTag(ModTags.BREAD_CRUMBS)
                    .add(ModItems.TREASURE_WEB.get());
            getOrCreateTagBuilder(ModTags.TEA_TREE_LOGS_ITEM)
                    .add(ModItems.TEA_TREE_LOG.get())
                    .add(ModItems.TEA_TREE_WOOD.get())
                    .add(ModItems.STRIPPED_TEA_TREE_LOG.get())
                    .add(ModItems.STRIPPED_TEA_TREE_WOOD.get());
            getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                    .addTag(ModTags.TEA_TREE_LOGS_ITEM);
            getOrCreateTagBuilder(ItemTags.PLANKS)
                    .add(ModItems.TEA_TREE_PLANK.get());
            getOrCreateTagBuilder(ItemTags.LEAVES)
                    .add(ModItems.TEA_TREE_LEAVES.get());
            getOrCreateTagBuilder(ItemTags.SAPLINGS)
                    .add(ModItems.TEA_TREE_SAPLING.get());
        }
    }

    public static final class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
        public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        public void configure(RegistryWrapper.WrapperLookup arg) {
            getOrCreateTagBuilder(ModTags.TEA_TREE_LOGS_BLOCK)
                    .add(ModBlocks.TEA_TREE_LOG.get())
                    .add(ModBlocks.TEA_TREE_WOOD.get())
                    .add(ModBlocks.STRIPPED_TEA_TREE_LOG.get())
                    .add(ModBlocks.STRIPPED_TEA_TREE_WOOD.get());
            getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                    .addTag(ModTags.TEA_TREE_LOGS_BLOCK);
            getOrCreateTagBuilder(BlockTags.PLANKS)
                    .add(ModBlocks.TEA_TREE_PLANK.get());
            getOrCreateTagBuilder(BlockTags.LEAVES)
                    .add(ModBlocks.TEA_TREE_LEAVES.get());
            getOrCreateTagBuilder(BlockTags.SAPLINGS)
                    .add(ModBlocks.TEA_TREE_SAPLING.get());
        }
    }
}
