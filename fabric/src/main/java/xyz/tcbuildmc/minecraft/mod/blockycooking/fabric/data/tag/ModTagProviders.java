package xyz.tcbuildmc.minecraft.mod.blockycooking.fabric.data.tag;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
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
        }
    }

    public static final class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
        public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        public void configure(RegistryWrapper.WrapperLookup arg) {
        }
    }
}
