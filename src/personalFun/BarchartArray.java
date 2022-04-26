package personalFun;

public class BarchartArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,5,7,6};

        System.out.println("grade distribution");

        for (int counter = 0; counter < arr.length; counter++) {
            if(counter == 10){
                System.out.printf("%7d: ", 100);
            }
            else {
                System.out.printf("%02d - %02d: ", counter * 10 , counter * 10 + 9);
            }
            for (int j = 0; j < arr[counter]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
