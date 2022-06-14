package Tictactoe;

public class GameBoard {

     private static char[][] game ;
    public void myBoard() {
        game = new char[][]{{' ', ' ', ' '},
                            {' ', ' ', ' '},
                            {' ', ' ', ' '}};
        printBoard();
    }

    private void printBoard() {
        duplicates(game);
    }

    public static void duplicates(char[][] game) {
        System.out.println(game[0][0] + "|" + game[0][1] + "|" + game[0][2]);
        System.out.println("-+-+-");
        System.out.println(game[1][0] + "|" + game[1][1] + "|" + game[1][2]);
        System.out.println("-+-+-");
        System.out.println(game[2][0] + "|" + game[2][1] + "|" + game[2][2]);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            string.append(" | | \n");
            string.append("-+-+-\n");
        }
        string.append(" | | \n");
        return string.toString();
    }

}
