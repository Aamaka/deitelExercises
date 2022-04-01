package javaAssignment;

public class Arrays {
    public static void main(String[] args) {
        char[][] bae = new char[3][3];

        bae[0][0] = 'x';
        bae[0][1] = 'o';
        bae[0][2] = 'x';

        bae[1][0] = 'x';
        bae[1][1] = 'x';
        bae[1][2] = 'x';

        bae[2][0] = 'o';
        bae[2][1] = 'x';
        bae[2][2] = 'o';
        for (int i = 0; i < bae.length; i++) {
             for(int j = 0; j < bae[i].length;j++)
            System.out.print(bae[i][j]+" ");
        }
        System.out.println();
    }
}
