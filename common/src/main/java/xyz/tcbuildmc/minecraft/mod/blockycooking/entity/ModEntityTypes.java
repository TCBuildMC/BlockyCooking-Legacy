package xyz.tcbuildmc.minecraft.mod.blockycooking.entity;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.RegistryKeys;
import xyz.tcbuildmc.minecraft.mod.blockycooking.BlockyCooking;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(BlockyCooking.MOD_ID, RegistryKeys.ENTITY_TYPE);

    public static void register() {
        ENTITY_TYPES.register();
    }
}
