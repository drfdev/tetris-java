package dev.drf.tetris.base;


import dev.drf.tetris.core.FigureType;
import dev.drf.tetris.core.position.FigureRotation;
import dev.drf.tetris.core.position.RotateDirection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TetrisFigureTest {
    @Mock
    private FigureType figureType;
    @Mock
    private RotateDirection direction;

    @InjectMocks
    private TetrisFigure tetrisFigure;

    @Test
    public void shouldGetType() {
        FigureType type = tetrisFigure.getType();

        assertSame(figureType, type);
    }

    @Test
    public void shouldRotate() {
        FigureRotation rotation = mock(FigureRotation.class);
        when(direction.rotate(any())).thenReturn(direction);

        tetrisFigure.rotate(rotation);

        ArgumentCaptor<FigureRotation> captor = ArgumentCaptor.forClass(FigureRotation.class);
        verify(direction).rotate(captor.capture());

        FigureRotation value = captor.getValue();
        assertSame(rotation, value);
    }

    @Test
    public void shouldCurrentDirection() {
        RotateDirection currentDirection = tetrisFigure.currentDirection();

        assertSame(direction, currentDirection);
    }
}
