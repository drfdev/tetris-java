package dev.drf.tetris.base.position;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TetrisRotateUtilTest {

    @Test
    public void shouldRotate() {
        assertEquals(TetrisDirection.BOTTOM, TetrisRotateUtil.rotate(TetrisDirection.LEFT, TetrisRotate.LEFT));
        assertEquals(TetrisDirection.LEFT, TetrisRotateUtil.rotate(TetrisDirection.TOP, TetrisRotate.LEFT));
        assertEquals(TetrisDirection.TOP, TetrisRotateUtil.rotate(TetrisDirection.RIGHT, TetrisRotate.LEFT));
        assertEquals(TetrisDirection.RIGHT, TetrisRotateUtil.rotate(TetrisDirection.BOTTOM, TetrisRotate.LEFT));

        assertEquals(TetrisDirection.TOP, TetrisRotateUtil.rotate(TetrisDirection.LEFT, TetrisRotate.RIGHT));
        assertEquals(TetrisDirection.RIGHT, TetrisRotateUtil.rotate(TetrisDirection.TOP, TetrisRotate.RIGHT));
        assertEquals(TetrisDirection.BOTTOM, TetrisRotateUtil.rotate(TetrisDirection.RIGHT, TetrisRotate.RIGHT));
        assertEquals(TetrisDirection.LEFT, TetrisRotateUtil.rotate(TetrisDirection.BOTTOM, TetrisRotate.RIGHT));
    }
}
