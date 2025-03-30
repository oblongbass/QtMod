package com.qtmod.qt2.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.KnockbackEnchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;

public class ReverseKnockbackEnchantment extends Enchantment {
    public ReverseKnockbackEnchantment() {
        super(
            Rarity.UNCOMMON,
            EnchantmentTarget.WEAPON,
            new EquipmentSlot[]{ EquipmentSlot.MAINHAND }
        );
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }

    @Override
    public boolean canAccept(Enchantment other) {
        return !(other instanceof KnockbackEnchantment);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {
            // 反向击退效果：负值表示反向
            double power = -0.3 * level; // 每级反向击退力度
            target.addVelocity(
                -user.getRotationVector().x * power,
                0.25 * level, // 轻微向上击退
                -user.getRotationVector().z * power
            );
        }
    }
}