package net.iamdeboi.alchemicalexpansion.datagen;

import net.iamdeboi.alchemicalexpansion.AlchemicalExpansion;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = AlchemicalExpansion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        PackOutput packOutput = gen.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // Generates recipes
        gen.addProvider(event.includeServer(), new ModRecipeProvider(packOutput, lookupProvider));
        // Generates custom loot block tables
        gen.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(),
                        List.of(new LootTableProvider.SubProviderEntry(ModBlockLootTables::new, LootContextParamSets.BLOCK)), lookupProvider));

        // Generates Block States
        gen.addProvider(event.includeClient(), new ModBlockStateProvider(packOutput, existingFileHelper));
        // Generates Item Models
        gen.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));
        // Block Tag Generation
        ModBlockTagGenerator blockTagGenerator = gen.addProvider(event.includeServer(),
                new ModBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
        gen.addProvider(event.includeServer(), new ModItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper ));

    }
}
