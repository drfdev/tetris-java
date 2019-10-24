package dev.drf.tetris.base.generator;


import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertNotNull;

public class TetrisRotateDirectionGeneratorTest {
    private TetrisRotateDirectionGenerator generator = new TetrisRotateDirectionGenerator();

    @Test
    public void shouldNextRotateDirection() {
        Stream.iterate(0, n -> n + 1)
                .limit(100)
                .forEach(n -> assertNotNull(generator.nextRotateDirection()));
    }
}
