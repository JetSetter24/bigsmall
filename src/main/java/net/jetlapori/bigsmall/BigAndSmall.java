package net.jetlapori.bigsmall;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BigAndSmall implements ModInitializer {
	public static final String MOD_ID = "bigsmall";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
