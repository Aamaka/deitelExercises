package Tictactoe;

public class TicTacToe {

    GameBoard game = new GameBoard();
    Player playPlay = new Player();
    public void gameBoard() {
        game.myBoard();
    }

    public void playerName(String name) {
        playPlay.setPlayerName(name);
    }

    public String getPlayer() {
        return playPlay.getPlayerName();
    }

    public void play(String name, int move) {
        while (move > 0 && move < 10){

        }
    }
}
