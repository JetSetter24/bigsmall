package net.jetlapori.bigsmall.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jetlapori.bigsmall.BigAndSmall;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RATWOOD_TWIG = registerItem("ratwood_twig", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BigAndSmall.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BigAndSmall.LOGGER.info("Registering Mod Items for " + BigAndSmall.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries-> {
            entries.add(RATWOOD_TWIG);
        });
    }

}
