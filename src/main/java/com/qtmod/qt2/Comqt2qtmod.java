package com.qtmod.qt2;

import net.fabricmc.api.ModInitializer;
import com.qtmod.qt2.registry.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Comqt2qtmod implements ModInitializer {
	public static final String MOD_ID = "comqt2qtmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerItems();
		LOGGER.info("{} mod initialized!", MOD_ID);
	}
}