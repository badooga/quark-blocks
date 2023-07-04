package com.badooga.quark;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.badooga.quark.block.QuarkBlocks;

public class Quark implements ModInitializer {
    public static final String MODID = "quark";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        QuarkBlocks.registerModBlocks();
    }
}
