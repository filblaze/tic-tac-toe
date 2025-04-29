package main;

import java.util.Random;

public class Opponent {

    Random rng = new Random();

    public void inputPC(int size, char[][] board, char player) {
        int row = rng.nextInt(size);
        int col = rng.nextInt(size);
        while (board[row][col] != '_') {
            row = rng.nextInt(size);
            col = rng.nextInt(size);
        }
        board[row][col] = player;
    }
}
