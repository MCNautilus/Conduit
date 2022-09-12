package org.mango.example.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModConstants {
    public static final String MOD_ID = "mango_example";

    public static final Logger LOGGER = LogManager.getLogger("Mango Example");

    public static void info(Object object) {
        LOGGER.info("[Mango Example] " + object.toString());
    }
}
