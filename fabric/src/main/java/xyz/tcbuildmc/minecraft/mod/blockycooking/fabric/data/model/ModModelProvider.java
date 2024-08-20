package xyz.tcbuildmc.minecraft.mod.blockycooking.fabric.data.model;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.ModBlocks;
import xyz.tcbuildmc.minecraft.mod.blockycooking.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerNorthDefaultHorizontalRotated(ModBlocks.FISH_TRAP.get(), TexturedModel.ORIENTABLE);

        blockStateModelGenerator.registerLog(ModBlocks.TEA_TREE_LOG.get())
                .log(ModBlocks.TEA_TREE_LOG.get())
                .wood(ModBlocks.TEA_TREE_WOOD.get());
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_TEA_TREE_LOG.get())
                .log(ModBlocks.STRIPPED_TEA_TREE_LOG.get())
                .wood(ModBlocks.STRIPPED_TEA_TREE_WOOD.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TEA_TREE_PLANK.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TEA_TREE_LEAVES.get());
        blockStateModelGenerator.registerTintableCross(ModBlocks.TEA_TREE_SAPLING.get(), BlockStateModelGenerator.TintType.NOT_TINTED);
//        blockStateModelGenerator.registerDispenserLikeOrientable();
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TREASURE_WEB.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.BREAD_CRUMB.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_BEEF_SKEWER.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.ROASTED_BEEF_SKEWER.get(), Models.GENERATED);
    }
}
