package ch.piyamon.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent NEOGEUMPOTATO = new FoodComponent.Builder().nutrition(4).saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 6000, 3), 1.0F)
            .alwaysEdible().build();

    public static final FoodComponent TOMATO = new FoodComponent.Builder().nutrition(4).saturationModifier(0.5F).build();
    public static final FoodComponent CHEESE = new FoodComponent.Builder().nutrition(5).saturationModifier(1F).build();

}