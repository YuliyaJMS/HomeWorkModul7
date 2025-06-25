package Hard2;

import java.util.Random;

public class Computer {
    public Move makeMove() {
        Move[] moves = Move.values();
        int randomIndex = new Random().nextInt(moves.length);
        return moves[randomIndex];
    }
}
