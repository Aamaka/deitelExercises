package personalFun;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysListTime {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        int sum = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
            sum += list.get(i);
        }
        System.out.println(list);
        System.out.println(sum);
//        list.add(123);
//        list.add(223);
//        list.add(43);
//        list.clear();
//        list.add(103);
//        list.add(23);
//        list.add(13);
//        list.add(12);
//        list.add(12);
//        list.add(12);
//        System.out.println(list);
//        System.out.println(list.contains(123));
//        //System.out.println(list);
//        list.set(4,55);
//        System.out.println(list);
//        list.add(3,77);
//        System.out.println(list);
//        list.remove(6);
//        System.out.println(list );
    }
}
