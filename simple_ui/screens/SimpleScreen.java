package com.ender09.simple_ui.screens;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public abstract class SimpleScreen extends Screen {
    protected SimpleScreen(Component pTitle) {
        super(pTitle);
    }
}
