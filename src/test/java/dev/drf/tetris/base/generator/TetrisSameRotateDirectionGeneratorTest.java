package dev.drf.tetris.base.generator;

import dev.drf.tetris.base.position.TetrisDirection;
import dev.drf.tetris.core.position.RotateDirection;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class TetrisSameRotateDirectionGeneratorTest {
    private TetrisSameRotateDirectionGenerator generator = new TetrisSameRotateDirectionGenerator(TetrisDirection.BOTTOM);

    @Test
    public void shouldNextFigure() {
        Stream.iterate(0, n -> n + 1)
                .limit(100)
                .forEach(x ->
                        {
                            RotateDirection direction = generator.nextRotateDirection();
                            assertEquals(TetrisDirection.BOTTOM, direction);
                        }
                );
    }
}
