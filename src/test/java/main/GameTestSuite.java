package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static main.Board.prepBoard;
import static main.GameLogic.*;
import static org.junit.jupiter.api.Assertions.*;

public class GameTestSuite {

    @Test
    void testOWinRows() {
        //Given
        char[][] board1 = prepBoard(3);
        char[][] board2 = prepBoard(3);
        char[][] board3 = prepBoard(3);
        for (int col = 0; col < board1[0].length; col++) {
            board1[0][col] = 'O';
        }
        for (int col = 0; col < board2[1].length; col++) {
            board2[1][col] = 'O';
        }
        for (int col = 0; col < board3[2].length; col++) {
            board3[2][col] = 'O';
        }
        //When
        boolean win1row = gameWonO(board1);
        boolean win2row = gameWonO(board2);
        boolean win3row = gameWonO(board3);
        //Then
        assertTrue(win1row);
        assertTrue(win2row);
        assertTrue(win3row);
    }

    @Test
    void testOWinCols() {
        //Given
        char[][] board1 = prepBoard(3);
        char[][] board2 = prepBoard(3);
        char[][] board3 = prepBoard(3);
        for (int row = 0; row < board1[0].length; row++) {
            board1[row][0] = 'O';
        }
        for (int row = 0; row < board2[1].length; row++) {
            board2[row][1] = 'O';
        }
        for (int row = 0; row < board3[2].length; row++) {
            board3[row][2] = 'O';
        }
        //When
        boolean win1col = gameWonO(board1);
        boolean win2col = gameWonO(board2);
        boolean win3col = gameWonO(board3);
        //Then
        assertTrue(win1col);
        assertTrue(win2col);
        assertTrue(win3col);
    }

    @Test
    void testOWinDiagonal() {
        //Given
        char[][] board1 = prepBoard(3);
        char[][] board2 = prepBoard(3);
        for (int row = 0; row < board1.length; row++) {
            board1[row][row] = 'O';
        }
        board2[0][2] = 'O';
        board2[1][1] = 'O';
        board2[2][0] = 'O';
        //When
        boolean win1diagonal = gameWonO(board1);
        boolean win2diagonal = gameWonO(board2);
        //Then
        assertTrue(win1diagonal);
        assertTrue(win2diagonal);
    }

    @Test
    void testXWinRows() {
        //Given
        char[][] board1 = prepBoard(3);
        char[][] board2 = prepBoard(3);
        char[][] board3 = prepBoard(3);
        for (int col = 0; col < board1[0].length; col++) {
            board1[0][col] = 'X';
        }
        for (int col = 0; col < board2[1].length; col++) {
            board2[1][col] = 'X';
        }
        for (int col = 0; col < board3[2].length; col++) {
            board3[2][col] = 'X';
        }
        //When
        boolean win1row = gameWonX(board1);
        boolean win2row = gameWonX(board2);
        boolean win3row = gameWonX(board3);
        //Then
        assertTrue(win1row);
        assertTrue(win2row);
        assertTrue(win3row);
    }

    @Test
    void testXWinCols() {
        //Given
        char[][] board1 = prepBoard(3);
        char[][] board2 = prepBoard(3);
        char[][] board3 = prepBoard(3);
        for (int row = 0; row < board1[0].length; row++) {
            board1[row][0] = 'X';
        }
        for (int row = 0; row < board2[1].length; row++) {
            board2[row][1] = 'X';
        }
        for (int row = 0; row < board3[2].length; row++) {
            board3[row][2] = 'X';
        }
        //When
        boolean win1col = gameWonX(board1);
        boolean win2col = gameWonX(board2);
        boolean win3col = gameWonX(board3);
        //Then
        assertTrue(win1col);
        assertTrue(win2col);
        assertTrue(win3col);
    }

    @Test
    void testXWinDiagonal() {
        //Given
        char[][] board1 = prepBoard(3);
        char[][] board2 = prepBoard(3);
        for (int row = 0; row < board1.length; row++) {
            board1[row][row] = 'X';
        }
        board2[0][2] = 'X';
        board2[1][1] = 'X';
        board2[2][0] = 'X';
        //When
        boolean win1diagonal = gameWonX(board1);
        boolean win2diagonal = gameWonX(board2);
        //Then
        assertTrue(win1diagonal);
        assertTrue(win2diagonal);
    }

    @Test
    void testDraw() {
        //Given
        char[][] board1 = prepBoard(3);
        board1[0][0] = 'O';
        board1[0][1] = 'O';
        board1[0][2] = 'X';
        board1[1][0] = 'X';
        board1[1][1] = 'X';
        board1[1][2] = 'O';
        board1[2][0] = 'O';
        board1[2][1] = 'X';
        board1[2][2] = 'X';
        //When
        boolean winX = gameWonX(board1);
        boolean winO = gameWonO(board1);
        boolean draw = gameDraw(board1);
        //Then
        assertFalse(winX);
        assertFalse(winO);
        assertTrue(draw);
    }

    @Test
    void testInvalidMoves() {
        //Given
        GameData gameData = new GameData();
        char[][] board1 = prepBoard(3);
        board1[0][0] = 'X';
        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> gameData.input(-1, -1, board1, 'X')),
                () -> assertThrows(Exception.class, () -> gameData.input(0, 0, board1, 'X')),
                () -> assertThrows(Exception.class, () -> gameData.input(0, 0, board1, 'O')),
                () -> assertDoesNotThrow(() -> gameData.input(0, 1, board1, 'O')),
                () -> assertDoesNotThrow(() -> gameData.input(0, 2, board1, 'X')),
                () -> assertThrows(Exception.class, () -> gameData.input(3, 3, board1, 'O'))
        );
    }
}
