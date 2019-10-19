package dev.drf.tetris.base.generator;

import dev.drf.tetris.base.position.TetrisDirection;
import dev.drf.tetris.core.generator.RotateDirectionGenerator;
import dev.drf.tetris.core.position.RotateDirection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class TetrisRotateDirectionGenerator implements RotateDirectionGenerator {
    private static final int ROTATES_COUNT = 4;
    private final Map<Integer, RotateDirectionGenerator> rotateGenerators;

    public TetrisRotateDirectionGenerator() {
        this.rotateGenerators = new HashMap<>(ROTATES_COUNT);

        AtomicInteger index = new AtomicInteger();
        Arrays.stream(TetrisDirection.values())
                .forEach(direction -> rotateGenerators.put(index.getAndIncrement(),
                        new TetrisSameRotateDirectionGenerator(direction)));
    }

    @Override
    public RotateDirection nextRotateDirection() {
        int value = ThreadLocalRandom.current().nextInt(ROTATES_COUNT);
        RotateDirectionGenerator generator = rotateGenerators.get(value);
        if (generator == null) {
            throw new NullPointerException("Generator is null!");
        }
        return generator.nextRotateDirection();
    }
}
