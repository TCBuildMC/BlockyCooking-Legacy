package xyz.tcbuildmc.minecraft.mod.blockycooking.fabric.data.advancement;

import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xyz.tcbuildmc.minecraft.mod.blockycooking.BlockyCooking;
import xyz.tcbuildmc.minecraft.mod.blockycooking.item.ModItems;

import java.util.function.Consumer;

public class ModAdvancements implements Consumer<Consumer<Advancement>> {
    @Override
    public void accept(Consumer<Advancement> consumer) {
//        Advancement.Builder.create()
//                .display(ModItems.GRILL.get(),
//                        Text.translatable("avancement.blockycooking.root.title"),
//                        Text.translatable("avancement.blockycooking.root.description"),
//                        new Identifier(BlockyCooking.MOD_ID, "textures/gui/advancements/backgrounds/blockycooking_root.png"),
//                        AdvancementFrame.TASK,
//                        true,
//                        true,
//                        false)
//                .criterion("eat_some_food", )
//                .build(consumer, BlockyCooking.MOD_ID + "/root");
    }
}
