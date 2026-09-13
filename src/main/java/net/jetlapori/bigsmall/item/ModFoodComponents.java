package net.jetlapori.bigsmall.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent JELLY_BRICK = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f).build();
    public static final FoodComponent JELLY_BEAN = new FoodComponent.Builder().snack().saturationModifier(0.25f).build();
}