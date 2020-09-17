package com.celui.celuiutility.items;

import com.celui.celuiutility.Celui;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class TungstenApple extends Item {

    public TungstenApple() {
        super(new Item.Properties()
                .group(Celui.TAB)
                .food(new Food.Builder()
                        .hunger(6)
                        .saturation(12)
                        .effect(new EffectInstance(Effects.RESISTANCE, 600, 1), 1)
                        .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 600, 0), 1)
                        .effect(new EffectInstance(Effects.SLOWNESS, 15, 1), 0.1f)
                        .build())
        );
    }
}
