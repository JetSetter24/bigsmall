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
    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RATWOOD_TWIG, Models.GENERATED);
    }
}
