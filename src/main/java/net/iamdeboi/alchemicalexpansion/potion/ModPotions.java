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
            () -> new Potion(new MobEffectInstance(ModEffects.SPIDERS_CLIMB_EFFECT.getHolder().get(), 2400, 0)));
    public static final RegistryObject<Potion> GOLDEN_TOUCH_POTION = POTIONS.register("golden_touch_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.GOLDEN_TOUCH_EFFECT.getHolder().get(), 600, 0)));


    // Upscaled Vanilla Effect Potions:
    // Silky Potion Base:
    public static final RegistryObject<Potion> REFINED_POISON = POTIONS.register("refined_poison_potion",
                () -> new Potion(new MobEffectInstance(MobEffects.POISON, 200, 2)));
    public static final RegistryObject<Potion> REFINED_WEAKNESS = POTIONS.register("refined_weakness_potion",
                () -> new Potion(new MobEffectInstance(MobEffects.WEAKNESS, 600, 1)));
    // Viscous Potion Base:
    public static final RegistryObject<Potion> REFINED_INSTANT_HEALTH = POTIONS.register("refined_instant_health_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.HEAL, 1, 2)));
    public static final RegistryObject<Potion> REFINED_INSTANT_DAMAGE = POTIONS.register("refined_instant_damage_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.HARM, 1, 2)));
    public static final RegistryObject<Potion> CEASELESS_HUNGER = POTIONS.register("ceaseless_hunger_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.HUNGER, 1200, 4)));
    // Bubbly Potion Base:
    public static final RegistryObject<Potion> LIQUID_CONDUIT = POTIONS.register("liquid_conduit_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.CONDUIT_POWER, 1800, 2)));
    // Earthy Potion Base:
    // Mushroomy Potion Base:
    public static final RegistryObject<Potion> HEARTY_MEAL = POTIONS.register("hearty_meal",
            () -> new Potion(
                    (new MobEffectInstance(MobEffects.SATURATION, 200, 1)),
                    (new MobEffectInstance(MobEffects.HEALTH_BOOST, 12000, 0))));
    public static final RegistryObject<Potion> HEARTY_MEAL_T2 = POTIONS.register("hearty_meal_t2",
            () -> new Potion(
                    (new MobEffectInstance(MobEffects.SATURATION, 200, 3)),
                    (new MobEffectInstance(MobEffects.HEALTH_BOOST, 12000, 1))));
    public static final RegistryObject<Potion> HEARTY_MEAL_T3 = POTIONS.register("hearty_meal_t3",
            () -> new Potion(
                    (new MobEffectInstance(MobEffects.SATURATION, 200, 5)),
                    (new MobEffectInstance(MobEffects.HEALTH_BOOST, 12000, 2))));
    // Glittering Powder Base:
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
    // Netherbound Powder Base:
    // Ender Powder Base:


    public static void register(IEventBus modEventBus) {
        POTIONS.register(modEventBus);
    }
}
