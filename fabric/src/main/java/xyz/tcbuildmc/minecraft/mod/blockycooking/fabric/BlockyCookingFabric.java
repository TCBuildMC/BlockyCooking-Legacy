package xyz.tcbuildmc.minecraft.mod.blockycooking.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import xyz.tcbuildmc.minecraft.mod.blockycooking.BlockyCooking;

public final class BlockyCookingFabric implements ModInitializer, ClientModInitializer {
    @Override
    public void onInitialize() {
        BlockyCooking.init();
    }

    @Environment(EnvType.CLIENT)
    @Override
    public void onInitializeClient() {
        BlockyCooking.initClient();
    }
}
