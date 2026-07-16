package net.iamdeboi.alchemicalexpansion.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.iamdeboi.alchemicalexpansion.AlchemicalExpansion;
import net.iamdeboi.alchemicalexpansion.block.ModBlocks;
import net.iamdeboi.alchemicalexpansion.recipe.ModRecipes;
import net.iamdeboi.alchemicalexpansion.recipe.MortarAndPestleGrindingRecipe;
import net.iamdeboi.alchemicalexpansion.screen.custom.MortarAndPestleScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

@JeiPlugin
public class JEIAlchemicalExpansionPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(AlchemicalExpansion.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new MortarAndPestleRecipeCategory(
                registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<MortarAndPestleGrindingRecipe> mortarAndPestleRecipes = recipeManager
                .getAllRecipesFor(ModRecipes.MORTAR_AND_PESTLE_TYPE.get()).stream().map(RecipeHolder::value).toList();
        registration.addRecipes(MortarAndPestleRecipeCategory.MORTAR_AND_PESTLE_GRINDING_RECIPE_RECIPE_TYPE, mortarAndPestleRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(MortarAndPestleScreen.class, 72, 17, 30, 35,
                MortarAndPestleRecipeCategory.MORTAR_AND_PESTLE_GRINDING_RECIPE_RECIPE_TYPE);
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.MORTAR_AND_PESTLE_BLOCK.get().asItem()),
                MortarAndPestleRecipeCategory.MORTAR_AND_PESTLE_GRINDING_RECIPE_RECIPE_TYPE);
    }
}
