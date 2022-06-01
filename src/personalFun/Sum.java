package personalFun;

public class Sum {
    public static void main(String[] args) {
        int[][] array = {{2, 3, 4, 5}, {4, 5, 6}};
         sum(array);
    }

    public static  void  sum(int[][] array){
        int sum = 0;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                sum += array[row][column];
            }
        }
            System.out.print(sum);

    }



}
