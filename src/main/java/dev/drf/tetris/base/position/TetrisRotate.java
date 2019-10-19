package dev.drf.tetris.base.position;

import dev.drf.tetris.core.position.FigureRotation;
import dev.drf.tetris.core.position.RotateDirection;

public enum TetrisRotate implements FigureRotation {
    LEFT,
    RIGHT,
    ;

    @Override
    public RotateDirection changeDirection(RotateDirection direction) {
        return TetrisRotateUtil.rotate(direction, this);
    }
}
