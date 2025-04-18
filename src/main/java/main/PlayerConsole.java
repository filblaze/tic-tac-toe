package main;

import java.util.Scanner;

public class PlayerConsole {

    public static void main(String[] args) {
        String[] board = new String[9];
        for(int i=0; i < 9; i++) {
            board[i] = " ";
        }
        GameLogic logic = new GameLogic();
        System.out.println("Welcome to the game of Tac-Toe Player!");
        System.out.println("|1|2|3|");
        System.out.println("|4|5|6|");
        System.out.println("|7|8|9|");
        String turn = "x";

        /*System.out.println("Would you like to play again? (Y/N)");
        System.out.println("Enter your choice: ");*/

        while(logic.gameOver(board)==false) {
            System.out.println("Is turn of " + turn + ". Enter your choice: ");
            logic.input(board);
            logic.printBoard(board);
            if (turn=="X") {
                turn = "O";
            } else {
                turn = "X";
            }
            System.out.println(board[0] + board[1] + board[2]);
            logic.gameOver(board);
        }
    }
}
