package net.iamdeboi.alchemicalexpansion.effect;

import net.iamdeboi.alchemicalexpansion.AlchemicalExpansion;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.UUID;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AlchemicalExpansion.MOD_ID);

    // Custom Base Potion Effect Placeholders
    public static final RegistryObject<MobEffect> SILKY_EFFECT = MOB_EFFECTS.register("silky",
            () -> new BaseSilkyEffect(MobEffectCategory.NEUTRAL, 0xebd1d1));
    public static final RegistryObject<MobEffect> VISCOUS_EFFECT = MOB_EFFECTS.register("viscous",
            () -> new BaseSilkyEffect(MobEffectCategory.NEUTRAL, 0xd42b2b));
    public static final RegistryObject<MobEffect> BUBBLY_EFFECT = MOB_EFFECTS.register("bubbly",
            () -> new BaseSilkyEffect(MobEffectCategory.NEUTRAL, 0x5fcde4));
    public static final RegistryObject<MobEffect> EARTHY_EFFECT = MOB_EFFECTS.register("earthy",
            () -> new BaseSilkyEffect(MobEffectCategory.NEUTRAL, 0xd42b2b));
    public static final RegistryObject<MobEffect> SPICY_EFFECT = MOB_EFFECTS.register("spicy",
            () -> new BaseSilkyEffect(MobEffectCategory.NEUTRAL, 0xad581e));
    public static final RegistryObject<MobEffect> MUSHROOMY_EFFECT = MOB_EFFECTS.register("mushroomy",
            () -> new BaseSilkyEffect(MobEffectCategory.NEUTRAL, 0x3a2333));
    public static final RegistryObject<MobEffect> UNSTABLE_EFFECT = MOB_EFFECTS.register("unstable",
            () -> new BaseSilkyEffect(MobEffectCategory.NEUTRAL, 0x650d49));
    public static final RegistryObject<MobEffect> SPARKLING_EFFECT = MOB_EFFECTS.register("sparkling",
            () -> new BaseSilkyEffect(MobEffectCategory.NEUTRAL, 0xc4904d));

    // Custom Potion Effects
    public static final RegistryObject<MobEffect> SPIDERS_CLIMB_EFFECT = MOB_EFFECTS.register("spiders_climb",
            () -> new SpidersClimbEffect(MobEffectCategory.NEUTRAL, 0xff3737));



    public static void register (IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
