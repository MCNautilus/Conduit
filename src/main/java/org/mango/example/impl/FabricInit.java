package org.mango.example.impl;

import net.fabricmc.api.ModInitializer;

public class FabricInit implements ModInitializer {

    @Override
    public void onInitialize() {
        ExampleInit.init();
    }
}
