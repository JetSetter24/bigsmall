package net.jetlapori.bigsmall.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.jetlapori.bigsmall.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RATWOOD_PLANKS);
        addDrop(ModBlocks.RATWOOD_STAIRS);
        addDrop(ModBlocks.RATWOOD_SLAB, slabDrops(ModBlocks.RATWOOD_SLAB));
        addDrop(ModBlocks.RATWOOD_BUTTON);
        addDrop(ModBlocks.RATWOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.RATWOOD_FENCE);
        addDrop(ModBlocks.RATWOOD_FENCE_GATE);
        addDrop(ModBlocks.RATWOOD_DOOR, doorDrops(ModBlocks.RATWOOD_DOOR));
        addDrop(ModBlocks.RATWOOD_TRAPDOOR);

        addDrop(ModBlocks.LIPASTONE);
        addDrop(ModBlocks.LIPASTONE_STAIRS);
        addDrop(ModBlocks.LIPASTONE_SLAB, slabDrops(ModBlocks.LIPASTONE_SLAB));
        addDrop(ModBlocks.LIPASTONE_BUTTON);
        addDrop(ModBlocks.LIPASTONE_PRESSURE_PLATE);

        addDrop(ModBlocks.LIPASTONE_BRICKS);
        addDrop(ModBlocks.LIPASTONE_BRICK_STAIRS);
        addDrop(ModBlocks.LIPASTONE_BRICK_SLAB, slabDrops(ModBlocks.LIPASTONE_BRICK_SLAB));
        addDrop(ModBlocks.LIPASTONE_BRICK_WALL);

        addDrop(ModBlocks.SMOOTH_LIPASTONE);
        addDrop(ModBlocks.CHISELED_LIPASTONE_BRICKS);

        addDrop(ModBlocks.SKILISAB_SCALE_BLOCK);
    }



}
