package tic_tac_toe;

import java.util.Scanner;

public class Hmm {

    static Scanner input = new Scanner(System.in);
    static String playerOne;
    static String playerTwo;
    private static int playerOneScore = 0;
    private static int playerTwoScore = 0;

    public static void main(String[] args) {
        surface();
        board();

    }

    private static void surface() {
        System.out.println("Welcome to the Tic Tac Toe Game");
        System.out.println("Player one, enter your name: ");
        playerOne = input.next();
        System.out.println("Player two, enter your name: ");
        playerTwo = input.next();
    }

    private static void board() {
        char[][] board = {{' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};
        printingBoard(board);
        boolean gameOver = false;
        boolean playAgain = true;

        while (playAgain) {

            while (!gameOver) {
                player1(board);
                gameOver = isGameOver(board);
                if (gameOver) {
                    break;
                }
                player2(board);
                gameOver = isGameOver(board);
                if (gameOver) {
                    break;
                }
            }
            System.out.println(playerOne + " score " + playerOneScore);
            System.out.println(playerTwo + " score " + playerTwoScore);
            System.out.println("Do you want to play again? Y/N: ");
            String rematch = input.next();

            if (rematch.equalsIgnoreCase("Y")) {
                playAgain = true;
                System.out.println("Let play again");
                resetGame(board);
                gameOver = false;
                printingBoard(board);
            } else {
                playAgain = false;
                System.out.println("Thank you ");
            }
        }


//

    }

    private static void printingBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }

    public static void updatedBoard(int position, int player, char[][] board) {
        char character;

        if (player == 1) {
            character = 'X';
        } else {
            character = 'O';
        }
        switch (position) {
            case 1 -> {
                board[0][0] = character;
                printingBoard(board);
            }
            case 2 -> {
                board[0][1] = character;
                printingBoard(board);
            }
            case 3 -> {
                board[0][2] = character;
                printingBoard(board);
            }
            case 4 -> {
                board[1][0] = character;
                printingBoard(board);
            }
            case 5 -> {
                board[1][1] = character;
                printingBoard(board);
            }
            case 6 -> {
                board[1][2] = character;
                printingBoard(board);
            }
            case 7 -> {
                board[2][0] = character;
                printingBoard(board);
            }
            case 8 -> {
                board[2][1] = character;
                printingBoard(board);
            }
            case 9 -> {
                board[2][2] = character;
                printingBoard(board);
            }
        }
    }

    private static void print(){
        System.out.println(playerOne + ", Enter a digit from 1 to 9 to play: ");
    }
    private static void player1(char[][] board) {
        print();
        int player = input.nextInt();
        boolean result = isValidMove(player, board);
        while (!result) {
            System.out.println("Sorry, Invalid move. Try again");
            player = input.nextInt();
            result = isValidMove(player, board);
        }
        System.out.println(playerOne + " moved at " + player);
        updatedBoard(player, 1, board);

    }

    private static void player2(char[][] board) {
        System.out.println(playerTwo + ", Enter a digit from 1 to 9 to play: ");
        int player = input.nextInt();
        boolean result = isValidMove(player, board);
        while (!result) {
            System.out.println("Sorry, Invalid move. Try again");
            player = input.nextInt();
            result = isValidMove(player, board);
        }
        System.out.println(playerTwo + " moved at " + player);
        updatedBoard(player, 2, board);

    }

    private static boolean isValidMove(int move, char[][] board) {
        switch (move) {
            case 1 -> {
                return board[0][0] == ' ';
            }
            case 2 -> {
                return board[0][1] == ' ';
            }
            case 3 -> {
                return board[0][2] == ' ';
            }
            case 4 -> {
                return board[1][0] == ' ';
            }
            case 5 -> {
                return board[1][1] == ' ';
            }
            case 6 -> {
                return board[1][2] == ' ';
            }
            case 7 -> {
                return board[2][0] == ' ';
            }
            case 8 -> {
                return board[2][1] == ' ';
            }
            case 9 -> {
                return board[2][2] == ' ';
            }

        }
        return false;

    }

    private static boolean isGameOver(char[][] board) {
//        Horizontal wins
        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
            playerOneScore++;
            System.out.println(playerOne + " Wins");
            return true;
        }
        if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
            playerOneScore++;
            System.out.println(playerOne + " Wins");
            return true;
        }
        if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
            playerOneScore++;
            System.out.println(playerOne + " Wins");
            return true;
        }
        if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
            playerTwoScore++;
            System.out.println(playerTwo + " Wins");
            return true;
        }
        if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
            playerTwoScore++;
            System.out.println(playerTwo + " Wins");
            return true;
        }
        if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
            playerTwoScore++;
            System.out.println(playerTwo + " Wins");
            return true;
        }
//        Vertical wins
        if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
            playerOneScore++;
            System.out.println(playerOne + " Wins");
            return true;
        }
        if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
            playerOneScore++;
            System.out.println(playerOne + " Wins");
            return true;
        }
        if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
            playerOneScore++;
            System.out.println(playerOne + " Wins");
            return true;
        }
        if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
            playerTwoScore++;
            System.out.println(playerTwo + " Wins");
            return true;
        }
        if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
            playerTwoScore++;
            System.out.println(playerTwo + " Wins");
            return true;
        }
        if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
            playerTwoScore++;
            System.out.println(playerTwo + " Wins");
            return true;
        }
//        Diagonal wins
        if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
            playerOneScore++;
            System.out.println(playerOne + " Wins");
            return true;
        }
        if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
            playerOneScore++;
            System.out.println(playerOne + " Wins");
            return true;
        }
        if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
            playerTwoScore++;
            System.out.println(playerTwo + " Wins");
            return true;
        }
        if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
            playerTwoScore++;
            System.out.println(playerTwo + " Wins");
            return true;
        }
        if (board[0][0] != ' ' && board[0][1] != ' ' && board[0][2] != ' ' && board[1][0] != ' ' && board[1][1] != ' ' && board[1][2] != ' ' && board[2][0] != ' ' && board[2][1] != ' ' && board[2][2] != ' ') {
            System.out.println("The game ends in a draw");
            return true;
        }
        return false;
    }

    private static void resetGame(char[][] board) {
        board();
        printingBoard(board);


    }



}

