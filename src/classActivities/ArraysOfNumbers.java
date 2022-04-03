package classActivities;

public class ArraysOfNumbers {
    public static void main(String[] args) {
        int[] babes = new int[299];
        for(int i = 0; i < babes.length; i++) {
            babes[i] = i + 1;
        }
        for(int i = 0; i < babes.length; i++){
            System.out.print(babes[i]+" ");
        }
    }
}
