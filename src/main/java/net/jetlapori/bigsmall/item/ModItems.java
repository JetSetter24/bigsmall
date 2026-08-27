package net.jetlapori.bigsmall.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jetlapori.bigsmall.BigAndSmall;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RATWOOD_BOAT = registerItem(
            "ratwood_boat",
            new RatwoodBoatItem(new Item.Settings())
    );

    public static final Item SEALING_STONE = registerItem("sealing_stone", new Item(new Item.Settings()));

    public static final Item RATWOOD_TWIG = registerItem("ratwood_twig", new Item(new Item.Settings()));

    public static final Item SKILISAB_SCALE = registerItem("skilisab_scale", new Item(new Item.Settings().maxCount(16)));

    public static final Item RAW_SPIRIT_JADE = registerItem("raw_spirit_jade", new Item(new Item.Settings()));
    public static final Item REFINED_SPIRIT_JADE = registerItem("refined_spirit_jade", new Item(new Item.Settings()));
    public static final Item SPIRIT_JADE_BEADS = registerItem("spirit_jade_beads", new Item(new Item.Settings().maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BigAndSmall.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BigAndSmall.LOGGER.info("Registering Mod Items for " + BigAndSmall.MOD_ID);

        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(RATWOOD_TWIG, 0.65F);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries-> {
            entries.add(RATWOOD_TWIG);
            entries.add(SKILISAB_SCALE);
            entries.add(RAW_SPIRIT_JADE);
            entries.add(REFINED_SPIRIT_JADE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries-> {
            entries.add(RATWOOD_BOAT);
            entries.add(SEALING_STONE);
            entries.add(SPIRIT_JADE_BEADS);
        });
    }

}
