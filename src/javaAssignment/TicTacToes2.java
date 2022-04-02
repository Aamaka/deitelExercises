package javaAssignment;

public class TicTacToes2 {
    public static void main(String[] args) {
        char [][] toes= {{'X','O', },{'X','X','X'},{'X','O','X'}};
        for(int i = 0; i < toes.length; i++){
            for (int j = 0; j < toes[i].length; j++){
                System.out.print(toes[i][j]+" ");
            }
            System.out.println();
        }
    }
}
