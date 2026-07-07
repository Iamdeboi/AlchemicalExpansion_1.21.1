package net.iamdeboi.alchemicalexpansion;

import com.mojang.logging.LogUtils;
import net.iamdeboi.alchemicalexpansion.block.ModBlocks;
import net.iamdeboi.alchemicalexpansion.block.entity.ModBlockEntities;
import net.iamdeboi.alchemicalexpansion.effect.ModEffects;
import net.iamdeboi.alchemicalexpansion.item.ModCreativeModeTabs;
import net.iamdeboi.alchemicalexpansion.item.ModItems;
import net.iamdeboi.alchemicalexpansion.potion.ModPotions;
import net.iamdeboi.alchemicalexpansion.recipe.ModRecipes;
import net.iamdeboi.alchemicalexpansion.screen.ModMenuTypes;
import net.iamdeboi.alchemicalexpansion.screen.custom.MortarAndPestleScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AlchemicalExpansion.MOD_ID)
public class AlchemicalExpansion {
    public static final String MOD_ID = "alchemicalexpansion";
    public static final Logger LOGGER = LogUtils.getLogger();

    public AlchemicalExpansion() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        //Register Creative Mode Tab for the mod
        ModCreativeModeTabs.register(modEventBus);

        // Register ModItem Registry
        ModItems.register(modEventBus);
        // Register ModBlocks Registry
        ModBlocks.register(modEventBus);

        // Register ModBlockEntities Registry
        ModBlockEntities.register(modEventBus);

        // Register ModMenu Registry
        ModMenuTypes.register(modEventBus);

        // Register ModRecipes Registry
        ModRecipes.register(modEventBus);

        // Register ModEffects Registry
        ModEffects.register(modEventBus);

        // Register ModPotions Registry
        ModPotions.register(modEventBus);



        modEventBus.addListener(this::addCreative);

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BELLADONNA_PLANT.getId(), ModBlocks.POTTED_BELLADONNA);

        });
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(final FMLClientSetupEvent event) {
            MenuScreens.register(ModMenuTypes.MORTAR_AND_PESTLE_MENU.get(), MortarAndPestleScreen::new);
        }
    }


}