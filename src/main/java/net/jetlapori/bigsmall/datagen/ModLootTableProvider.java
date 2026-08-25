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
    }



}
