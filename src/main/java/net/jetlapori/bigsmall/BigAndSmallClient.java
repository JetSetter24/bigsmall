package net.jetlapori.bigsmall;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.jetlapori.bigsmall.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;


public class BigAndSmallClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RATWOOD_DOOR, RenderLayer.getCutout());
    }

}
