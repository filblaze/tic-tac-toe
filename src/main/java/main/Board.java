package main;

public class Board {

    public static char[][] prepBoard(int size) {
        char[][] board = new char[size][size];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = '_';
            }
        }
        return board;
    }

    public static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print("|" + board[row][col]);
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
