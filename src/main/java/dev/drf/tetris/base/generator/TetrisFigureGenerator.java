package dev.drf.tetris.base.generator;

import dev.drf.tetris.base.TetrisFigureType;
import dev.drf.tetris.core.Figure;
import dev.drf.tetris.core.generator.FigureGenerator;
import dev.drf.tetris.core.generator.RotateDirectionGenerator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class TetrisFigureGenerator implements FigureGenerator {
    private static final int TYPES_COUNT = 7;
    private final Map<Integer, FigureGenerator> blockGenerators;

    public TetrisFigureGenerator(RotateDirectionGenerator rotateGenerator) {
        this.blockGenerators = new HashMap<>(TYPES_COUNT);

        AtomicInteger index = new AtomicInteger();
        Arrays.stream(TetrisFigureType.values())
                .forEach(block -> blockGenerators.put(index.getAndIncrement(),
                        new TetrisSameFigureGenerator(block, rotateGenerator)));
    }

    @Override
    public Figure nextFigure() {
        int value = ThreadLocalRandom.current().nextInt(TYPES_COUNT);
        FigureGenerator generator = blockGenerators.get(value);
        if (generator == null) {
            throw new NullPointerException("Generator is null!");
        }
        return generator.nextFigure();
    }
}
