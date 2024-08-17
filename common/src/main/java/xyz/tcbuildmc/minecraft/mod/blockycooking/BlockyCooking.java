package xyz.tcbuildmc.minecraft.mod.blockycooking;

import dev.architectury.event.events.client.ClientLifecycleEvent;
import dev.architectury.platform.Platform;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.ModBlockEntityTypes;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.ModBlocks;
import xyz.tcbuildmc.minecraft.mod.blockycooking.client.screen.ModScreens;
import xyz.tcbuildmc.minecraft.mod.blockycooking.item.ModFoodComponents;
import xyz.tcbuildmc.minecraft.mod.blockycooking.item.ModItemGroups;
import xyz.tcbuildmc.minecraft.mod.blockycooking.item.ModItems;
import xyz.tcbuildmc.minecraft.mod.blockycooking.screen.ModScreenHandlerTypes;
import xyz.tcbuildmc.minecraft.mod.blockycooking.tag.ModTags;

public final class BlockyCooking {
    public static final String MOD_ID = "blockycooking";
    public static final String MOD_NAME = "BlockyCooking Mod";
    public static final String MOD_VERSION = Platform.getMod(MOD_ID).getVersion();
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static void init() {
        ModBlocks.register();

        ModBlockEntityTypes.register();
        ModScreenHandlerTypes.register();

        ModFoodComponents.register();
        ModItems.register();
        ModItemGroups.register();

        ModTags.register();
    }

    @Environment(EnvType.CLIENT)
    public static void initClient() {
        // refer to https://github.com/CottonMC/LibGui/issues/129
//        ClientLifecycleEvent.CLIENT_SETUP.register(client -> {
//        });
        ModScreens.register();
    }
}
