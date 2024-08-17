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
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(ModBlocks.FISH_TRAP.get(),
                TextureMap.sideTopBottom(ModBlocks.FISH_TRAP.get()));

//        blockStateModelGenerator.registerDispenserLikeOrientable();
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TREASURE_WEB.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.BREAD_CRUMB.get(), Models.GENERATED);
    }
}
