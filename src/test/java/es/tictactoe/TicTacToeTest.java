package es.tictactoe;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    void initCorrect() {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] expectedBoard = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
        assertEquals('X',ticTacToe.getCurrentPlayer());
        assertArrayEquals(expectedBoard, ticTacToe.getBoard());
    }
    @Test
    void isWinnerPlayer1Row1(){
        TicTacToe ticTacToe = new TicTacToe();
        char[][] expectedBoard = {{'X','X','X'},{'-','-','-'},{'-','-','-'}};
        ticTacToe.setBoard(expectedBoard);
        boolean winner =ticTacToe.isWinner('X');
        assertTrue(winner);
    }
    @Test
    void isWinnerPlayer1Row2(){
        TicTacToe ticTacToe = new TicTacToe();
        char[][] expectedBoard = {{'-','-','-'},{'X','X','X'},{'-','-','-'}};
        ticTacToe.setBoard(expectedBoard);
        boolean winner =ticTacToe.isWinner('X');
        assertTrue(winner);
    }
    @Test
    void isWinnerPlayer1Row3(){
        TicTacToe ticTacToe = new TicTacToe();
        char[][] expectedBoard = {{'-','-','-'},{'-','-','-'},{'X','X','X'}};
        ticTacToe.setBoard(expectedBoard);
        boolean winner =ticTacToe.isWinner('X');
        assertTrue(winner);
    }
    @Test
    void isWinnerPlayer2Row1(){
        TicTacToe ticTacToe = new TicTacToe();
        char[][] expectedBoard = {{'O','O','O'},{'-','-','-'},{'-','-','-'}};
        ticTacToe.setBoard(expectedBoard);
        boolean winner =ticTacToe.isWinner('O');
        assertTrue(winner);
    }
    @Test
    void isWinnerPlayer2Row2(){
        TicTacToe ticTacToe = new TicTacToe();
        char[][] expectedBoard = {{'-','-','-'},{'O','O','O'},{'-','-','-'}};
        ticTacToe.setBoard(expectedBoard);
        boolean winner =ticTacToe.isWinner('O');
        assertTrue(winner);
    }
    @Test
    void isWinnerPlayer2Row3(){
        TicTacToe ticTacToe = new TicTacToe();
        char[][] expectedBoard = {{'-','-','-'},{'-','-','-'},{'O','O','O'}};
        ticTacToe.setBoard(expectedBoard);
        boolean winner =ticTacToe.isWinner('O');
        assertTrue(winner);
    }

    @Test
    void isWinnerPlayer1Col1(){
        TicTacToe ticTacToe = new TicTacToe();
        char[][] expectedBoard = {{'X','-','-'},{'X','-','-'},{'X','-','-'}};
        ticTacToe.setBoard(expectedBoard);
        boolean winner =ticTacToe.isWinner('X');
        assertTrue(winner);
    }
    @Test
    void isWinnerPlayer1Col2(){
        TicTacToe ticTacToe = new TicTacToe();
        char[][] expectedBoard = {{'-','X','-'},{'-','X','-'},{'-','X','-'}};
        ticTacToe.setBoard(expectedBoard);
        boolean winner =ticTacToe.isWinner('X');
        assertTrue(winner);
    }
    @Test
    void isWinnerPlayer1Col3(){
        TicTacToe ticTacToe = new TicTacToe();
        char[][] expectedBoard = {{'-','-','X'},{'-','-','X'},{'-','-','X'}};
        ticTacToe.setBoard(expectedBoard);
        boolean winner =ticTacToe.isWinner('X');
        assertTrue(winner);
    }
    @Test
    void isWinnerPlayer2Col1(){
        TicTacToe ticTacToe = new TicTacToe();
        char[][] expectedBoard = {{'O','-','-'},{'O','-','-'},{'O','-','-'}};
        ticTacToe.setBoard(expectedBoard);
        boolean winner =ticTacToe.isWinner('O');
        assertTrue(winner);
    }
    @Test
    void isWinnerPlayer2Col2(){
        TicTacToe ticTacToe = new TicTacToe();
        char[][] expectedBoard = {{'-','O','-'},{'-','O','-'},{'-','O','-'}};
        ticTacToe.setBoard(expectedBoard);
        boolean winner =ticTacToe.isWinner('O');
        assertTrue(winner);
    }
    @Test
    void isWinnerPlayer2Col3(){
        TicTacToe ticTacToe = new TicTacToe();
        char[][] expectedBoard = {{'-','-','O'},{'-','-','O'},{'-','-','O'}};
        ticTacToe.setBoard(expectedBoard);
        boolean winner =ticTacToe.isWinner('O');
        assertTrue(winner);
    }
    @Test
    void isWinnerPlayer1Diagonal1 () {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] expectedBoard = {{'X','-','-'},{'-','X','-'},{'-','-','X'}};
        ticTacToe.setBoard(expectedBoard);
        boolean winner =ticTacToe.isWinner('X');
        assertTrue(winner);
    }
    @Test
    void isWinnerPlayer1Diagonal2 () {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] expectedBoard = {{'-','-','X'},{'-','X','-'},{'X','-','-'}};
        ticTacToe.setBoard(expectedBoard);
        boolean winner =ticTacToe.isWinner('X');
        assertTrue(winner);
    }
    @Test
    void isWinnerPlayer2Diagonal1 () {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] expectedBoard = {{'O','-','-'},{'-','O','-'},{'-','-','O'}};
        ticTacToe.setBoard(expectedBoard);
        boolean winner =ticTacToe.isWinner('O');
        assertTrue(winner);
    }
    @Test
    void isWinnerPlayer2Diagonal2 () {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] expectedBoard = {{'-','-','O'},{'-','O','-'},{'O','-','-'}};
        ticTacToe.setBoard(expectedBoard);
        boolean winner =ticTacToe.isWinner('O');
        assertTrue(winner);
    }

    @Test void isBoardFull(){
        TicTacToe ticTacToe = new TicTacToe();
        char[][] expectedBoard = {{'X','O','O'},{'X','O','O'},{'O','X','X'}};
        ticTacToe.setBoard(expectedBoard);
        assertTrue(ticTacToe.isBoardFull());
    }
    @Test void isBoardNotFull(){
        TicTacToe ticTacToe = new TicTacToe();
        char[][] expectedBoard = {{'X','-','O'},{'X','O','O'},{'O','-','X'}};
        ticTacToe.setBoard(expectedBoard);
        assertFalse(ticTacToe.isBoardFull());
    }
    @Test
    void moveCorrectPlayer1() {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] board = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
        ticTacToe.setBoard(board);
        Random rand = new Random();
        int row = rand.nextInt(ticTacToe.getSize()), col = rand.nextInt(ticTacToe.getSize());
        char currentPlayer = 'X';
        boolean correct = ticTacToe.move(currentPlayer,row,col);
        assertTrue(correct);
        assertEquals(currentPlayer,ticTacToe.getBoard()[row][col]);
    }
    @Test
    void moveCorrectPlayer2() {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] board = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
        ticTacToe.setBoard(board);
        Random rand = new Random();
        int row = rand.nextInt(ticTacToe.getSize()), col = rand.nextInt(ticTacToe.getSize());
        char currentPlayer = 'O';
        boolean correct = ticTacToe.move(currentPlayer,row,col);
        assertTrue(correct);
        assertEquals(currentPlayer,ticTacToe.getBoard()[row][col]);
    }

    @Test
    void moveIncorrectRowBelowMin() {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] board = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
        ticTacToe.setBoard(board);
        Random rand = new Random();
        int row = -1, col = rand.nextInt(ticTacToe.getSize());
        char currentPlayer = 'X';
        boolean correct = ticTacToe.move(currentPlayer,row,col);
        assertFalse(correct);
    }
    @Test
    void moveIncorrectRowOverMax() {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] board = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
        ticTacToe.setBoard(board);
        Random rand = new Random();
        int row = 3, col = rand.nextInt(ticTacToe.getSize());
        char currentPlayer = 'X';
        boolean correct = ticTacToe.move(currentPlayer,row,col);
        assertFalse(correct);
    }

    @Test
    void moveIncorrectColBelowMin() {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] board = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
        ticTacToe.setBoard(board);
        Random rand = new Random();
        int row = rand.nextInt(ticTacToe.getSize()), col = -1;
        char currentPlayer = 'X';
        boolean correct = ticTacToe.move(currentPlayer,row,col);
        assertFalse(correct);
    }
    @Test
    void moveIncorrectColOverMax() {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] board = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
        ticTacToe.setBoard(board);
        Random rand = new Random();
        int row = rand.nextInt(ticTacToe.getSize()), col = 3;
        char currentPlayer = 'X';
        boolean correct = ticTacToe.move(currentPlayer,row,col);
        assertFalse(correct);
    }
    @Test
    void moveIncorrectOnExistingPos(){
        TicTacToe ticTacToe = new TicTacToe();
        char[][] board = {{'-','-','-'},{'-','X','-'},{'-','-','-'}};
        ticTacToe.setBoard(board);
        Random rand = new Random();
        int row = 1, col = 1;
        char currentPlayer = 'X';
        boolean correct = ticTacToe.move(currentPlayer,row,col);
        assertFalse(correct);
    }
    @Test void movePlayer1(){
        TicTacToe ticTacToe = new TicTacToe();
        char currentPlayer = 'X';
        ticTacToe.setCurrentPlayer(currentPlayer);
        ticTacToe.swapPlayer();
        assertEquals('O',ticTacToe.getCurrentPlayer());
    }
    @Test void movePlayer2(){
        TicTacToe ticTacToe = new TicTacToe();
        char currentPlayer = 'O';
        ticTacToe.setCurrentPlayer(currentPlayer);
        ticTacToe.swapPlayer();
        assertEquals('X',ticTacToe.getCurrentPlayer());
    }
}