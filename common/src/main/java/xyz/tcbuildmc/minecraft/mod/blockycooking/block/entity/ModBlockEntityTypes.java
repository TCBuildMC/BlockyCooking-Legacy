package xyz.tcbuildmc.minecraft.mod.blockycooking.block.entity;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.datafixer.TypeReferences;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Util;
import xyz.tcbuildmc.minecraft.mod.blockycooking.BlockyCooking;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.ModBlocks;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.entity.machine.FishTrapBlockEntity;

public class ModBlockEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(BlockyCooking.MOD_ID, RegistryKeys.BLOCK_ENTITY_TYPE);

    public static final RegistrySupplier<BlockEntityType<FishTrapBlockEntity>> FISH_TRAP;

    static {
        FISH_TRAP = BLOCK_ENTITY_TYPES.register("fish_trap", () ->
                BlockEntityType.Builder.create(FishTrapBlockEntity::new, ModBlocks.FISH_TRAP.get())
                        .build(Util.getChoiceType(TypeReferences.BLOCK_ENTITY, "fish_trap")));
    }

    public static void register() {
        BLOCK_ENTITY_TYPES.register();
    }
}
