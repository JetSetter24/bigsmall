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

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        // RATWOOD TWIGS FROM PLANKS
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RATWOOD_TWIG, 4)
                .input(ModBlocks.RATWOOD_PLANKS). criterion(hasItem(ModBlocks.RATWOOD_PLANKS), conditionsFromItem(ModBlocks.RATWOOD_PLANKS))
                .offerTo(exporter);

        // SKILISAB SCALES FROM BLOCK
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SKILISAB_SCALE, 9)
                .input(ModBlocks.SKILISAB_SCALE_BLOCK). criterion(hasItem(ModBlocks.SKILISAB_SCALE_BLOCK), conditionsFromItem(ModBlocks.SKILISAB_SCALE_BLOCK))
                .offerTo(exporter);

        // SKILISAB SCALE BLOCK
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SKILISAB_SCALE_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.SKILISAB_SCALE)
                .criterion(hasItem(ModItems.SKILISAB_SCALE), conditionsFromItem(ModItems.SKILISAB_SCALE))
                .offerTo(exporter);


        // RATWOOD PLANKS
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RATWOOD_PLANKS)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModItems.RATWOOD_TWIG)
                .criterion(hasItem(ModItems.RATWOOD_TWIG), conditionsFromItem(ModItems.RATWOOD_TWIG))
                .offerTo(exporter);

        // LIPASTONE STAIRS
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIPASTONE_STAIRS, 4)
                .pattern("L  ")
                .pattern("LL ")
                .pattern("LLL")
                .input('L', ModBlocks.LIPASTONE)
                .criterion(hasItem(ModBlocks.LIPASTONE), conditionsFromItem(ModBlocks.LIPASTONE))
                .offerTo(exporter);


        // LIPASTONE SLAB
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIPASTONE_SLAB, 6)
                .pattern("LLL")
                .input('L', ModBlocks.LIPASTONE)
                .criterion(hasItem(ModBlocks.LIPASTONE), conditionsFromItem(ModBlocks.LIPASTONE))
                .offerTo(exporter);


        // LIPASTONE BUTTON
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LIPASTONE_BUTTON)
                .input(ModBlocks.LIPASTONE)
                .criterion(hasItem(ModBlocks.LIPASTONE), conditionsFromItem(ModBlocks.LIPASTONE))
                .offerTo(exporter);


        // LIPASTONE PRESSURE PLATE
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LIPASTONE_PRESSURE_PLATE)
                .pattern("LL")
                .input('L', ModBlocks.LIPASTONE)
                .criterion(hasItem(ModBlocks.LIPASTONE), conditionsFromItem(ModBlocks.LIPASTONE))
                .offerTo(exporter);

        // LIPASTONE BRICKS
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIPASTONE_BRICKS, 4)
                .pattern("LL")
                .pattern("LL")
                .input('L', ModBlocks.LIPASTONE)
                .criterion(hasItem(ModBlocks.LIPASTONE), conditionsFromItem(ModBlocks.LIPASTONE))
                .offerTo(exporter);


        // LIPASTONE BRICK STAIRS
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIPASTONE_BRICK_STAIRS, 4)
                .pattern("L  ")
                .pattern("LL ")
                .pattern("LLL")
                .input('L', ModBlocks.LIPASTONE_BRICKS)
                .criterion(hasItem(ModBlocks.LIPASTONE_BRICKS), conditionsFromItem(ModBlocks.LIPASTONE_BRICKS))
                .offerTo(exporter);


        // LIPASTONE BRICK SLAB
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIPASTONE_BRICK_SLAB, 6)
                .pattern("LLL")
                .input('L', ModBlocks.LIPASTONE_BRICKS)
                .criterion(hasItem(ModBlocks.LIPASTONE_BRICKS), conditionsFromItem(ModBlocks.LIPASTONE_BRICKS))
                .offerTo(exporter);


        // LIPASTONE BRICK WALL
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIPASTONE_BRICK_WALL, 6)
                .pattern("LLL")
                .pattern("LLL")
                .input('L', ModBlocks.LIPASTONE_BRICKS)
                .criterion(hasItem(ModBlocks.LIPASTONE_BRICKS), conditionsFromItem(ModBlocks.LIPASTONE_BRICKS))
                .offerTo(exporter);

        // SMOOTH LIPASTONE
        offerSmelting(
                exporter,
                List.of(ModBlocks.LIPASTONE),
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.SMOOTH_LIPASTONE,
                0.1f,
                200,
                "lipastone"
        );

        // CHISELED LIPASTONE BRICKS
        ShapedRecipeJsonBuilder.create(
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.CHISELED_LIPASTONE_BRICKS
                )
                .pattern("L")
                .pattern("L")
                .input('L', ModBlocks.LIPASTONE_BRICK_SLAB)
                .criterion(
                        hasItem(ModBlocks.LIPASTONE_BRICK_SLAB),
                        conditionsFromItem(ModBlocks.LIPASTONE_BRICK_SLAB)
                )
                .offerTo(exporter);

        // RUSTIC CHALK STAIRS
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTIC_CHALK_STAIRS, 4)
                .pattern("L  ")
                .pattern("LL ")
                .pattern("LLL")
                .input('L', ModBlocks.RUSTIC_CHALK)
                .criterion(hasItem(ModBlocks.RUSTIC_CHALK), conditionsFromItem(ModBlocks.RUSTIC_CHALK))
                .offerTo(exporter);


        // RUSTIC CHALK SLAB
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTIC_CHALK_SLAB, 6)
                .pattern("LLL")
                .input('L', ModBlocks.RUSTIC_CHALK)
                .criterion(hasItem(ModBlocks.RUSTIC_CHALK), conditionsFromItem(ModBlocks.RUSTIC_CHALK))
                .offerTo(exporter);


        // RUSTIC CHALK BUTTON
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.RUSTIC_CHALK_BUTTON)
                .input(ModBlocks.RUSTIC_CHALK)
                .criterion(hasItem(ModBlocks.RUSTIC_CHALK), conditionsFromItem(ModBlocks.RUSTIC_CHALK))
                .offerTo(exporter);


        // RUSTIC CHALK PRESSURE PLATE
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.RUSTIC_CHALK_PRESSURE_PLATE)
                .pattern("LL")
                .input('L', ModBlocks.RUSTIC_CHALK)
                .criterion(hasItem(ModBlocks.RUSTIC_CHALK), conditionsFromItem(ModBlocks.RUSTIC_CHALK))
                .offerTo(exporter);

    }
}
