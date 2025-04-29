package main;

import java.util.Scanner;

import static main.Board.prepBoard;
import static main.Board.printBoard;
import static main.GameData.gameVersion;
import static main.GameData.input;
import static main.GameLogic.*;
import static main.GameLogic5.gameWonO5;
import static main.GameLogic5.gameWonX5;

public class PlayerConsole {

    public static void main(String[] args) {
        Opponent opponent = new Opponent();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game of Tac-Toe Player!");
        System.out.println("Which game do you want to play?");
        char [][] board = null;
        int size;
        char player = 'X';

        while (board == null) {
            try {
                System.out.println("Enter '3' for the 3 point version, enter '5' for the 5 point version:");
                int input = scanner.nextInt();
                size = gameVersion(input);
                board = prepBoard(size);
            } catch (Exception e) {
                System.out.println("Invalid input, select again.");
            }
        }

        if (board.length == 3) {
            while (!gameFinished(gameWonX(board), gameWonO(board), boardFull(board))) {
                printBoard(board);
                try {
                    System.out.println("Player " + player + " enter:");
                    int row = scanner.nextInt() - 1;
                    int col = scanner.nextInt() - 1;
                    input(row, col, board, player);
                    if (boardFull(board)) break;
                    player = (player == 'X') ? 'O' : 'X';
                    opponent.inputPC(board.length, board, player);
                    if (boardFull(board)) break;
                    player = (player == 'X') ? 'O' : 'X';
                } catch (Exception e) {
                    System.out.println("Invalid move. Try again.");
                }
            }
        } else if (board.length == 10) {
            while (!gameFinished(gameWonX5(board), gameWonO5(board), boardFull(board))) {
                printBoard(board);
                try {
                    System.out.println("Player " + player + " enter:");
                    int row = scanner.nextInt() - 1;
                    int col = scanner.nextInt() - 1;
                    input(row, col, board, player);
                    if (boardFull(board)) break;
                    player = (player == 'X') ? 'O' : 'X';
                    opponent.inputPC(board.length, board, player);
                    if (boardFull(board)) break;
                    player = (player == 'X') ? 'O' : 'X';
                } catch (Exception e) {
                    System.out.println("Invalid move. Try again.");
                }
            }
        } else {
            System.out.println("Something went wrong. Restart the game.");
        }
        printBoard(board);
        if (gameWonX(board) || gameWonX5(board)) {
            System.out.println("Player X won!");
        } else if (gameWonO(board) || gameWonO5(board)) {
            System.out.println("Player O won!");
        } else if (boardFull(board)) {
            System.out.println("Draw!");
        }
    }
}
