package org.mango.stem.api.events;

import java.util.ArrayList;
import java.util.List;

/**
 * Runs after the Minecraft Client has ticked
 */
public class ClientTickEvent {
    private static final List<Runnable> registry = new ArrayList<>();

    public static void register(Runnable runnable) {
        ClientTickEvent.registry.add(runnable);
    }

    public static void run() {
        for (Runnable runnable : registry) {
            runnable.run();
        }
    }
}
