package javaAssignment;

public class Tictacto {
    public static void main(String[] args) {
        char[][] bae = {{'X','O','X'},{'X','X','X'},{'O','X','O'}};
        for(int i = 0;i< bae.length;i++){
            for (int j = 0; j < bae[i].length; j++){
                System.out.print(bae[i][j]+" ");
            }
            System.out.println();
        }
    }
}
