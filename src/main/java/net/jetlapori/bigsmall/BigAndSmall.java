package net.jetlapori.bigsmall;

import net.fabricmc.api.ModInitializer;

import net.jetlapori.bigsmall.block.ModBlocks;
import net.jetlapori.bigsmall.entity.ModEntities;
import net.jetlapori.bigsmall.item.ModItemGroups;
import net.jetlapori.bigsmall.item.ModItems;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.jetlapori.bigsmall.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;


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

        ModItemGroups.registerItemGroups();

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

        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.BEACH),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(
                        RegistryKeys.PLACED_FEATURE,
                        Identifier.of(BigAndSmall.MOD_ID, "rustic_chalk")
                )
        );



        UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {


            if (!(entity instanceof EndCrystalEntity)) {
                return ActionResult.PASS;
            }


            if (!player.getStackInHand(hand).isOf(ModItems.SEALING_STONE)) {
                return ActionResult.PASS;
            }


            if (!world.isClient) {

                ServerWorld serverWorld = (ServerWorld) world;

                double x = entity.getX();
                double y = entity.getY();
                double z = entity.getZ();


                serverWorld.spawnParticles(
                        ParticleTypes.PORTAL,
                        x,
                        y,
                        z,
                        40,
                        0.5,
                        1.0,
                        0.5,
                        0.2
                );

                serverWorld.spawnParticles(
                        ParticleTypes.END_ROD,
                        x,
                        y,
                        z,
                        15,
                        0.4,
                        0.8,
                        0.4,
                        0.05
                );


                world.playSound(
                        null,
                        x,
                        y,
                        z,
                        SoundEvents.ENTITY_ALLAY_AMBIENT_WITHOUT_ITEM,
                        SoundCategory.PLAYERS,
                        4.0F,
                        1.5F
                );


                ItemEntity droppedCrystal = new ItemEntity(
                        world,
                        x,
                        y,
                        z,
                        new ItemStack(Items.END_CRYSTAL)
                );


                droppedCrystal.setVelocity(
                        0.0,
                        0.2,
                        0.0
                );

                serverWorld.spawnEntity(droppedCrystal);


                entity.discard();

                player.getStackInHand(hand).decrement(1);
            }

            return ActionResult.SUCCESS;
        });
	}
}

