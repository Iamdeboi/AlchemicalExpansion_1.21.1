package net.iamdeboi.alchemicalexpansion.event;

import net.iamdeboi.alchemicalexpansion.AlchemicalExpansion;
import net.iamdeboi.alchemicalexpansion.item.ModItems;
import net.iamdeboi.alchemicalexpansion.potion.ModPotions;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.common.brewing.BrewingRecipe;
import net.minecraftforge.event.brewing.BrewingRecipeRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Set;

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

        // Spider's Climb:
        builder.addMix(ModPotions.SILKY_POTION.getHolder().get(), ModItems.ARTHROPOD_POWDER.get(), ModPotions.SPIDERS_CLIMB_POTION.getHolder().get());
    }
}



