package dev.drf.tetris;

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
    }
}
