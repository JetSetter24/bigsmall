package net.jetlapori.bigsmall;

import net.fabricmc.api.ModInitializer;

import net.jetlapori.bigsmall.block.ModBlocks;
import net.jetlapori.bigsmall.entity.ModEntities;
import net.jetlapori.bigsmall.item.ModItems;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class BigAndSmall implements ModInitializer {
	public static final String MOD_ID = "bigsmall";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final RegistryKey<PlacedFeature> SPIRIT_JADE_ORE_PLACED =
            RegistryKey.of(
                    RegistryKeys.PLACED_FEATURE,
                    Identifier.of(MOD_ID, "spirit_jade_ore")
            );

    public static final RegistryKey<PlacedFeature> LIPASTONE_PLACED =
            RegistryKey.of(
                    RegistryKeys.PLACED_FEATURE,
                    Identifier.of("bigsmall", "lipastone")
            );

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModEntities.registerModEntities();

        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                SPIRIT_JADE_ORE_PLACED
        );

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                LIPASTONE_PLACED
        );
	}
}

