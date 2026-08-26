package net.jetlapori.bigsmall.item;

import net.jetlapori.bigsmall.entity.ModEntities;
import net.jetlapori.bigsmall.entity.RatwoodBoatEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;

public class RatwoodBoatItem extends Item {

    public RatwoodBoatItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);

        HitResult hitResult = user.raycast(5.0, 1.0F, true);

        if (hitResult.getType() != HitResult.Type.BLOCK) {
            return TypedActionResult.pass(itemStack);
        }

        if (!world.isClient) {
            RatwoodBoatEntity boat = new RatwoodBoatEntity(
                    ModEntities.RATWOOD_BOAT,
                    world
            );

            boat.setPosition(hitResult.getPos());
            boat.setYaw(user.getYaw());

            world.spawnEntity(boat);

            if (!user.isCreative()) {
                itemStack.decrement(1);
            }
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }
}