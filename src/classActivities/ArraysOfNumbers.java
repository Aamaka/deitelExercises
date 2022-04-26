package classActivities;

public class ArraysOfNumbers {
    public static void main(String[] args) {
        int[] babes = new int[299];
        for(int i = 0; i < babes.length; i++) {
            babes[i] = i + 1;
        }
        for(int j = 0; j < babes.length; j++){
            System.out.print(babes[j]+" ");
        }
    }
}
