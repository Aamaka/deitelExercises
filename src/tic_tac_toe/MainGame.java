package tic_tac_toe;

import java.util.Objects;
import java.util.Scanner;

public class MainGame {
    static String[][] arr = new String[3][3];
    private static final TicTacTo game = new TicTacTo(arr);
    private static MyPlayer player1;
    private static MyPlayer player2;
    private static final int[] validatePosition = new int[8];

    private static final Scanner userInput = new Scanner(System.in);

     public static void myGame() {
        boolean cellCheck = false;
        for (int i = 0, j = 0; i + j < 9; i++, j++) {
            while (!cellCheck) {
                try {
                    System.out.println("Player1.... choose your position between 1 and 9");
                    int position1 = userInput.nextInt();
                    validatePosition[i] = position1;
                    position1 = validate(position1);
                    cellCheck = check(position1, player1.getPlayer());
                    printBoard();
                    if (checkForOAndX(Cell.X)) return;
                    if (checkForOAndX(Cell.O)) return;
                } catch (IllegalAccessException ex) {
                    ex.getStackTrace();
                }
            }

            cellCheck = false;

            while (!cellCheck) {
                try {
                    System.out.println("Player2.... choose your position between 1 and 9");
                    int position2 = userInput.nextInt();
                    position2 = validate(position2);
                    validatePosition[j] = position2;
                    cellCheck = check(position2, player2.getPlayer());
                    printBoard();
                    if (checkForOAndX(Cell.X)) return;
                    if (checkForOAndX(Cell.O)) return;
                } catch (IllegalAccessException ex) {
                    ex.getStackTrace();
                }
            }
            cellCheck = false;
            if (i + j == 9 && !checkForOAndX(Cell.X) && !checkForOAndX(Cell.O)) System.out.println("Draw");
        }

    }


    public static void playerChoiceOfMarker() {
        System.out.println("Choose a marker (either X or O)");

        String marker = userInput.next();
        while (!marker.equalsIgnoreCase("X") && !marker.equalsIgnoreCase("O")) {
            System.out.println("Choose a marker (either X or O)");
            marker = userInput.next();
        }

        if (Objects.equals(marker.toUpperCase(), "X")) {
            player1 = new MyPlayer(Cell.X);
            player2 = new MyPlayer(Cell.O);
        } else {
            player1 = new MyPlayer(Cell.O);
            player2 = new MyPlayer(Cell.X);
        }
    }

    private static boolean checkForOAndX(Cell cell) {
        if (Objects.equals(game.getBoard()[0][0], cell.name()) &&
                Objects.equals(game.getBoard()[0][1], cell.name())
                && Objects.equals(game.getBoard()[0][2], cell.name()) ||
                Objects.equals(game.getBoard()[1][0], cell.name()) &&
                        Objects.equals(game.getBoard()[1][1], cell.name())
                        && Objects.equals(game.getBoard()[1][2], cell.name()) ||
                Objects.equals(game.getBoard()[2][0], cell.name()) &&
                        Objects.equals(game.getBoard()[2][1], cell.name())
                        && Objects.equals(game.getBoard()[2][2], cell.name()) ||
                Objects.equals(game.getBoard()[0][0], cell.name()) &&
                        Objects.equals(game.getBoard()[1][0], cell.name())
                        && Objects.equals(game.getBoard()[2][0], cell.name()) ||
                Objects.equals(game.getBoard()[0][1], cell.name()) &&
                        Objects.equals(game.getBoard()[1][1], cell.name())
                        && Objects.equals(game.getBoard()[2][1], cell.name()) ||
                Objects.equals(game.getBoard()[0][2], cell.name()) &&
                        Objects.equals(game.getBoard()[1][2], cell.name())
                        && Objects.equals(game.getBoard()[2][2], cell.name()) ||
                Objects.equals(game.getBoard()[0][0], cell.name()) &&
                        Objects.equals(game.getBoard()[1][1], cell.name())
                        && Objects.equals(game.getBoard()[2][2], cell.name()) ||
                Objects.equals(game.getBoard()[0][2], cell.name()) &&
                        Objects.equals(game.getBoard()[1][1], cell.name())
                        && Objects.equals(game.getBoard()[2][0], cell.name())

        ) {
            System.out.println(cell.name() + " wins");
            return true;
        }
        return false;
    }


    private static int validate(int position) {
        while (!(position >= 1) || !(position <= 9)) {
            System.out.println("Invalid input");
            System.out.println("Choose your position between 1 and 9");
            position = userInput.nextInt();
        }
        return position;
    }

    private static boolean check(int position, Cell player) throws IllegalAccessException {
        switch (position) {
            case 1 -> {
                if (checkCell(game.getBoard()[0][0])) throw new IllegalAccessException("cell played in");
                else {
                    game.getBoard()[0][0] = String.valueOf(player);
                    return true;
                }

            }
            case 2 -> {
                if (checkCell(game.getBoard()[0][1])) throw new IllegalAccessException("cell played in");
                else {
                    game.getBoard()[0][1] = String.valueOf(player);
                    return true;
                }

            }
            case 3 -> {
                if (checkCell(game.getBoard()[0][2])) throw new IllegalAccessException("cell played in");
                else {
                    game.getBoard()[0][2] = String.valueOf(player);
                    return true;
                }

            }
            case 4 -> {
                if (checkCell(game.getBoard()[1][0])) throw new IllegalAccessException("cell played in");
                else {
                    game.getBoard()[1][0] = String.valueOf(player);
                    return true;
                }
            }

            case 5 -> {
                if (checkCell(game.getBoard()[1][1])) throw new IllegalAccessException("cell played in");
                else game.getBoard()[1][1] = String.valueOf(player);
                return true;
            }
            case 6 -> {
                if (checkCell(game.getBoard()[1][2])) throw new IllegalAccessException("cell played in");
                else {
                    game.getBoard()[1][2] = String.valueOf(player);
                    return true;
                }
            }

            case 7 -> {
                if (checkCell(game.getBoard()[2][0])) throw new IllegalAccessException("cell played in");
                else {
                    game.getBoard()[2][0] = String.valueOf(player);
                    return true;
                }
            }
            case 8 -> {
                if (checkCell(game.getBoard()[2][1])) throw new IllegalAccessException("cell played in");
                else {
                    game.getBoard()[2][1] = String.valueOf(player);
                    return true;
                }
            }
            case 9 -> {
                if (checkCell(game.getBoard()[2][2])) throw new IllegalAccessException("cell played in");
                else {
                    game.getBoard()[2][2] = String.valueOf(player);
                    return true;
                }

            }
        }
        return false;
    }

    private static boolean checkCell(String valueInCell) {
        return !valueInCell.equals(Cell.EMPTY.toString());
    }

    private static void printBoard() {
        for (int i = 0; i < game.getBoard().length; i++) {
            for (int j = 0; j < game.getBoard()[i].length; j++) {
                System.out.print(game.getBoard()[i][j] + " ");
            }
            System.out.println();
        }
    }

}

