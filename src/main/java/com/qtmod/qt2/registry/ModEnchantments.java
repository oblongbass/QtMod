package com.qtmod.qt2.registry;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {
    public static final Enchantment REVERSE_KNOCKBACK = new ReverseKnockbackEnchantment();

    public static void registerEnchantments() {
        Registry.register(
            Registries.ENCHANTMENT,
            new Identifier("comqt2qtmod", "reverse_knockback"),
            REVERSE_KNOCKBACK
        );
    }

    public static class ReverseKnockbackEnchantment extends Enchantment {
        public ReverseKnockbackEnchantment() {
            super(
                Rarity.UNCOMMON,
                EnchantmentTarget.WEAPON,
                new EquipmentSlot[]{ EquipmentSlot.MAINHAND }
            );
        }
    }
}