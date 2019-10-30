package dev.drf.tetris.world.map;

import dev.drf.tetris.core.Configuration;
import dev.drf.tetris.core.map.GameMap;

public class TetrisMap implements GameMap {
    private final Configuration configuration;

    public TetrisMap(Configuration configuration) {
        this.configuration = configuration;
    }

}
