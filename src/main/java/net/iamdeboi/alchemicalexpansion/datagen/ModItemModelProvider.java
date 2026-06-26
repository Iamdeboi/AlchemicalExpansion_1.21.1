package net.iamdeboi.alchemicalexpansion.datagen;

import net.iamdeboi.alchemicalexpansion.AlchemicalExpansion;
import net.iamdeboi.alchemicalexpansion.block.ModBlocks;
import net.iamdeboi.alchemicalexpansion.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AlchemicalExpansion.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.ALCHEMICAL_BOLUS.get());
        basicItem(ModItems.BELLADONNA.get());
        basicItem(ModItems.ESSENCE_CONTAINER.get());

        basicItem(ModItems.AQUATIC_POWDER.get());
        basicItem(ModItems.ARTHROPOD_POWDER.get());
        basicItem(ModItems.BOTANICAL_POWDER.get());
        basicItem(ModItems.ENDER_POWDER.get());
        basicItem(ModItems.FLESHY_POWDER.get());
        basicItem(ModItems.GLITTERING_POWDER.get());
        basicItem(ModItems.NETHERBOUND_POWDER.get());
        basicItem(ModItems.SPORE_POWDER.get());

        simpleBlockItemBlockTexture(ModBlocks.BELLADONNA_PLANT);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.tryParse("item/generated")).texture("layer0",
                ResourceLocation.tryBuild(AlchemicalExpansion.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.tryParse("item/generated")).texture("layer0",
                ResourceLocation.tryBuild(AlchemicalExpansion.MOD_ID,"block/" + item.getId().getPath()));
    }
}
