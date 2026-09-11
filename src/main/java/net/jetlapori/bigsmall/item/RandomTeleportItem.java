package net.jetlapori.bigsmall.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.random.Random;

public class RandomTeleportItem extends Item {

    public RandomTeleportItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        ItemStack itemStack = user.getStackInHand(hand);

        if (!world.isClient) {

            Random random = world.getRandom();

            double x = user.getX() + (random.nextDouble() * 32 - 16);
            double y = user.getY();
            double z = user.getZ() + (random.nextDouble() * 32 - 16);

            user.requestTeleport(x, y, z);

            ((ServerWorld) world).spawnParticles(
                    ParticleTypes.PORTAL,
                    user.getX(),
                    user.getY() + 1,
                    user.getZ(),
                    40,
                    0.5,
                    1.0,
                    0.5,
                    0.5
            );

            user.addStatusEffect(
                    new StatusEffectInstance(
                            StatusEffects.NAUSEA,
                            200,
                            0
                    )
            );

            world.playSound(
                    null,
                    user.getX(),
                    user.getY(),
                    user.getZ(),
                    SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT,
                    SoundCategory.PLAYERS,
                    1.0F,
                    1.0F
            );

            itemStack.decrementUnlessCreative(1, user);
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }
}