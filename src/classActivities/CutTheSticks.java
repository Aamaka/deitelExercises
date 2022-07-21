package classActivities;

import java.util.*;

public class CutTheSticks {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(10);
        arr.add(3);
        arr.add(7);
        arr.add(5);
        arr.add(9);
        System.out.println(arr);
        System.out.println(cutTheStick(arr));



    }

    public static List<Integer> cutTheStick(List<Integer> arr){
        Collections.sort(arr);
        Map<Integer, Integer> map = new LinkedHashMap<>();
        //fill up with the linked-hashmap with count of each element of the sorted array

        for (int i: arr){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        int size = arr.size();
        int mapSize = map.size();
        int count = 0;

        list.add(size);
        for (Map.Entry entry: map.entrySet()) {
            if (count != mapSize - 1) {
                size = size - (int)entry.getValue();
                list.add(size);
                count++;
            }
        }
        return list;
    }

}
