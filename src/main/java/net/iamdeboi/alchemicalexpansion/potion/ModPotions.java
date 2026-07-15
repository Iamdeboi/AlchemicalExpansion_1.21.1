package net.iamdeboi.alchemicalexpansion.potion;

import net.iamdeboi.alchemicalexpansion.AlchemicalExpansion;
import net.iamdeboi.alchemicalexpansion.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, AlchemicalExpansion.MOD_ID);

    // New Potion Bases (No Effects):
    public static final RegistryObject<Potion> SILKY_POTION = POTIONS.register("silky_potion",
            () -> new Potion());
    public static final RegistryObject<Potion> VISCOUS_POTION = POTIONS.register("viscous_potion",
            () -> new Potion());
    public static final RegistryObject<Potion> BUBBLY_POTION = POTIONS.register("bubbly_potion",
            () -> new Potion());
    public static final RegistryObject<Potion> EARTHY_POTION = POTIONS.register("earthy_potion",
            () -> new Potion());
    public static final RegistryObject<Potion> MUSHROOMY_POTION = POTIONS.register("mushroomy_potion",
            () -> new Potion());
    public static final RegistryObject<Potion> SPARKLING_POTION = POTIONS.register("sparkling_potion",
            () -> new Potion());
    public static final RegistryObject<Potion> SPICY_POTION = POTIONS.register("spicy_potion",
            () -> new Potion());
    public static final RegistryObject<Potion> UNSTABLE_POTION = POTIONS.register("unstable_potion",
            () -> new Potion());

    // New Potion Recipes With New Effects:
    public static final RegistryObject<Potion> SPIDERS_CLIMB_POTION = POTIONS.register("spiders_climb_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.SPIDERS_CLIMB_EFFECT.getHolder().get(), 2400, 0)));
    public static final RegistryObject<Potion> GOLDEN_TOUCH_POTION = POTIONS.register("golden_touch_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.GOLDEN_TOUCH_EFFECT.getHolder().get(), 600, 0)));

    // Upscaled Vanilla Effect Potions:
    public static final RegistryObject<Potion> ADVANCED_POISON = POTIONS.register("advanced_poison_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.POISON, 200, 2)));

    public static void register(IEventBus modEventBus) {
        POTIONS.register(modEventBus);
    }
}
