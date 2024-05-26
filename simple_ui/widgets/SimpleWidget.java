package com.ender09.simple_ui.widgets;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.network.chat.Component;

public abstract class SimpleWidget extends AbstractWidget {
    protected WidgetDecorator widgetDecorator;

    public SimpleWidget(int pX, int pY, int pWidth, int pHeight) {
        super(pX, pY, pWidth, pHeight, Component.empty());
        widgetDecorator = new WidgetDecorator(this);
    }


    @Override
    public int getX() {
        return widgetDecorator.getX();
    }
    @Override
    public void setX(int pX) {
        widgetDecorator.setX(pX);
    }

    @Override
    public int getY() {
        return widgetDecorator.getY();
    }
    @Override
    public void setY(int pY) {
        widgetDecorator.setY(pY);
    }

    @Override
    public int getWidth() {
        return widgetDecorator.getWidth();
    }
    @Override
    public void setWidth(int pWidth) {
        widgetDecorator.setWidth(pWidth);
    }

    @Override
    public int getHeight() {
        return widgetDecorator.getHeight();
    }
    @Override
    public void setHeight(int pHeight) {
        widgetDecorator.setHeight(pHeight);
    }


    @Override
    public void render(GuiGraphics pGuiGraphics, int pMouseX, int pMouseY, float pPartialTick) {
        widgetDecorator.render(pGuiGraphics, pMouseX, pMouseY, pPartialTick);
    }
    @Override
    protected void renderWidget(GuiGraphics guiGraphics, int i, int i1, float v) {
        widgetDecorator.renderWidget(guiGraphics, i, i1, v);
    }


    @Override
    public boolean mouseClicked(double pMouseX, double pMouseY, int pButton) {
        widgetDecorator.mouseClicked(pMouseX, pMouseY, pButton);
        return super.mouseClicked(pMouseX, pMouseY, pButton);
    }
    @Override
    public boolean mouseDragged(double pMouseX, double pMouseY, int pButton, double pDragX, double pDragY) {
        widgetDecorator.mouseDragged(pMouseX, pMouseY, pButton, pDragX, pDragY);
        return super.mouseDragged(pMouseX, pMouseY, pButton, pDragX, pDragY);
    }
}
