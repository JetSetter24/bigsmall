package net.jetlapori.bigsmall.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jetlapori.bigsmall.BigAndSmall;
import net.jetlapori.bigsmall.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final RegistryKey<ItemGroup> BIG_AND_SMALL_GROUP_KEY = RegistryKey.of(
            Registries.ITEM_GROUP.getKey(),
            Identifier.of(BigAndSmall.MOD_ID, "big_and_small")
    );

    public static final ItemGroup BIG_AND_SMALL_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.SPIRIT_JADE_ORE))
            .displayName(Text.translatable("itemGroup.bigsmall.big_and_small"))
            .entries((context, entries) -> {


                entries.add(ModBlocks.SPIRIT_JADE_ORE);
                entries.add(ModItems.RAW_SPIRIT_JADE);
                entries.add(ModBlocks.RAW_SPIRIT_JADE_BLOCK);
                entries.add(ModItems.REFINED_SPIRIT_JADE);
                entries.add(ModBlocks.REFINED_SPIRIT_JADE_BLOCK);
                entries.add(ModItems.SPIRIT_JADE_BEADS);
                entries.add(ModItems.SEALING_STONE);
                entries.add(ModItems.IDOL);


                entries.add(ModBlocks.LIPASTONE);
                entries.add(ModBlocks.LIPASTONE_STAIRS);
                entries.add(ModBlocks.LIPASTONE_SLAB);
                entries.add(ModBlocks.LIPASTONE_PRESSURE_PLATE);
                entries.add(ModBlocks.LIPASTONE_BUTTON);
                entries.add(ModBlocks.SMOOTH_LIPASTONE);
                entries.add(ModBlocks.LIPASTONE_BRICKS);
                entries.add(ModBlocks.LIPASTONE_BRICK_STAIRS);
                entries.add(ModBlocks.LIPASTONE_BRICK_SLAB);
                entries.add(ModBlocks.LIPASTONE_BRICK_WALL);
                entries.add(ModBlocks.CHISELED_LIPASTONE_BRICKS);

                entries.add(ModBlocks.RUSTIC_CHALK);
                entries.add(ModBlocks.RUSTIC_CHALK_STAIRS);
                entries.add(ModBlocks.RUSTIC_CHALK_SLAB);
                entries.add(ModBlocks.RUSTIC_CHALK_PRESSURE_PLATE);
                entries.add(ModBlocks.RUSTIC_CHALK_BUTTON);
                entries.add(ModBlocks.RUSTIC_CHALK_BRICKS);
                entries.add(ModBlocks.RUSTIC_CHALK_BRICK_STAIRS);
                entries.add(ModBlocks.RUSTIC_CHALK_BRICK_SLAB);
                entries.add(ModBlocks.RUSTIC_CHALK_BRICK_WALL);

                entries.add(ModItems.ROYAL_PEARL);
                entries.add(ModBlocks.ROYAL_PEARL_BLOCK);
                entries.add(ModItems.OCEANS_CROWN);

                entries.add(ModItems.RATWOOD_TWIG);
                entries.add(ModBlocks.RATWOOD_PLANKS);
                entries.add(ModBlocks.RATWOOD_STAIRS);
                entries.add(ModBlocks.RATWOOD_SLAB);
                entries.add(ModBlocks.RATWOOD_FENCE);
                entries.add(ModBlocks.RATWOOD_FENCE_GATE);
                entries.add(ModBlocks.RATWOOD_DOOR);
                entries.add(ModBlocks.RATWOOD_TRAPDOOR);
                entries.add(ModBlocks.RATWOOD_PRESSURE_PLATE);
                entries.add(ModBlocks.RATWOOD_BUTTON);
                entries.add(ModItems.RATWOOD_BOAT);

                entries.add(ModItems.SKILISAB_SCALE);
                entries.add(ModBlocks.SKILISAB_SCALE_BLOCK);

                entries.add(ModBlocks.JELLY_BRICKS);
                entries.add(ModBlocks.JELLY_BRICK_STAIRS);
                entries.add(ModBlocks.JELLY_BRICK_SLAB);
                entries.add(ModBlocks.JELLY_BRICK_WALL);
                entries.add(ModBlocks.CHISELED_JELLY_BRICKS);


            })
            .build();

    public static void registerItemGroups() {
        Registry.register(
                Registries.ITEM_GROUP,
                BIG_AND_SMALL_GROUP_KEY,
                BIG_AND_SMALL_GROUP
        );
    }
}