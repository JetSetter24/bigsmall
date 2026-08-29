package net.jetlapori.bigsmall.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jetlapori.bigsmall.BigAndSmall;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
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

    public static final Block SMOOTH_LIPASTONE = registerBlock("smooth_lipastone",
            new Block(AbstractBlock.Settings.create().strength(1.5f, 6.0f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block CHISELED_LIPASTONE_BRICKS = registerBlock("chiseled_lipastone_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.5f, 6.0f).requiresTool().sounds(BlockSoundGroup.STONE)));


    public static final Block LIPASTONE_BUTTON = registerBlock("lipastone_button",
            new ButtonBlock(BlockSetType.STONE, 20,
                    AbstractBlock.Settings.create().strength(1.5f,6.0f).noCollision().requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block LIPASTONE_PRESSURE_PLATE = registerBlock("lipastone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE,
                    AbstractBlock.Settings.create().strength(1.5f,6.0f).noCollision().requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LIPASTONE_STAIRS = registerBlock("lipastone_stairs",
            new StairsBlock(ModBlocks.LIPASTONE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f,6.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block LIPASTONE_SLAB = registerBlock("lipastone_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create().strength(1.5f,6.0f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LIPASTONE_BRICKS = registerBlock(
            "lipastone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.BRICKS))
    );

    public static final Block LIPASTONE_BRICK_SLAB = registerBlock(
            "lipastone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICKS))
    );

    public static final Block LIPASTONE_BRICK_STAIRS = registerBlock(
            "lipastone_brick_stairs",
            new StairsBlock(
                    LIPASTONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.BRICKS)
            )
    );

    public static final Block RUSTIC_CHALK = registerBlock("rustic_chalk",
            new Block(AbstractBlock.Settings.create().strength(1.5f, 6.0f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block RUSTIC_CHALK_BUTTON = registerBlock("rustic_chalk_button",
            new ButtonBlock(BlockSetType.STONE, 20,
                    AbstractBlock.Settings.create().strength(1.5f,6.0f).noCollision().requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block RUSTIC_CHALK_PRESSURE_PLATE = registerBlock("rustic_chalk_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE,
                    AbstractBlock.Settings.create().strength(1.5f,6.0f).noCollision().requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block RUSTIC_CHALK_STAIRS = registerBlock("rustic_chalk_stairs",
            new StairsBlock(ModBlocks.RUSTIC_CHALK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f,6.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block RUSTIC_CHALK_SLAB = registerBlock("rustic_chalk_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create().strength(1.5f,6.0f).requiresTool().sounds(BlockSoundGroup.STONE)));


    public static final Block SPIRIT_JADE_ORE = registerBlock("spirit_jade_ore",
            new Block(AbstractBlock.Settings.create()
                    .strength(3.0f, 3.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block RAW_SPIRIT_JADE_BLOCK = registerBlock(
            "raw_spirit_jade_block",
            new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK))
    );

    public static final Block REFINED_SPIRIT_JADE_BLOCK = registerBlock(
            "refined_spirit_jade_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK))
    );


    public static final Block LIPASTONE_BRICK_WALL = registerBlock(
            "lipastone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BRICKS))
    );

    public static final Block SKILISAB_SCALE_BLOCK = registerBlock("skilisab_scale_block",
            new Block(AbstractBlock.Settings.create().strength(5.0f, 6.0f).sounds(BlockSoundGroup.BONE).requiresTool().instrument(NoteBlockInstrument.HAT)));



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
            entries.add(SMOOTH_LIPASTONE);
            entries.add(LIPASTONE_BRICKS);
            entries.add(LIPASTONE_BRICK_SLAB);
            entries.add(LIPASTONE_BRICK_STAIRS);
            entries.add(LIPASTONE_BRICK_WALL);
            entries.add(CHISELED_LIPASTONE_BRICKS);

            entries.add(ModBlocks.RUSTIC_CHALK);
            entries.add(ModBlocks.RUSTIC_CHALK_STAIRS);
            entries.add(ModBlocks.RUSTIC_CHALK_SLAB);
            entries.add(ModBlocks.RUSTIC_CHALK_PRESSURE_PLATE);
            entries.add(ModBlocks.RUSTIC_CHALK_BUTTON);

            entries.add(ModBlocks.SKILISAB_SCALE_BLOCK);

            entries.add(ModBlocks.RAW_SPIRIT_JADE_BLOCK);
            entries.add(ModBlocks.REFINED_SPIRIT_JADE_BLOCK);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries-> {
            entries.add(ModBlocks.LIPASTONE);
            entries.add(ModBlocks.RUSTIC_CHALK);
            entries.add(ModBlocks.SPIRIT_JADE_ORE);
            entries.add(ModBlocks.RAW_SPIRIT_JADE_BLOCK);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> {
            entries.add(ModBlocks.RATWOOD_PRESSURE_PLATE);
            entries.add(ModBlocks.RATWOOD_BUTTON);
            entries.add(ModBlocks.LIPASTONE_PRESSURE_PLATE);
            entries.add(ModBlocks.LIPASTONE_BUTTON);
            entries.add(ModBlocks.RUSTIC_CHALK_PRESSURE_PLATE);
            entries.add(ModBlocks.RUSTIC_CHALK_BUTTON);
        });
    }
}
