package leetCode;

public class RotateArray {
    public static void main(String[] args) {

        String[] arr = {"joy", "and", "peace"};
        System.out.print(smash(arr));
    }

    public static String smash(String... words) {
        int i = 0;
        StringBuilder m = new StringBuilder();
        for (; i < words.length; i++) {
         m.append(words[i]).append(" ");
        }
        return m.toString();
    }
}
