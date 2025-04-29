package main;

public class GameData {

    public static int gameVersion(int userInput) throws Exception {
        if (userInput == 3) {
            return 3;
        } else if (userInput == 5) {
            return 10;
        } else {
            throw new Exception();
        }
    }

    public static void input(int row, int col, char[][] board, char player) throws Exception {
        if (board[row][col] == '_') {
            board[row][col] = player;
        } else if (board[row][col] == 'X' || board[row][col] == 'O') {
            throw new Exception();
        } else if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
            throw new Exception();
        }
    }

}
