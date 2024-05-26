package com.ender09.simple_ui.widgets.addons;

public interface IDraggableWidget {
    int getX();
    void setX(int x);
    int getY();
    void setY(int y);

    default void setCursorToCenterOffsetX(int x) {}
    default int getCursorToCenterOffsetX() {
        return 0;
    }
    default void setCursorToCenterOffsetY(int y){}
    default int getCursorToCenterOffsetY() {
        return 0;
    }

    default void setCursorToCenterOffset(int mouseX, int mouseY) {
        setCursorToCenterOffsetX(getX() - mouseX);
        setCursorToCenterOffsetY(getY() - mouseY);
    }
    default void moveWidget(int mouseX, int mouseY) {
        setX(mouseX + getCursorToCenterOffsetX());
        setY(mouseY + getCursorToCenterOffsetY());
    }
}
