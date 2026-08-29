package net.jetlapori.bigsmall.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.jetlapori.bigsmall.block.ModBlocks;
import net.jetlapori.bigsmall.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool ratwoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RATWOOD_PLANKS);
        BlockStateModelGenerator.BlockTexturePool lipastonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIPASTONE);
        BlockStateModelGenerator.BlockTexturePool rusticChalkPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUSTIC_CHALK);

        ratwoodPool.stairs(ModBlocks.RATWOOD_STAIRS);
        ratwoodPool.slab(ModBlocks.RATWOOD_SLAB);
        ratwoodPool.fence(ModBlocks.RATWOOD_FENCE);
        ratwoodPool.fenceGate(ModBlocks.RATWOOD_FENCE_GATE);
        ratwoodPool.button(ModBlocks.RATWOOD_BUTTON);
        ratwoodPool.pressurePlate(ModBlocks.RATWOOD_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.RATWOOD_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.RATWOOD_TRAPDOOR);

        lipastonePool.stairs(ModBlocks.LIPASTONE_STAIRS);
        lipastonePool.slab(ModBlocks.LIPASTONE_SLAB);
        lipastonePool.button(ModBlocks.LIPASTONE_BUTTON);
        lipastonePool.pressurePlate(ModBlocks.LIPASTONE_PRESSURE_PLATE);

        rusticChalkPool.stairs(ModBlocks.RUSTIC_CHALK_STAIRS);
        rusticChalkPool.slab(ModBlocks.RUSTIC_CHALK_SLAB);
        rusticChalkPool.button(ModBlocks.RUSTIC_CHALK_BUTTON);
        rusticChalkPool.pressurePlate(ModBlocks.RUSTIC_CHALK_PRESSURE_PLATE);

        BlockStateModelGenerator.BlockTexturePool lipastoneBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIPASTONE_BRICKS);

        lipastoneBricksPool.stairs(ModBlocks.LIPASTONE_BRICK_STAIRS);
        lipastoneBricksPool.slab(ModBlocks.LIPASTONE_BRICK_SLAB);
        lipastoneBricksPool.wall(ModBlocks.LIPASTONE_BRICK_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_LIPASTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_LIPASTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SKILISAB_SCALE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPIRIT_JADE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SPIRIT_JADE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REFINED_SPIRIT_JADE_BLOCK);

    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RATWOOD_TWIG, Models.GENERATED);
        itemModelGenerator.register(ModItems.SKILISAB_SCALE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RATWOOD_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SPIRIT_JADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_SPIRIT_JADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPIRIT_JADE_BEADS, Models.GENERATED);
    }
}
