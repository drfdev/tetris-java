package dev.drf.tetris.core;

import dev.drf.tetris.core.position.FigureRotation;
import dev.drf.tetris.core.position.RotateDirection;

public interface Figure {

    FigureType getType();
    RotateDirection rotate(FigureRotation startRotation);
}
