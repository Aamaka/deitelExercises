package personalFun;

public class SevenSegment {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,33,44};
        System.out.println(add(arr));
        System.out.println(average(arr));

    }
    public static int add(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum +=array[i];
        }
        return  sum;
    }
    public  static int  average(int[] array){
     return add(array) / array.length;
    }
}
