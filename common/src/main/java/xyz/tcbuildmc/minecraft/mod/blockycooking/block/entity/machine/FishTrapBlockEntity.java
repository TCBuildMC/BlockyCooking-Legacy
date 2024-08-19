package xyz.tcbuildmc.minecraft.mod.blockycooking.block.entity.machine;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.entity.ModBlockEntityTypes;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.entity.InventoryBlockEntity;
import xyz.tcbuildmc.minecraft.mod.blockycooking.item.ModItems;
import xyz.tcbuildmc.minecraft.mod.blockycooking.screen.FishTrapScreenHandler;
import xyz.tcbuildmc.minecraft.mod.blockycooking.tag.ModTags;

public class FishTrapBlockEntity extends GUIBlockEntity {
    private final int inventorySize = 10;
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(this.inventorySize, ItemStack.EMPTY);

    public FishTrapBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.FISH_TRAP.get(), pos, state);
    }

    @Override
    public Text getContainerName() {
        return Text.translatable("container.blockycooking.fish_trap");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new FishTrapScreenHandler(syncId, playerInventory, this);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction dir) {
        if (dir == null) {
            return false;
        }

        return dir != Direction.DOWN && slot == 0 && stack.isIn(ModTags.FISH_TRAP_BAITS);
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction dir) {
        return slot != 0;
    }

    @Override
    public void tick(World world, BlockPos pos, BlockState state, InventoryBlockEntity blockEntity) {
        if (world.isClient()) {
            return;
        }

        if (!state.get(Properties.WATERLOGGED) || !world.isReceivingRedstonePower(pos)) {
            return;
        }

        Random random = world.getRandom();

        int enhance = 0;
        for (Direction value : Direction.values()) {
            if (world.getFluidState(pos.offset(value)).getFluid() == Fluids.WATER ||
                    world.getFluidState(pos.offset(value)).getFluid() == Fluids.FLOWING_WATER ||
                    world.getBlockState(pos).get(Properties.WATERLOGGED)) {
                enhance += 5;
            }
        }

        if (world.isThundering()) {
            enhance += 15;
        } else if (world.isRaining()) {
            enhance += 10;
        }

        if (random.nextInt(2000) <= 5 + enhance) {
            LootTable lootTable;
            ItemStack baitStack = super.getStack(0);

            if (baitStack.isIn(ModTags.FISH_TRAP_BAITS)) {
                if (baitStack.isIn(ModTags.BREAD_CRUMBS)) {
                    lootTable = ((ServerWorld) world).getServer().getLootManager().getLootTable(LootTables.FISHING_FISH_GAMEPLAY);

                    if (random.nextInt(90) >= 30) {  // 1/3
                        return;
                    }
                } else if (baitStack.isOf(ModItems.TREASURE_WEB.get())) {
                    lootTable = ((ServerWorld) world).getServer().getLootManager().getLootTable(LootTables.FISHING_TREASURE_GAMEPLAY);

                    if (random.nextInt(100) >= 20) {  // 1/5
                        return;
                    }
                } else {
                    lootTable = ((ServerWorld) world).getServer().getLootManager().getLootTable(LootTables.FISHING_GAMEPLAY);

                    if (random.nextInt(50) >= 25) {  // 1/2
                        return;
                    }
                }

                baitStack.decrement(1);
//                super.setStack(0, baitStack);
            } else {
                lootTable = ((ServerWorld) world).getServer().getLootManager().getLootTable(LootTables.FISHING_GAMEPLAY);

                if (random.nextInt(50) >= 25) {  // 1/2
                    return;
                }
            }

            world.playSound(null, pos, SoundEvents.ENTITY_FISHING_BOBBER_SPLASH, SoundCategory.BLOCKS, 1.0f, 1.0f);

            // refer to https://github.com/Snownee/SnowRealMagic/issues/162
            ObjectArrayList<ItemStack> loots = lootTable.generateLoot(new LootContextParameterSet.Builder((ServerWorld) world)
                    .add(LootContextParameters.ORIGIN, pos.toCenterPos())
                    .add(LootContextParameters.TOOL, new ItemStack(state.getBlock().asItem()))
                    .build(LootContextTypes.FISHING));

            // TODO: Optimization
            for (ItemStack loot : loots) {
                boolean b = false;
                int i;
                for (i = 1; i < super.size(); i++) {
                    ItemStack stack = super.getStack(i);

                    if (stack.getItem() == loot.getItem() && stack.getCount() + loot.getCount() <= stack.getMaxCount()) {
                        stack.increment(loot.getCount());
                        super.setStack(i, stack);
                        i = super.size();

                        b = true;
                    }
                }

                if (!b) {
                    for (i = 1; i < super.size(); i++) {
                        ItemStack stack = super.getStack(i);

                        if (stack.isEmpty()) {
                            super.setStack(i, loot);
                            i = super.size();
                        }
                    }
                }
            }

            markDirty(world, pos, state);
        }
    }
}
