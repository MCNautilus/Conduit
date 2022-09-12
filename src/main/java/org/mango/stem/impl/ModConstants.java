package org.mango.stem.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class ModConstants {
    public static final String MOD_ID = "stem";

    public static final Logger LOGGER = LogManager.getLogger("Stem");

    public static void info(@NotNull Object object) {
        LOGGER.info("[Stem] " + object.toString());
    }
}
