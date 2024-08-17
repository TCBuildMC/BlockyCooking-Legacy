package xyz.tcbuildmc.minecraft.mod.blockycooking.item.machine;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public abstract class AbstractFishTrapBaitItem extends Item {
    public AbstractFishTrapBaitItem(Settings settings) {
        super(settings);
    }

    public abstract Identifier getLoot();

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.blockycooking.fish_trap_bait.usage"));
    }
}
