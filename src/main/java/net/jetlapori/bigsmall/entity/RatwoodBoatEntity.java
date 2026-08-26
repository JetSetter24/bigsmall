package net.jetlapori.bigsmall.entity;

import net.jetlapori.bigsmall.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class RatwoodBoatEntity extends BoatEntity {

    public RatwoodBoatEntity(EntityType<? extends RatwoodBoatEntity> type, World world) {
        super(type, world);
    }

    @Override
    public Item asItem() {
        return ModItems.RATWOOD_BOAT;
    }
}