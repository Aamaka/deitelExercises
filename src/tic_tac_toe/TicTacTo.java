package tic_tac_toe;

public class TicTacTo {
    private  String[][] game = new String[3][3];

    public TicTacTo(String [] [] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Cell.EMPTY.name();

                this.game = board;
            }

        }

    }


    public String[][] getBoard() {
        return game;
    }
}
