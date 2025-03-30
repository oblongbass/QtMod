package com.qtmod.qt2.mixin;

import com.qtmod.qt2.registry.ModEnchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class ReverseKnockbackMixin {
    @Inject(method = "takeKnockback", at = @At("HEAD"), cancellable = true)
    private void applyReverseKnockback(double strength, double x, double z, CallbackInfo ci) {
        LivingEntity target = (LivingEntity)(Object)this;
        if (target.getAttacker() instanceof PlayerEntity attacker) {
            int level = EnchantmentHelper.getEquipmentLevel(ModEnchantments.REVERSE_KNOCKBACK, attacker);
            if (level > 0) {
                target.setVelocity(attacker.getRotationVector().multiply(-1.5 * level));
                ci.cancel();
            }
        }
    }
}