package main;

public class GameLogic5 {

    public static boolean gameWonX5 (char[][] board) {
        boolean winner = false;
        int counter = 0;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == 'X' && counter < 5) {
                    counter++;
                } else if (counter == 5) {
                    winner = true;
                    break;
                } else {
                    winner = false;
                    counter = 0;
                }
            }
            if (winner) {
                break;
            }
        }
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[col][row] == 'X' && counter < 5) {
                    counter++;
                } else if (counter == 5) {
                    winner = true;
                    break;
                } else {
                    winner = false;
                    counter = 0;
                }
            }
            if (winner) {
                break;
            }
        }
        //diagonal
        for (int row = board.length - 1; row > 0; row--) {
            for (int col = 0, x = row; x <= board.length - 1; col++, x++) {
                if (board[x][col] == 'X' && counter < 5) {
                    counter++;
                } else if (counter == 5) {
                    winner = true;
                    break;
                } else {
                    winner = false;
                    counter = 0;
                }
            }
            if (winner) {
                break;
            }
        }
        for (int row = 0; row <= board.length - 1; row++) {
            for (int col = 0, y = row; y <= board.length - 1; col++, y++) {
                if (board[col][y] == 'X' && counter < 5) {
                    counter++;
                } else if (counter == 5) {
                    winner = true;
                    break;
                } else {
                    winner = false;
                    counter = 0;
                }
            }
            if (winner) {
                break;
            }
        }
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col <= row; col++) {
                int x = row - col;
                if (board[x][col] == 'X' && counter < 5) {
                    counter++;
                } else if (counter == 5) {
                    winner = true;
                    break;
                } else {
                    winner = false;
                    counter = 0;
                }
            }
            if (winner) {
                break;
            }
        }
        for (int row = board.length - 2; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                int y = row - col;
                if (board[board.length - col - 1][board.length - y - 1] == 'X' && counter < 5) {
                    counter++;
                } else if (counter == 5) {
                    winner = true;
                    break;
                } else {
                    winner = false;
                    counter = 0;
                }
            }
            if (winner) {
                break;
            }
        }
        return winner;
    }

    public static boolean gameWonO5 (char[][] board) {
        boolean winner = false;
        int counter = 0;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == 'O' && counter < 5) {
                    counter++;
                } else if (counter == 5) {
                    winner = true;
                    break;
                } else {
                    winner = false;
                    counter = 0;
                }
            }
            if (winner) {
                break;
            }
        }
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[col][row] == 'O' && counter < 5) {
                    counter++;
                } else if (counter == 5) {
                    winner = true;
                    break;
                } else {
                    winner = false;
                    counter = 0;
                }
            }
            if (winner) {
                break;
            }
        }
        //diagonal
        for (int row = board.length - 1; row > 0; row--) {
            for (int col = 0, x = row; x <= board.length - 1; col++, x++) {
                if (board[x][col] == 'O' && counter < 5) {
                    counter++;
                } else if (counter == 5) {
                    winner = true;
                    break;
                } else {
                    winner = false;
                    counter = 0;
                }
            }
            if (winner) {
                break;
            }
        }
        for (int row = 0; row <= board.length - 1; row++) {
            for (int col = 0, y = row; y <= board.length - 1; col++, y++) {
                if (board[col][y] == 'O' && counter < 5) {
                    counter++;
                } else if (counter == 5) {
                    winner = true;
                    break;
                } else {
                    winner = false;
                    counter = 0;
                }
            }
            if (winner) {
                break;
            }
        }
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col <= row; col++) {
                int x = row - col;
                if (board[x][col] == 'O' && counter < 5) {
                    counter++;
                } else if (counter == 5) {
                    winner = true;
                    break;
                } else {
                    winner = false;
                    counter = 0;
                }
            }
            if (winner) {
                break;
            }
        }
        for (int row = board.length - 2; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                int y = row - col;
                if (board[board.length - col - 1][board.length - y - 1] == 'O' && counter < 5) {
                    counter++;
                } else if (counter == 5) {
                    winner = true;
                    break;
                } else {
                    winner = false;
                    counter = 0;
                }
            }
            if (winner) {
                break;
            }
        }
        return winner;
    }
}
