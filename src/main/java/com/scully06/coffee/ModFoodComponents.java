package com.scully06.coffee;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent COFFEE = new FoodComponent.Builder().hunger(4).saturationModifier(1.5F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1200),1.0f).build();
}
