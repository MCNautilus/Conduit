package org.mango.stem.api.util;

import net.minecraft.client.options.KeyBinding;

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
    }

    public static Map<KeyBinding, Runnable> getKeybindMap() {
        return KEYBINDS;
    }
}
