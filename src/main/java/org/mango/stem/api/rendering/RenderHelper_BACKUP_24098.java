package org.mango.stem.api.rendering;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.util.Window;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class RenderHelper {
    public void setTexture(Identifier texture) {
        MinecraftClient.getInstance().getTextureManager().bindTexture(texture);
    }

    public void drawTexture(int x, int y, int u, int v, int width, int height, int textureWidth, int textureHeight) {
        DrawableHelper.drawTexture(x, y, u, v, width, height, textureWidth, textureHeight);
    }

    public void drawTexture(int x, int y, int u, int v, int width, int height) {
        // This is what the (non-static) version of the above function does
        DrawableHelper.drawTexture(x, y, u, v, width, height, 256, 256);
    }

    public void color(float r, float g, float b, float a) {
        GlStateManager.color4f(r, g, b, a);
    }

    public void drawText(Text text, int x, int y, int color) {
        MinecraftClient.getInstance().textRenderer.draw(text.asFormattedString(), x, y, color);
    }

    public void drawTextWithShadow(Text text, int x, int y, int color) {
        MinecraftClient.getInstance().textRenderer.drawWithShadow(text.asFormattedString(), x, y, color);
    }

    public void fill(int x1, int y1, int x2, int y2, int color) {
        DrawableHelper.fill(x1, y1, x2, y2, color);
    }

    public void drawTransparentBackground() {
<<<<<<< HEAD
=======
        Window window = new Window(MinecraftClient.getInstance());
        DrawableOpener.fillGradient(this, 0, 0, window.getWidth(), window.getHeight(), -1072689136, -804253680);
>>>>>>> 4753704 (ran git add *)
    }
}
