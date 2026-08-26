package net.jetlapori.bigsmall;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.jetlapori.bigsmall.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.jetlapori.bigsmall.entity.ModEntities;
import net.jetlapori.bigsmall.client.render.RatwoodBoatEntityRenderer;



public class BigAndSmallClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RATWOOD_DOOR, RenderLayer.getCutout());

        EntityRendererRegistry.register(
                ModEntities.RATWOOD_BOAT,
                RatwoodBoatEntityRenderer::new
        );
    }

}
