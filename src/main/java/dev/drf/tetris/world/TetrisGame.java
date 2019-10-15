package dev.drf.tetris.world;

import dev.drf.tetris.core.Game;

public class TetrisGame implements Game {
    private final Game stepGame;

    public TetrisGame() {
        this.stepGame = new StepByStepGame();
    }
}
