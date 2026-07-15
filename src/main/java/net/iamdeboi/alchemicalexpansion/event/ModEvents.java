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

        //Upscaled Vanilla Effect Potions:
        builder.addMix(ModPotions.SILKY_POTION.getHolder().get(), Items.PUFFERFISH, ModPotions.ADVANCED_POISON.getHolder().get());
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



