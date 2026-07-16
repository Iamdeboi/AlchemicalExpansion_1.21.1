package net.iamdeboi.alchemicalexpansion.effect;

import net.iamdeboi.alchemicalexpansion.AlchemicalExpansion;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AlchemicalExpansion.MOD_ID);

    // Custom Potion Effects
    public static final RegistryObject<MobEffect> SPIDERS_CLIMB_EFFECT = MOB_EFFECTS.register("spiders_climb",
            () -> new SpidersClimbEffect(MobEffectCategory.BENEFICIAL, 0xff3737));
    public static final RegistryObject<MobEffect> GOLDEN_TOUCH_EFFECT = MOB_EFFECTS.register("golden_touch",
            () -> new GoldenTouchEffect(MobEffectCategory.NEUTRAL, 0xcfb53b));


    public static void register (IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
