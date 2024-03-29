package ru.practicum.emojicon.model;

import ru.practicum.emojicon.engine.Drawable;

public abstract class EmojiObject implements Drawable {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
