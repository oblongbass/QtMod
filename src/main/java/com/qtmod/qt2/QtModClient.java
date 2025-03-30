package com.qtmod.qt2;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QtModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // 客户端专用初始化
        LoggerFactory.getLogger(Comqt2qtmod.MOD_ID).info("Client setup complete");
    }
}