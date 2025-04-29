package main;

public class GameLogic {

    public static boolean gameFinished(boolean gameWonX, boolean gameWonO, boolean boardFull) {
        if (gameWonX || gameWonO) {
            return true;
        } else return boardFull;
    }

    public static boolean gameWonX(char[][] board) {
        boolean winner = false;
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == 'X' && board[row][1] == 'X' && board[row][2] == 'X') {
                winner = true;
            }
        }
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == 'X' && board[1][col] == 'X' && board[2][col] == 'X') {
                winner = true;
            }
        }
        if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
            winner = true;
        } else if (board[0][2]== 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
            winner = true;
        }
        return winner;
    }

    public static boolean gameWonO(char[][] board) {
        boolean winner = false;
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == 'O' && board[row][1] == 'O' && board[row][2] == 'O') {
                winner = true;
            }
        }
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == 'O' && board[1][col] == 'O' && board[2][col] == 'O') {
                winner = true;
            }
        }
        if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
            winner = true;
        } else if (board[0][2]== 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
            winner = true;
        }
        return winner;
    }

    public static boolean boardFull(char[][] board) {
        boolean draw = false;
        String drawString = "";
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                drawString += board[row][col];
            }
        }
        if (!drawString.contains("_")) {
            draw = true;
        }
        return draw;
    }
}