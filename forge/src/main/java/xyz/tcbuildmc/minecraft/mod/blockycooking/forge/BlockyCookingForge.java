package xyz.tcbuildmc.minecraft.mod.blockycooking.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import xyz.tcbuildmc.minecraft.mod.blockycooking.BlockyCooking;

@Mod(BlockyCooking.MOD_ID)
public final class BlockyCookingForge {
    public BlockyCookingForge(Dist dist) {
        EventBuses.registerModEventBus(BlockyCooking.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        BlockyCooking.init();

        if (dist.isClient()) {
            BlockyCooking.initClient();
        }
    }
}
