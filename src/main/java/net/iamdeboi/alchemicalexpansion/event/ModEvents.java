package net.iamdeboi.alchemicalexpansion.event;

import net.iamdeboi.alchemicalexpansion.AlchemicalExpansion;
import net.iamdeboi.alchemicalexpansion.effect.ModEffects;
import net.iamdeboi.alchemicalexpansion.item.ModItems;
import net.iamdeboi.alchemicalexpansion.potion.ModPotions;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.brewing.BrewingRecipeRegisterEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Arrays;
import java.util.List;


@Mod.EventBusSubscriber(modid = AlchemicalExpansion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEvents {

    @SubscribeEvent
    public static void onBrewingRecipeRegister(BrewingRecipeRegisterEvent event) {
        PotionBrewing.Builder builder = event.getBuilder();
        // New Potion Bases:
        builder.addMix(Potions.WATER, ModItems.ARTHROPOD_POWDER.get(), ModPotions.SILKY_POTION.getHolder().get());
        builder.addMix(Potions.WATER, ModItems.FLESHY_POWDER.get(), ModPotions.VISCOUS_POTION.getHolder().get());
        builder.addMix(Potions.WATER, ModItems.AQUATIC_POWDER.get(), ModPotions.BUBBLY_POTION.getHolder().get());
        builder.addMix(Potions.WATER, ModItems.BOTANICAL_POWDER.get(), ModPotions.EARTHY_POTION.getHolder().get());
        builder.addMix(Potions.WATER, ModItems.SPORE_POWDER.get(), ModPotions.MUSHROOMY_POTION.getHolder().get());
        builder.addMix(Potions.WATER, ModItems.GLITTERING_POWDER.get(), ModPotions.SPARKLING_POTION.getHolder().get());
        builder.addMix(Potions.WATER, ModItems.NETHERBOUND_POWDER.get(), ModPotions.SPICY_POTION.getHolder().get());
        builder.addMix(Potions.WATER, ModItems.ENDER_POWDER.get(), ModPotions.UNSTABLE_POTION.getHolder().get());

        // Custom Effect Potions:
        builder.addMix(ModPotions.SILKY_POTION.getHolder().get(), Items.COBWEB, ModPotions.SPIDERS_CLIMB_POTION.getHolder().get());
        builder.addMix(ModPotions.SPARKLING_POTION.getHolder().get(), Items.GOLDEN_APPLE, ModPotions.GOLDEN_TOUCH_POTION.getHolder().get());
        builder.addMix(ModPotions.SPARKLING_POTION.getHolder().get(), Items.IRON_AXE, ModPotions.HEROS_DISCOUNT_POTION.getHolder().get());
        builder.addMix(ModPotions.HEROS_DISCOUNT_POTION.getHolder().get(), Items.CROSSBOW, ModPotions.HEROS_DISCOUNT_POTION_T2.getHolder().get());
        builder.addMix(ModPotions.HEROS_DISCOUNT_POTION_T2.getHolder().get(), Items.EMERALD, ModPotions.HEROS_DISCOUNT_POTION_T3.getHolder().get());
        builder.addMix(ModPotions.HEROS_DISCOUNT_POTION_T3.getHolder().get(), Items.EMERALD_BLOCK, ModPotions.HEROS_DISCOUNT_POTION_T4.getHolder().get());
        builder.addMix(ModPotions.HEROS_DISCOUNT_POTION_T4.getHolder().get(), Items.TOTEM_OF_UNDYING, ModPotions.HEROS_DISCOUNT_POTION_T5.getHolder().get());

        //Upscaled Vanilla Effect Potions:
        // Silky Potion Base:
        builder.addMix(ModPotions.SILKY_POTION.getHolder().get(), Items.PUFFERFISH, ModPotions.REFINED_POISON.getHolder().get());
        builder.addMix(ModPotions.SILKY_POTION.getHolder().get(), Items.FERMENTED_SPIDER_EYE, ModPotions.REFINED_WEAKNESS.getHolder().get());
        // Viscous Potion Base:
        builder.addMix(ModPotions.VISCOUS_POTION.getHolder().get(), Items.MELON, ModPotions.REFINED_INSTANT_HEALTH.getHolder().get());
        builder.addMix(ModPotions.VISCOUS_POTION.getHolder().get(), ModItems.ARTHROPOD_POWDER.get(), ModPotions.REFINED_INSTANT_DAMAGE.getHolder().get());
        builder.addMix(ModPotions.VISCOUS_POTION.getHolder().get(), Items.ROTTEN_FLESH, ModPotions.CEASELESS_HUNGER.getHolder().get());
        // Bubbly Potion Base:
        builder.addMix(ModPotions.BUBBLY_POTION.getHolder().get(), Items.CONDUIT, ModPotions.LIQUID_CONDUIT.getHolder().get());
        // Earthy Potion Base:
        // Mushroomy Potion Base:
        builder.addMix(ModPotions.MUSHROOMY_POTION.getHolder().get(), Items.CARROT, ModPotions.HEARTY_MEAL.getHolder().get());
        builder.addMix(ModPotions.HEARTY_MEAL.getHolder().get(), Items.BAKED_POTATO, ModPotions.HEARTY_MEAL_T2.getHolder().get());
        builder.addMix(ModPotions.HEARTY_MEAL_T2.getHolder().get(), Items.PUMPKIN_PIE, ModPotions.HEARTY_MEAL_T3.getHolder().get());
        // Glittering Powder Base:
        // Netherbound Powder Base:
        // Ender Powder Base:
    }

    @SubscribeEvent
    public static void onBlockBreak(BlockEvent.BreakEvent event) {
        BlockState state = event.getState();
        Block block = state.getBlock();
        if(!event.getLevel().isClientSide()){
            // Golden Touch Effect: Replace the drop of a broken block with a golden ingot
            if (event.getPlayer().hasEffect(ModEffects.GOLDEN_TOUCH_EFFECT.getHolder().get())) {
                event.setCanceled(true);
                event.getLevel().removeBlock(event.getPos(), false);
                Block.popResource((Level) event.getLevel(), event.getPos(), new ItemStack(Items.GOLD_INGOT, 1));
            }
        }

    }


}



