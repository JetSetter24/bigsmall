package net.jetlapori.bigsmall.item;

import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;

public class SealingItem extends Item {

    public SealingItem(Settings settings) {
        super(settings);
    }

    public static void registerInteraction() {
        UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            ItemStack stack = player.getStackInHand(hand);

            if (stack.getItem() instanceof SealingItem
                    && entity instanceof EndCrystalEntity crystal) {

                if (!world.isClient()) {
                    crystal.discard();
                }

                return ActionResult.SUCCESS;
            }

            return ActionResult.PASS;
        });
    }
}