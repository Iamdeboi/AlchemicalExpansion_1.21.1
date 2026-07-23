package net.iamdeboi.alchemicalexpansion.potion;

import net.iamdeboi.alchemicalexpansion.AlchemicalExpansion;
import net.iamdeboi.alchemicalexpansion.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.TippedArrowRecipe;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.Arrays;

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
            () -> new Potion(
                    (new MobEffectInstance(ModEffects.SPIDERS_CLIMB_EFFECT.getHolder().get(), 2400, 0)),
                    (new MobEffectInstance(MobEffects.SLOW_FALLING, 2400, 0))));
    public static final RegistryObject<Potion> GOLDEN_TOUCH_POTION = POTIONS.register("golden_touch_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.GOLDEN_TOUCH_EFFECT.getHolder().get(), 600, 0)));

    // Upscaled Vanilla Effect Potions:

    // Silky Potion Base:
    public static final RegistryObject<Potion> REFINED_POISON = POTIONS.register("refined_poison_potion",
                () -> new Potion(new MobEffectInstance(MobEffects.POISON, 200, 2)));
    public static final RegistryObject<Potion> REFINED_WEAKNESS = POTIONS.register("refined_weakness_potion",
                () -> new Potion(new MobEffectInstance(MobEffects.WEAKNESS, 600, 1)));
    public static final RegistryObject<Potion> REFINED_SLOWNESS = POTIONS.register("refined_slowness_potion",
            () -> new Potion(
                    (new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 5))));

    // Viscous Potion Base:
    public static final RegistryObject<Potion> REFINED_INSTANT_HEALTH = POTIONS.register("refined_instant_health_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.HEAL, 1, 2)));
    public static final RegistryObject<Potion> REFINED_INSTANT_DAMAGE = POTIONS.register("refined_instant_damage_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.HARM, 1, 2)));
    public static final RegistryObject<Potion> CEASELESS_HUNGER = POTIONS.register("ceaseless_hunger_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.HUNGER, 1200, 4)));
    public static final RegistryObject<Potion> REFINED_SPEED = POTIONS.register("refined_speed_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3300, 2)));
    public static final RegistryObject<Potion> DECAY_POTION = POTIONS.register("decay_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.WITHER, 400, 0)));

    // Bubbly Potion Base:
    public static final RegistryObject<Potion> LIQUID_CONDUIT = POTIONS.register("liquid_conduit_potion",
            () -> new Potion(
                    (new MobEffectInstance(MobEffects.CONDUIT_POWER, 3600, 2)),
                    (new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3600, 1))));

    // Earthy Potion Base:
    public static final RegistryObject<Potion> ABSORPTION_POTION = POTIONS.register("absorption_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 0)));
    public static final RegistryObject<Potion> ABSORPTION_POTION_T2 = POTIONS.register("absorption_potion_t2",
            () -> new Potion(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 1)));
    public static final RegistryObject<Potion> ABSORPTION_POTION_T3 = POTIONS.register("absorption_potion_t3",
            () -> new Potion(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 2)));
    public static final RegistryObject<Potion> RESISTANCE_POTION = POTIONS.register("resistance_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 0)));
    public static final RegistryObject<Potion> RESISTANCE_POTION_T2 = POTIONS.register("resistance_potion_t2",
            () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1800, 1)));
    public static final RegistryObject<Potion> RESISTANCE_POTION_T3 = POTIONS.register("resistance_potion_t3",
            () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 2)));

    // Mushroomy Potion Base:
    public static final RegistryObject<Potion> HEARTY_MEAL = POTIONS.register("hearty_meal",
            () -> new Potion(
                    (new MobEffectInstance(MobEffects.SATURATION, 6)),
                    (new MobEffectInstance(MobEffects.HEALTH_BOOST, 12000, 0))));
    public static final RegistryObject<Potion> HEARTY_MEAL_T2 = POTIONS.register("hearty_meal_t2",
            () -> new Potion(
                    (new MobEffectInstance(MobEffects.SATURATION, 12)),
                    (new MobEffectInstance(MobEffects.HEALTH_BOOST, 12000, 1))));
    public static final RegistryObject<Potion> HEARTY_MEAL_T3 = POTIONS.register("hearty_meal_t3",
            () -> new Potion(
                    (new MobEffectInstance(MobEffects.SATURATION, 24)),
                    (new MobEffectInstance(MobEffects.HEALTH_BOOST, 12000, 2))));
    public static final RegistryObject<Potion> NAUSEATING_TOXIN = POTIONS.register("nauseating_toxin",
            () -> new Potion(
                    (new MobEffectInstance(MobEffects.DARKNESS, 300, 0)),
                    (new MobEffectInstance(MobEffects.BLINDNESS, 300, 1)),
                    (new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 2))));

    // Sparkling Potion Base:
    public static final RegistryObject<Potion> HEROS_DISCOUNT_POTION = POTIONS.register("heros_discount",
            () -> new Potion(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 3600, 0)));
    public static final RegistryObject<Potion> HEROS_DISCOUNT_POTION_T2 = POTIONS.register("heros_discount_t2",
            () -> new Potion(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 3600, 1)));
    public static final RegistryObject<Potion> HEROS_DISCOUNT_POTION_T3 = POTIONS.register("heros_discount_t3",
            () -> new Potion(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 3600, 2)));
    public static final RegistryObject<Potion> HEROS_DISCOUNT_POTION_T4 = POTIONS.register("heros_discount_t4",
            () -> new Potion(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 3600, 3)));
    public static final RegistryObject<Potion> HEROS_DISCOUNT_POTION_T5 = POTIONS.register("heros_discount_t5",
            () -> new Potion(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 3600, 4)));
    public static final RegistryObject<Potion> HASTE_POTION = POTIONS.register("haste_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 1800, 0)));
    public static final RegistryObject<Potion> HASTE_POTION_T2 = POTIONS.register("haste_potion_t2",
            () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 1800, 1)));
    public static final RegistryObject<Potion> HASTE_POTION_T3 = POTIONS.register("haste_potion_t3",
            () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 1800, 2)));
    public static final RegistryObject<Potion> HASTE_POTION_T4 = POTIONS.register("haste_potion_t4",
            () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 1800, 3)));
    public static final RegistryObject<Potion> HASTE_POTION_T5 = POTIONS.register("haste_potion_t5",
            () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 1800, 4)));

    // Spicy Potion Base:
    public static final RegistryObject<Potion> REFINED_REGENERATION = POTIONS.register("refined_regeneration",
            () -> new Potion(new MobEffectInstance(MobEffects.REGENERATION, 1600, 2)));
    public static final RegistryObject<Potion> REFINED_STRENGTH = POTIONS.register("refined_strength",
            () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6600, 2)));
    public static final RegistryObject<Potion> REFINED_FIRE_RESISTANCE = POTIONS.register("refined_fire_resistance",
            () -> new Potion(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 15600)));

    // Unstable Potion Base:
    public static final RegistryObject<Potion> SPONTANEOUS_GENERATION_POTION = POTIONS.register("spontaneous_generation_potion",
            () -> new Potion(
                    (new MobEffectInstance(MobEffects.OOZING, 1200, 0))));
    public static final RegistryObject<Potion> SPONTANEOUS_GENERATION_POTION_T2 = POTIONS.register("spontaneous_generation_potion_t2",
            () -> new Potion(
                    (new MobEffectInstance(MobEffects.OOZING, 1600, 1)),
                    (new MobEffectInstance(MobEffects.WEAVING, 1600, 0))));
    public static final RegistryObject<Potion> SPONTANEOUS_GENERATION_POTION_T3 = POTIONS.register("spontaneous_generation_potion_t3",
            () -> new Potion(
                    (new MobEffectInstance(MobEffects.OOZING, 2000, 2)),
                    (new MobEffectInstance(MobEffects.WEAVING, 2000, 1)),
                    (new MobEffectInstance(MobEffects.INFESTED, 2000, 0))));
    public static final RegistryObject<Potion> SPONTANEOUS_GENERATION_POTION_T4 = POTIONS.register("spontaneous_generation_potion_t4",
            () -> new Potion(
                    (new MobEffectInstance(MobEffects.OOZING, 2400, 3)),
                    (new MobEffectInstance(MobEffects.WEAVING, 2400, 2)),
                    (new MobEffectInstance(MobEffects.INFESTED, 2400, 1)),
                    (new MobEffectInstance(MobEffects.WIND_CHARGED, 2400, 0))));


    public static void register(IEventBus modEventBus) {
        POTIONS.register(modEventBus);
    }
}
