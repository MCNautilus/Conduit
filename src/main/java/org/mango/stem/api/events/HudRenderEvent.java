package org.mango.stem.api.events;

import net.legacyfabric.fabric.api.client.rendering.v1.HudRenderCallback;
import org.mango.stem.api.rendering.RenderHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Runs after Minecraft renders the HUD
 */
public class HudRenderEvent {
    public static void register(BiConsumer<Float, RenderHelper> consumer) {
        HudRenderCallback.EVENT.register((client, tickDelta) -> {
            consumer.accept(tickDelta, new RenderHelper());
        });
    }
}
