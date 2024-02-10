package com.scully06.coffee.item;

import com.scully06.coffee.CoffeeMod;
import com.scully06.coffee.ModFoodComponents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COFFEE = registerItem("coffee", new Item(new FabricItemSettings().food(ModFoodComponents.COFFEE)));
    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries){
        entries.add(COFFEE);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(CoffeeMod.MOD_ID,name), item);
    }
    public static void registerModItems(){
        CoffeeMod.LOGGER.info("Registering Mod Items for " + CoffeeMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodItemGroup);
    }
}
