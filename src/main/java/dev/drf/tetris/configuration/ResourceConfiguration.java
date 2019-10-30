package dev.drf.tetris.configuration;

import dev.drf.tetris.core.Configuration;

public class ResourceConfiguration implements Configuration {
    private int width;
    private int height;

    @Override
    public int mapWidth() {
        return getWidth();
    }

    @Override
    public int mapHeight() {
        return getHeight();
    }

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
