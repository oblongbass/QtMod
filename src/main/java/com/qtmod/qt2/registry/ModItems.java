package com.qtmod.qt2.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import com.qtmod.qt2.Comqt2qtmod;
import com.qtmod.qt2.items.PortableCraftingItem;

public class ModItems {
    public static final Item PORTABLE_CRAFTING_TABLE = new PortableCraftingItem(new FabricItemSettings().maxCount(1));

    public static void registerItems() {
        Registry.register(Registries.ITEM,
            new Identifier(Comqt2qtmod.MOD_ID, "portable_crafting"),
            PORTABLE_CRAFTING_TABLE);
    }
}