package dev.drf.tetris.base.generator;

import dev.drf.tetris.base.TetrisFigureType;
import dev.drf.tetris.core.Figure;
import dev.drf.tetris.core.generator.RotateDirectionGenerator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TetrisSameFigureGeneratorTest {
    @Mock
    private RotateDirectionGenerator rotateGenerator;

    private TetrisSameFigureGenerator generator;

    @Before
    public void beforeEach() {
        generator = new TetrisSameFigureGenerator(
                TetrisFigureType.I_BLOCK,
                rotateGenerator
        );
    }

    @Test
    public void shouldNextFigure() {
        Stream.iterate(0, n -> n + 1)
                .limit(100)
                .forEach(x ->
                        {
                                Figure figure = generator.nextFigure();
                                assertEquals(TetrisFigureType.I_BLOCK, figure.getType());
                        }
                );
    }
}
