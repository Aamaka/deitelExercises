package chapter5;

public class Sum {
    public static void main(String[] args) {
        sum();
    }
    public static  void sum(){
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum+= i;
            System.out.println(sum);
        }
        System.out.println();
    }
}
