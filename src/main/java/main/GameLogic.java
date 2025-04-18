package main;

import java.util.Scanner;

public class GameLogic {

    String[] board = new String[9];
    String turn = "X";

    //Our board will be a set of 9 fields represented by an array.
    //Method for showing boardstate after each round
    public void printBoard(String[] board) {
        System.out.println("|" + board[0] + "|" + board[1] + "|" + board[2] + "|");
        System.out.println("|" + board[3] + "|" + board[4] + "|" + board[5] + "|");
        System.out.println("|" + board[6] + "|" + board[7] + "|" + board[8] + "|");
    }

    //Input method that will allow us to choose a field to fill and then give turn to another player.
    public void input(String[] board) {
        Scanner scanner = new Scanner(System.in);
        board[scanner.nextInt() - 1] = turn;
        if (turn == "X") {
            turn = "O";
        } else {
            turn = "X";
        }
    }

    public boolean gameOver(String[] board) {
        boolean gameOver = false;
        //Win condition is a line with 3 of the same value. There are 8 possible win conditions and a draw.
        //1
        String line1 = board[0] + board[1] + board[2];
        //2
        String line2 = board[3] + board[4] + board[5];
        //3
        String line3 = board[6] + board[7] + board[8];
        //4
        String line4 = board[0] + board[3] + board[6];
        //5
        String line5 = board[1] + board[4] + board[7];
        //6
        String line6 = board[2] + board[5] + board[8];
        //7
        String line7 = board[0] + board[4] + board[8];
        //8
        String line8 = board[2] + board[4] + board[6];
        if (line1 == "XXX" || line1 == "OOO") {
            gameOver = true;
        } else if (line2 == "XXX" || line2 == "OOO") {
            gameOver = true;
        } else if (line3 == "XXX" || line3 == "OOO") {
            gameOver = true;
        }
        return gameOver;
    }
}
