package javaAssignment;

public class Asterisks {
    public static void main(String[] args) {
      upDown();
      downUp();
      upDown();
      downUp();
    }

    private static  void upDown() {
        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static  void  downUp(){
        for(int i = 10; i > 0 ; i--){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }





}




