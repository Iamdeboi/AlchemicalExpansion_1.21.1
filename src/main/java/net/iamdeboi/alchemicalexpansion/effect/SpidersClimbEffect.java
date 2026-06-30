package net.iamdeboi.alchemicalexpansion.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.phys.Vec3;

public class SpidersClimbEffect extends MobEffect {

    public SpidersClimbEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);

    }

    @Override
    public boolean applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {

        // Climbing Effect which activates when in horizontal contact with a surface (wall climbing!)
        if (pLivingEntity.horizontalCollision) {
            Vec3 initialVec = pLivingEntity.getDeltaMovement();
            Vec3 climbVec = new Vec3(initialVec.x, 0.2D, initialVec.z);
            pLivingEntity.setDeltaMovement(climbVec.scale(0.97D));
            return true;
        }

        return super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int pDuration, int pAmplifier) {
        return true;
    }

}

