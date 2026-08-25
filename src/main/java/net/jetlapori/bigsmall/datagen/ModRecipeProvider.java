package net.jetlapori.bigsmall.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.jetlapori.bigsmall.block.ModBlocks;
import net.jetlapori.bigsmall.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RATWOOD_TWIG, 4)
                .input(ModBlocks.RATWOOD_PLANKS). criterion(hasItem(ModBlocks.RATWOOD_PLANKS), conditionsFromItem(ModBlocks.RATWOOD_PLANKS))
                .offerTo(exporter);



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RATWOOD_PLANKS)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModItems.RATWOOD_TWIG)
                .criterion(hasItem(ModItems.RATWOOD_TWIG), conditionsFromItem(ModItems.RATWOOD_TWIG))
                .offerTo(exporter);

    }
}
