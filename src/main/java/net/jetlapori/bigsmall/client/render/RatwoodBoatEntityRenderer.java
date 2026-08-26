package net.jetlapori.bigsmall.client.render;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.BoatEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import org.joml.Quaternionf;

public class RatwoodBoatEntityRenderer extends EntityRenderer<BoatEntity> {

    private static final Identifier TEXTURE =
            Identifier.of("bigsmall", "textures/entity/boat/ratwood.png");

    private final BoatEntityModel model;

    public RatwoodBoatEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.shadowRadius = 0.8F;

        ModelPart modelPart = context.getPart(EntityModelLayers.createBoat(BoatEntity.Type.OAK));
        this.model = new BoatEntityModel(modelPart);
    }

    @Override
    public void render(
            BoatEntity boatEntity,
            float yaw,
            float tickDelta,
            MatrixStack matrices,
            VertexConsumerProvider vertexConsumers,
            int light
    ) {
        matrices.push();

        matrices.translate(0.0F, 0.375F, 0.0F);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180.0F - yaw));

        float damageWobbleTicks = boatEntity.getDamageWobbleTicks() - tickDelta;
        float damageWobbleStrength = boatEntity.getDamageWobbleStrength() - tickDelta;

        if (damageWobbleStrength < 0.0F) {
            damageWobbleStrength = 0.0F;
        }

        if (damageWobbleTicks > 0.0F) {
            matrices.multiply(
                    RotationAxis.POSITIVE_X.rotationDegrees(
                            MathHelper.sin(damageWobbleTicks)
                                    * damageWobbleTicks
                                    * damageWobbleStrength
                                    / 10.0F
                                    * boatEntity.getDamageWobbleSide()
                    )
            );
        }

        float bubbleWobble = boatEntity.interpolateBubbleWobble(tickDelta);

        if (!MathHelper.approximatelyEquals(bubbleWobble, 0.0F)) {
            matrices.multiply(
                    new Quaternionf().setAngleAxis(
                            bubbleWobble * ((float) Math.PI / 180F),
                            1.0F,
                            0.0F,
                            1.0F
                    )
            );
        }

        matrices.scale(-1.0F, -1.0F, 1.0F);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90.0F));

        model.setAngles(boatEntity, tickDelta, 0.0F, -0.1F, 0.0F, 0.0F);

        VertexConsumer vertexConsumer =
                vertexConsumers.getBuffer(model.getLayer(TEXTURE));

        model.render(
                matrices,
                vertexConsumer,
                light,
                OverlayTexture.DEFAULT_UV
        );

        if (!boatEntity.isSubmergedInWater()) {
            VertexConsumer waterMask =
                    vertexConsumers.getBuffer(RenderLayer.getWaterMask());

            model.getWaterPatch().render(
                    matrices,
                    waterMask,
                    light,
                    OverlayTexture.DEFAULT_UV
            );
        }

        matrices.pop();

        super.render(
                boatEntity,
                yaw,
                tickDelta,
                matrices,
                vertexConsumers,
                light
        );
    }

    @Override
    public Identifier getTexture(BoatEntity boatEntity) {
        return TEXTURE;
    }
}