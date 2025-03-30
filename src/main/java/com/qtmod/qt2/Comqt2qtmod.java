package com.qtmod.qt2;

import net.fabricmc.api.ModInitializer;
import com.qtmod.qt2.registry.ModItems;
import com.qtmod.qt2.registry.ModEnchantments;

public class Comqt2qtmod implements ModInitializer {
    // 常量必须定义在类内部
    public static final String MOD_ID = "comqt2qtmod";

    @Override
    public void onInitialize() {
        // 方法调用必须位于方法块内
        ModItems.registerItems();
        ModEnchantments.registerEnchantments();
    }
}