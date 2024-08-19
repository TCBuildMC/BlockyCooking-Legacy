package xyz.tcbuildmc.minecraft.mod.blockycooking.fabric.data.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import xyz.tcbuildmc.minecraft.mod.blockycooking.block.ModBlocks;
import xyz.tcbuildmc.minecraft.mod.blockycooking.item.ModItems;

public class ModLanguageProviders {
    public static final class ModEnglishLanguageProvider extends FabricLanguageProvider {
        public ModEnglishLanguageProvider(FabricDataOutput dataOutput) {
            super(dataOutput, "en_us");
        }

        @Override
        public void generateTranslations(TranslationBuilder translationBuilder) {
            translationBuilder.add(ModBlocks.FISH_TRAP.get(), "Fish Trap");

            translationBuilder.add(ModItems.BREAD_CRUMB.get(), "Bread Crumbs");
            translationBuilder.add(ModItems.TREASURE_WEB.get(), "Treasure Web");
            translationBuilder.add(ModItems.RAW_BEEF_SKEWER.get(), "Raw Beef Skewer");
            translationBuilder.add(ModItems.ROASTED_BEEF_SKEWER.get(), "Roast Beef Skewer");

            translationBuilder.add("tooltip.blockycooking.fish_trap_bait.usage", "Remember to put this into the Fish Trap Block.");

            translationBuilder.add("container.blockycooking.fish_trap", "Fish Trap");

            translationBuilder.add("itemGroup.blockycooking.main_group", "BlockyCooking Mod Main Item Group");
        }
    }

    public static final class ModSimplifiedChineseLanguageProvider extends FabricLanguageProvider {
        public ModSimplifiedChineseLanguageProvider(FabricDataOutput dataOutput) {
            super(dataOutput, "zh_cn");
        }

        @Override
        public void generateTranslations(TranslationBuilder translationBuilder) {
            translationBuilder.add(ModBlocks.FISH_TRAP.get(), "捕鱼器");

            translationBuilder.add(ModItems.BREAD_CRUMB.get(), "面包屑");
            translationBuilder.add(ModItems.TREASURE_WEB.get(), "捞宝藏的网");
            translationBuilder.add(ModItems.RAW_BEEF_SKEWER.get(), "生牛肉串");
            translationBuilder.add(ModItems.ROASTED_BEEF_SKEWER.get(), "烤牛肉串");

            translationBuilder.add("tooltip.blockycooking.fish_trap_bait.usage", "记得放进捕鱼器里面！");

            translationBuilder.add("container.blockycooking.fish_trap", "捕鱼器");

            translationBuilder.add("itemGroup.blockycooking.main_group", "BlockyCooking 模组主物品组");
        }
    }
}
