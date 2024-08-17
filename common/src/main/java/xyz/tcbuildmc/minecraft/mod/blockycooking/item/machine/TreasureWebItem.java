package xyz.tcbuildmc.minecraft.mod.blockycooking.item.machine;

import net.minecraft.loot.LootTables;
import net.minecraft.util.Identifier;

public class TreasureWebItem extends AbstractFishTrapBaitItem {
    public TreasureWebItem(Settings settings) {
        super(settings);
    }

    @Override
    public Identifier getLoot() {
        return LootTables.FISHING_TREASURE_GAMEPLAY;
    }
}
