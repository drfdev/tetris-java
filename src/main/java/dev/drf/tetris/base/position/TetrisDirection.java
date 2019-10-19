package dev.drf.tetris.base.position;

import dev.drf.tetris.core.position.FigureRotation;
import dev.drf.tetris.core.position.RotateDirection;

public enum TetrisDirection implements RotateDirection {
    TOP,
    LEFT,
    RIGHT,
    BOTTOM,
    ;

    @Override
    public RotateDirection rotate(FigureRotation rotation) {
        return rotation.changeDirection(this);
    }
}