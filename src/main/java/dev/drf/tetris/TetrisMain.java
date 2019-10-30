package dev.drf.tetris;

import dev.drf.tetris.configuration.ConfigurationLoader;
import dev.drf.tetris.core.Configuration;
import dev.drf.tetris.world.TetrisGame;

public class TetrisMain {
    public static void main(String[] args) {
        System.out.println("test");
        /*
        Draw (output): GameView
        Playing: Game -> Map + World + State
        Configuration: game initialize

        Map: objects keeper
        State: game step + player metrics
        World: State + Map + MapInteractor -> game cycle, step by step
        Game: world + configure + controls
         */
        Configuration configuration = ConfigurationLoader.load();
        TetrisGame game = new TetrisGame(configuration);

    }
}
