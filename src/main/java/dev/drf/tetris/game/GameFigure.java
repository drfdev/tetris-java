package dev.drf.tetris.game;

import dev.drf.tetris.core.Figure;
import dev.drf.tetris.core.FigureType;
import dev.drf.tetris.core.position.FigureRotation;
import dev.drf.tetris.core.position.RotateDirection;

public class GameFigure implements Figure {
    private final FigureType type;

    private RotateDirection direction;

    public GameFigure(FigureType type) {
        this.type = type;
    }

    @Override
    public FigureType getType() {
        return type;
    }

    @Override
    public RotateDirection rotate(FigureRotation rotation) {
        return direction.rotate(rotation);
    }
}
