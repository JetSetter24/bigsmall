package net.jetlapori.bigsmall;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.jetlapori.bigsmall.datagen.ModBlockTagProvider;
import net.jetlapori.bigsmall.datagen.ModItemTagProvider;
import net.jetlapori.bigsmall.datagen.ModLootTableProvider;
import net.jetlapori.bigsmall.datagen.ModModelProvider;
import net.jetlapori.bigsmall.datagen.ModRecipeProvider;

public class BigAndSmallDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModLootTableProvider::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModRecipeProvider::new);
    }
}
