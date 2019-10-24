package dev.drf.tetris.base.generator;

import dev.drf.tetris.core.generator.RotateDirectionGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.stream.Stream;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class TetrisFigureGeneratorTest {
    @Mock
    private RotateDirectionGenerator rotateGenerator;

    @InjectMocks
    private TetrisFigureGenerator generator;

    @Test
    public void shouldNextFigure() {
        Stream.iterate(0, n -> n + 1)
                .limit(100)
                .forEach(n -> assertNotNull(generator.nextFigure()));
    }
}
