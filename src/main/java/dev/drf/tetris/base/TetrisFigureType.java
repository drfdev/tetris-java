package dev.drf.tetris.base;

import dev.drf.tetris.core.FigureType;

public enum TetrisFigureType implements FigureType {
    I_BLOCK(),
    J_BLOCK(),
    L_BLOCK(),
    O_BLOCK(),
    S_BLOCK(),
    T_BLOCK(),
    Z_BLOCK(),
    ;

    TetrisFigureType() {
    }
}
