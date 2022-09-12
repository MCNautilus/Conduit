package org.mango.stem.api.rendering;

import net.minecraft.client.gui.DrawableHelper;

class DrawableOpener extends DrawableHelper {
    // We take in a render helper here to make the function different so the compiler doesn't error
    // It will also be helpful in future versions
    public static void fillGradient(RenderHelper helper, int x1, int y1, int x2, int y2, int color1, int color2) {
        new DrawableOpener().fillGradient(x1, y1, x2, y2, color1, color2);
    }
}