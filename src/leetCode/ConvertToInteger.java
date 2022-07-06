package leetCode;

import java.util.HashMap;
import java.util.Map;

public class ConvertToInteger {
    public static void main(String[] args) {

    }

    public int romanToInt(String input){

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            if(i > 0 && map.get(input.charAt(i)) > map.get(input.charAt(i - 1))){
                result += map.get(input.charAt(i)) - 2 * map.get(input.charAt(i - 1));

            }else {
                result += map.get(input.charAt(i));
            }

        }
        return result;
    }
}
