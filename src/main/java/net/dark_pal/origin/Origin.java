package net.dark_pal.origin;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Origin implements ModInitializer {

	public static final String MOD_ID = "origin";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("OMG The mod is actually working!");
	}
}
