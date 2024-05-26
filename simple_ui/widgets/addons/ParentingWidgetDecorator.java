package com.ender09.simple_ui.widgets.addons;

import com.ender09.simple_ui.widgets.SimpleWidget;
import com.ender09.simple_ui.widgets.WidgetDecorator;
import net.minecraft.client.gui.components.AbstractWidget;

public abstract class ParentingWidgetDecorator extends WidgetDecorator {
    protected AbstractWidget parent;
    protected int offsetX, offsetY;

    public ParentingWidgetDecorator(SimpleWidget widget) {
        super(widget);

        this.parent = null;
        this.offsetX = widget.getX();
        this.offsetY = widget.getY();
    }

    @Override
    public int getX() {
        return parent.getX() + offsetX;
    }
    @Override
    public void setX(int pX) {
        this.offsetX = pX;
    }

    @Override
    public int getY() {
        return parent.getY() + offsetY;
    }
    public void setY(int pY) {
        this.offsetY = pY;
    }
}
