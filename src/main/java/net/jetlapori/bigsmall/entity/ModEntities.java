package net.jetlapori.bigsmall.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.jetlapori.bigsmall.BigAndSmall;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<RatwoodBoatEntity> RATWOOD_BOAT = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(BigAndSmall.MOD_ID, "ratwood_boat"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, RatwoodBoatEntity::new)
                    .dimensions(EntityDimensions.fixed(1.375f, 0.5625f))
                    .build()
    );

    public static void registerModEntities() {
        BigAndSmall.LOGGER.info("Registering Mod Entities for " + BigAndSmall.MOD_ID);
    }
}