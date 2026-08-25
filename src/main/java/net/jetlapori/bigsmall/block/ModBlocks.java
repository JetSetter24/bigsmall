package net.jetlapori.bigsmall.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jetlapori.bigsmall.BigAndSmall;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block RATWOOD_PLANKS = registerBlock("ratwood_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block RATWOOD_STAIRS = registerBlock("ratwood_stairs",
            new StairsBlock(ModBlocks.RATWOOD_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2.0f,3.0f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block RATWOOD_SLAB = registerBlock("ratwood_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create().strength(2.0f,3.0f).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block RATWOOD_BUTTON = registerBlock("ratwood_button",
            new ButtonBlock(BlockSetType.OAK, 30,
                    AbstractBlock.Settings.create().strength(2.0f,3.0f).noCollision().sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block RATWOOD_PRESSURE_PLATE = registerBlock("ratwood_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create().strength(2.0f,3.0f).noCollision().sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block RATWOOD_FENCE = registerBlock("ratwood_fence",
            new FenceBlock(
                    AbstractBlock.Settings.create().strength(2.0f,3.0f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block RATWOOD_FENCE_GATE = registerBlock("ratwood_fence_gate",
            new FenceGateBlock(WoodType.OAK,
                    AbstractBlock.Settings.create().strength(2.0f,3.0f).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block RATWOOD_DOOR = registerBlock("ratwood_door",
            new DoorBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create().strength(2.0f,3.0f).nonOpaque().sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block RATWOOD_TRAPDOOR = registerBlock("ratwood_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create().strength(2.0f,3.0f).nonOpaque().sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block LIPASTONE = registerBlock("lipastone",
            new Block(AbstractBlock.Settings.create().strength(1.5f, 6.0f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LIPASTONE_BUTTON = registerBlock("lipastone_button",
            new ButtonBlock(BlockSetType.STONE, 20,
                    AbstractBlock.Settings.create().strength(2.0f,3.0f).noCollision().requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block LIPASTONE_PRESSURE_PLATE = registerBlock("lipastone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE,
                    AbstractBlock.Settings.create().strength(2.0f,3.0f).noCollision().requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LIPASTONE_STAIRS = registerBlock("lipastone_stairs",
            new StairsBlock(ModBlocks.LIPASTONE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2.0f,3.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block LIPASTONE_SLAB = registerBlock("lipastone_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create().strength(2.0f,3.0f).requiresTool().sounds(BlockSoundGroup.STONE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BigAndSmall.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(BigAndSmall.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    public static void registerModBlocks() {
        BigAndSmall.LOGGER.info("Registering Mod Blocks for " + BigAndSmall.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries-> {
            entries.add(ModBlocks.RATWOOD_PLANKS);
            entries.add(ModBlocks.RATWOOD_STAIRS);
            entries.add(ModBlocks.RATWOOD_SLAB);
            entries.add(ModBlocks.RATWOOD_PRESSURE_PLATE);
            entries.add(ModBlocks.RATWOOD_BUTTON);
            entries.add(ModBlocks.RATWOOD_FENCE);
            entries.add(ModBlocks.RATWOOD_FENCE_GATE);
            entries.add(ModBlocks.RATWOOD_DOOR);
            entries.add(ModBlocks.RATWOOD_TRAPDOOR);

            entries.add(ModBlocks.LIPASTONE);
            entries.add(ModBlocks.LIPASTONE_STAIRS);
            entries.add(ModBlocks.LIPASTONE_SLAB);
            entries.add(ModBlocks.LIPASTONE_PRESSURE_PLATE);
            entries.add(ModBlocks.LIPASTONE_BUTTON);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries-> {
            entries.add(ModBlocks.LIPASTONE);
        });
    }
}
