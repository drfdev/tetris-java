package dev.drf.tetris.base.generator;

import dev.drf.tetris.core.generator.RotateDirectionGenerator;
import dev.drf.tetris.core.position.RotateDirection;

class TetrisSameRotateDirectionGenerator implements RotateDirectionGenerator {
    private final RotateDirection rotateDirection;

    TetrisSameRotateDirectionGenerator(RotateDirection rotateDirection) {
        this.rotateDirection = rotateDirection;
    }

    @Override
    public RotateDirection nextRotateDirection() {
        return rotateDirection;
    }
}
