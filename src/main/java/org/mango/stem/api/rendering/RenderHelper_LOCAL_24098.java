package org.mango.stem.api.rendering;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class RenderHelper {
    // TODO: See whether the target version requires a Matrix Stack here - if so, uncomment the following code
    /*
    private final MatrixStack stack;

    public RenderHelper(MatrixStack stack) {
        this.stack = stack;
    }
    */

    public void setTexture(Identifier texture) {
    }

    public void drawTexture(int x, int y, int u, int v, int width, int height, int f, int g) {
    }

    public void drawTexture(int x, int y, int u, int v, int width, int height) {
    }

    public void color(float r, float g, float b, float a) {
    }

    public void drawText(Text text, int x, int y, int color) {
    }

    public void drawTextWithShadow(Text text, int x, int y, int color) {
    }

    public void fill(int x1, int y1, int x2, int y2, int color) {
    }

    public void drawTransparentBackground() {
    }
}
