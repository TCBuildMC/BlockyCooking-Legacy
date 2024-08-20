package xyz.tcbuildmc.minecraft.mod.blockycooking;

import dev.architectury.platform.Platform;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.entity.ModBlockEntityTypes;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.ModBlocks;
import xyz.tcbuildmc.minecraft.mod.blockycooking.client.block.ModBlockRenderLayerMaps;
import xyz.tcbuildmc.minecraft.mod.blockycooking.client.block.entity.renderer.ModBlockEntityRenderers;
import xyz.tcbuildmc.minecraft.mod.blockycooking.client.screen.ModScreens;
import xyz.tcbuildmc.minecraft.mod.blockycooking.entity.ModEntityTypes;
import xyz.tcbuildmc.minecraft.mod.blockycooking.item.ModFoodComponents;
import xyz.tcbuildmc.minecraft.mod.blockycooking.item.ModItemGroups;
import xyz.tcbuildmc.minecraft.mod.blockycooking.item.ModItems;
import xyz.tcbuildmc.minecraft.mod.blockycooking.recipe.ModRecipeSerializers;
import xyz.tcbuildmc.minecraft.mod.blockycooking.recipe.ModRecipeTypes;
import xyz.tcbuildmc.minecraft.mod.blockycooking.screen.ModScreenHandlerTypes;
import xyz.tcbuildmc.minecraft.mod.blockycooking.stat.ModCustomStats;
import xyz.tcbuildmc.minecraft.mod.blockycooking.tag.ModTags;
import xyz.tcbuildmc.minecraft.mod.blockycooking.villager.ModVillagerTrades;
import xyz.tcbuildmc.minecraft.mod.blockycooking.world.generation.ModWorldGeneration;

public final class BlockyCooking {
    public static final String MOD_ID = "blockycooking";
    public static final String MOD_NAME = "BlockyCooking Mod";
    public static final String MOD_VERSION = Platform.getMod(MOD_ID).getVersion();
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static void init() {
        ModBlocks.register();
        ModBlockEntityTypes.register();
        ModScreenHandlerTypes.register();

        ModEntityTypes.register();

        ModFoodComponents.register();
        ModItems.register();
        ModItemGroups.register();

        ModTags.register();
        ModWorldGeneration.register();
        ModVillagerTrades.register();
        ModRecipeSerializers.register();
        ModRecipeTypes.register();
        ModCustomStats.register();
    }

    @Environment(EnvType.CLIENT)
    public static void initClient() {
        // refer to https://github.com/CottonMC/LibGui/issues/129
//        ClientLifecycleEvent.CLIENT_SETUP.register(client -> {
//        });
        ModScreens.register();
        ModBlockEntityRenderers.register();
        ModBlockRenderLayerMaps.register();
    }
}
