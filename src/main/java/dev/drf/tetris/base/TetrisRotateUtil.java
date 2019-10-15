package dev.drf.tetris.base;

import dev.drf.tetris.core.position.RotateDirection;

import java.util.Arrays;
import java.util.List;

final class TetrisRotateUtil {
    private static final List<RotateDirection> DIRECTIONS_CLOCKWISE = Arrays.asList(
            TetrisDirection.LEFT,
            TetrisDirection.TOP,
            TetrisDirection.RIGHT,
            TetrisDirection.BOTTOM
    );
    private TetrisRotateUtil() {
    }

    static RotateDirection rotate(RotateDirection direction, TetrisRotate rotation) {
        int index = DIRECTIONS_CLOCKWISE.indexOf(direction);

        if (rotation == TetrisRotate.LEFT) {
            index--;
        } else if (rotation == TetrisRotate.RIGHT) {
            index++;
        }

        if (index <= 0) {
            index = DIRECTIONS_CLOCKWISE.size() - 1;
        }
        if (index >= DIRECTIONS_CLOCKWISE.size()) {
            index = 0;
        }

        return DIRECTIONS_CLOCKWISE.get(index);
    }
}
