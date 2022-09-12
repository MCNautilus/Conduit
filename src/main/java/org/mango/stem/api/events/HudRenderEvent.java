package org.mango.stem.api.events;

import org.mango.stem.api.rendering.RenderHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Runs after Minecraft renders the HUD
 */
public class HudRenderEvent {
    // We use a BiConsumer, so we can accept a RenderHelper, which in newer versions of Minecraft, need a MatrixStack
    private static final List<BiConsumer<Float, RenderHelper>> registry = new ArrayList<>();

    public static void register(BiConsumer<Float, RenderHelper> consumer) {
        HudRenderEvent.registry.add(consumer);
    }

    // TODO: See whether the target version requires matrix stacks
    // If so, replace the below code with the commented code
    public static void run(float tickDelta) {
        for (BiConsumer<Float, RenderHelper> consumer : registry) {
            consumer.accept(tickDelta, new RenderHelper());
        }
    }
    /*
    public static void run(float tickDelta, MatrixStack matrixStack) {
        RenderHelper helper = new RenderHelper(matrixStack);
        for (BiConsumer<Float, RenderHelper> consumer : registry) {
            consumer.accept(tickDelta, helper);
        }
    }
    */


}
