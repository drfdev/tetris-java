package dev.drf.tetris.world;

import dev.drf.tetris.core.Configuration;
import dev.drf.tetris.core.Game;
import dev.drf.tetris.core.map.GameMap;
import dev.drf.tetris.world.map.TetrisMap;

public class StepByStepGame implements Game {
    private final GameMap map;

    public StepByStepGame(Configuration configuration) {
        this.map = new TetrisMap(configuration);
    }
}
