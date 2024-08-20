package xyz.tcbuildmc.minecraft.mod.blockycooking.block;

import dev.architectury.hooks.item.tool.AxeItemHooks;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.*;
import net.minecraft.registry.RegistryKeys;
import xyz.tcbuildmc.minecraft.mod.blockycooking.BlockyCooking;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.machine.FishTrapBlock;
import xyz.tcbuildmc.minecraft.mod.blockycooking.registry.block.FlammableRegistry;
import xyz.tcbuildmc.minecraft.mod.blockycooking.world.tree.TeaTreeGenerator;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BlockyCooking.MOD_ID, RegistryKeys.BLOCK);

    public static final RegistrySupplier<Block> FISH_TRAP;

    public static final RegistrySupplier<Block> TEA_TREE_LOG;
    public static final RegistrySupplier<Block> TEA_TREE_WOOD;
    public static final RegistrySupplier<Block> STRIPPED_TEA_TREE_LOG;
    public static final RegistrySupplier<Block> STRIPPED_TEA_TREE_WOOD;
    public static final RegistrySupplier<Block> TEA_TREE_PLANK;
    public static final RegistrySupplier<Block> TEA_TREE_LEAVES;
    public static final RegistrySupplier<Block> TEA_TREE_SAPLING;

    static {
        FISH_TRAP = BLOCKS.register("fish_trap", () -> new FishTrapBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

        TEA_TREE_LOG = BLOCKS.register("tea_tree_log", () -> new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
        TEA_TREE_WOOD = BLOCKS.register("tea_tree_wood", () -> new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
        STRIPPED_TEA_TREE_LOG = BLOCKS.register("stripped_tea_tree_log", () -> new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
        STRIPPED_TEA_TREE_WOOD = BLOCKS.register("stripped_tea_tree_wood", () -> new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
        TEA_TREE_PLANK = BLOCKS.register("tea_tree_plank", () -> new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
        TEA_TREE_LEAVES = BLOCKS.register("tea_tree_leaves", () -> new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
        TEA_TREE_SAPLING = BLOCKS.register("tea_tree_sapling", () -> new SaplingBlock(new TeaTreeGenerator(),
                AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    }

    @SuppressWarnings("UnreachableCode")
    public static void register() {
        BLOCKS.register();
        
        FlammableRegistry.register(TEA_TREE_LOG.get(), new FlammableRegistry.Entry(5, 5));
        FlammableRegistry.register(TEA_TREE_WOOD.get(), new FlammableRegistry.Entry(5, 5));
        FlammableRegistry.register(STRIPPED_TEA_TREE_LOG.get(), new FlammableRegistry.Entry(5, 5));
        FlammableRegistry.register(STRIPPED_TEA_TREE_WOOD.get(), new FlammableRegistry.Entry(5, 5));
        FlammableRegistry.register(TEA_TREE_PLANK.get(), new FlammableRegistry.Entry(30, 60));
        FlammableRegistry.register(TEA_TREE_LEAVES.get(), new FlammableRegistry.Entry(5, 20));

        AxeItemHooks.addStrippable(TEA_TREE_LOG.get(), STRIPPED_TEA_TREE_LOG.get());
        AxeItemHooks.addStrippable(TEA_TREE_WOOD.get(), STRIPPED_TEA_TREE_WOOD.get());
    }
}
