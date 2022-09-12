package org.mango.stem.api.util;

import net.legacyfabric.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.options.KeyBinding;
import org.mango.stem.api.events.ClientTickEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * Used to register key binds
 */
public class KeybindRegistry {
    private static final Map<KeyBinding, Runnable> KEYBINDS = new HashMap<>();

    /**
     * Register a new key bind
     * @param bind the key bind to register
     * @param onPressed what to run when the key bind is pressed
     */
    public static void register(KeyBinding bind, Runnable onPressed) {
        KEYBINDS.put(bind, onPressed);
        KeyBindingHelper.registerKeyBinding(bind);
        ClientTickEvent.register(() -> {
            while (bind.wasPressed()) {
                onPressed.run();
            }
        });
    }
}
