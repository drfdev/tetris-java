package dev.drf.tetris.base;

import dev.drf.tetris.core.Figure;
import dev.drf.tetris.core.FigureType;
import dev.drf.tetris.core.position.FigureRotation;
import dev.drf.tetris.core.position.RotateDirection;

public class TetrisFigure implements Figure {
    private final FigureType type;
    private RotateDirection direction;

    public TetrisFigure(FigureType type, RotateDirection direction) {
        this.type = type;
        this.direction = direction;
    }

    @Override
    public FigureType getType() {
        return type;
    }

    @Override
    public RotateDirection rotate(FigureRotation rotation) {
        direction = direction.rotate(rotation);
        return direction;
    }

    @Override
    public RotateDirection currentDirection() {
        return direction;
    }
}
