package es.tictactoe;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;



@Getter
@Setter
public class TicTacToe {

    private char player1 = 'X';
    private char player2 = 'O';
    private char noPlayer = '-';
    private char currentPlayer;
    private int size = 3;
    private char[][] board = new char[size][size];

    public TicTacToe() {
        super();
        System.out.println("Inicializando tablero");
        currentPlayer = player1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = noPlayer;
            }
        }
        System.out.println("Tablero inicializado");
        printBoard();
    }


    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < size; i++) {
            System.out.print("| ");
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public boolean isWinner(char player) {
        for (int i = 0; i < size; i++) {
            //check rows
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            //check columns
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player)
                || (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    public boolean isBoardFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
               if( board[i][j] == noPlayer){
                   return false;
               }
            }
        }
        return true;
    }
    public boolean move(char player, int row, int col) {
        if((row >= 0 && row < size && col >=0 && col <size) && board[row][col] == noPlayer) {
            board[row][col] = player;
            return true;
        }
        System.out.println("Movimiento inválido.");
        return false;

    }

    public void swapPlayer() {
        currentPlayer = (player1 == currentPlayer) ? player2 : player1;
    }

    public void doGame(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Player " + currentPlayer + ", enter your move (row[1-" + size + "] col[1-" + size + "]): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;
            boolean hasMoved = move(currentPlayer,row,col);
            printBoard();

            if(isWinner(currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }
            if(isBoardFull()){
                System.out.println("It's a draw!");
                break;
            }
            if(hasMoved) {
                swapPlayer();
            }
        }
    }
}
