package xyz.tcbuildmc.minecraft.mod.blockycooking.villager;

import dev.architectury.registry.level.entity.trade.SimpleTrade;
import dev.architectury.registry.level.entity.trade.TradeRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;
import xyz.tcbuildmc.minecraft.mod.blockycooking.item.ModItems;

public class ModVillagerTrades {
    public static void register() {
        TradeRegistry.registerVillagerTrade(VillagerProfession.FISHERMAN,
                4,
                sellToPlayer(12,
                        new ItemStack(ModItems.TREASURE_WEB.get(), 1),
                        16,
                        2,
                        0.05F));
    }

    public static TradeOffers.Factory sellToPlayer(int emeraldCost, ItemStack result, int maxTradeTime, int xp, float priceMultiplier) {
        return sellToPlayer(emeraldCost, ItemStack.EMPTY, result, maxTradeTime, xp, priceMultiplier);
    }

    public static TradeOffers.Factory sellToPlayer(int emeraldCost, ItemStack another, ItemStack result, int maxTradeTime, int xp, float priceMultiplier) {
        return new SimpleTrade(new ItemStack(Items.EMERALD, emeraldCost), another, result, maxTradeTime, xp, priceMultiplier);
    }

    public static TradeOffers.Factory buyFromPlayer(ItemStack input, int emeraldCast, int maxTradeTime, int xp, float priceMultiplier) {
        return new SimpleTrade(input, ItemStack.EMPTY, new ItemStack(Items.EMERALD, emeraldCast), maxTradeTime, xp, priceMultiplier);
    }
}
