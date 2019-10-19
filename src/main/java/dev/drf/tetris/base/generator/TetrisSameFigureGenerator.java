package dev.drf.tetris.base.generator;

import dev.drf.tetris.base.TetrisFigure;
import dev.drf.tetris.core.Figure;
import dev.drf.tetris.core.FigureType;
import dev.drf.tetris.core.generator.FigureGenerator;
import dev.drf.tetris.core.generator.RotateDirectionGenerator;

class TetrisSameFigureGenerator implements FigureGenerator {
    private final FigureType type;
    private final RotateDirectionGenerator directionGenerator;

    TetrisSameFigureGenerator(FigureType type, RotateDirectionGenerator directionGenerator) {
        this.type = type;
        this.directionGenerator = directionGenerator;
    }

    @Override
    public Figure nextFigure() {
        return new TetrisFigure(type,
                directionGenerator.nextRotateDirection());
    }
}
