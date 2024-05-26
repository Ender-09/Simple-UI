package com.ender09.simple_ui.widgets.addons;

import com.ender09.simple_ui.widgets.SimpleWidget;
import com.ender09.simple_ui.widgets.WidgetDecorator;

public class DraggableWidgetDecorator extends WidgetDecorator implements IDraggableWidget {
    protected int cursorToCenterOffsetX, cursorToCenterOffsetY;

    public DraggableWidgetDecorator(SimpleWidget widget) {
        super(widget);
    }

    @Override
    public void setCursorToCenterOffsetX(int x) {
        cursorToCenterOffsetX = x;
    }
    @Override
    public int getCursorToCenterOffsetX() {
        return cursorToCenterOffsetX;
    }
    @Override
    public void setCursorToCenterOffsetY(int y) {
        cursorToCenterOffsetY = y;
    }
    @Override
    public int getCursorToCenterOffsetY() {
        return cursorToCenterOffsetY;
    }


    public boolean mouseClicked(double pMouseX, double pMouseY, int pButton) {
        if(pButton == 0 && isHovered()) {
            setCursorToCenterOffset((int) pMouseX, (int) pMouseY);
            return true;
        }
        return false;
    }

    public boolean mouseDragged(double pMouseX, double pMouseY, int pButton, double pDragX, double pDragY) {
        moveWidget((int) pMouseX, (int) pMouseY);
        return true;
    }
}
