package net.iamdeboi.alchemicalexpansion.screen;

import net.iamdeboi.alchemicalexpansion.AlchemicalExpansion;
import net.iamdeboi.alchemicalexpansion.screen.custom.MortarAndPestleMenu;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes  {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(Registries.MENU, AlchemicalExpansion.MOD_ID);

    public static final RegistryObject<MenuType<MortarAndPestleMenu>> MORTAR_AND_PESTLE_MENU =
            MENUS.register("mortar_and_pestle_menu", () -> IForgeMenuType.create(MortarAndPestleMenu::new));


    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
