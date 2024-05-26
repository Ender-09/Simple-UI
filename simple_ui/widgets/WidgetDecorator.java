package com.ender09.simple_ui.widgets;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.narration.NarrationElementOutput;
import net.minecraft.network.chat.Component;

public class WidgetDecorator extends AbstractWidget {
    public WidgetDecorator(SimpleWidget widget) {
        super(widget.getX(), widget.getY(), widget.getWidth(), widget.getHeight(), Component.empty());
    }

    @Override
    protected void renderWidget(GuiGraphics guiGraphics, int i, int i1, float v) {

    }

    @Override
    protected void updateWidgetNarration(NarrationElementOutput narrationElementOutput) {

    }
}
