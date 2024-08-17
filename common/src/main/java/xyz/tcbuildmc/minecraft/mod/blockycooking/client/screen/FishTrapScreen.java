package xyz.tcbuildmc.minecraft.mod.blockycooking.client.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xyz.tcbuildmc.minecraft.mod.blockycooking.BlockyCooking;
import xyz.tcbuildmc.minecraft.mod.blockycooking.screen.FishTrapScreenHandler;

public class FishTrapScreen extends HandledScreen<FishTrapScreenHandler> {
    public static final Identifier TEXTURE = new Identifier(BlockyCooking.MOD_ID, "textures/gui/container/fish_trap.png");

    public FishTrapScreen(FishTrapScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);

        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;

        context.drawTexture(TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }
}
