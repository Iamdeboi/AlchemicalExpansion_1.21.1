package net.iamdeboi.alchemicalexpansion.datagen;

import net.iamdeboi.alchemicalexpansion.AlchemicalExpansion;
import net.iamdeboi.alchemicalexpansion.block.ModBlocks;
import net.iamdeboi.alchemicalexpansion.item.ModItems;
import net.iamdeboi.alchemicalexpansion.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }


    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ESSENCE_CONTAINER.get(), 3)
                .pattern("G G")
                .pattern("GGG")
                .define('G', Tags.Items.GLASS)
                .unlockedBy(getHasName(Items.GLASS), has(Items.GLASS)).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MORTAR_AND_PESTLE_BLOCK.get())
                .requires(Items.STICK)
                .requires(Items.BOWL)
                .unlockedBy(getHasName(Items.BOWL), has(Items.BOWL)).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALCHEMICAL_BOLUS.get())
                .pattern(" B ")
                .pattern("BPB")
                .pattern(" B ")
                .define('B', Items.BONE_MEAL)
                .define('P', ModTags.Items.ALCHEMICAL_POWDERS)
                .unlockedBy(getHasName(Items.BONE_MEAL), has(Items.BONE_MEAL)).save(pRecipeOutput);

    }
}