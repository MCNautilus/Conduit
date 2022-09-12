package org.mango.stem.api.events;

import net.legacyfabric.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

import java.util.ArrayList;
import java.util.List;

/**
 * Runs after the Minecraft Client has ticked
 */
public class ClientTickEvent {
    public static void register(Runnable runnable) {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            runnable.run();
        });
    }
}
