package abstactsAndInterface;


public class Split {
    public static void main(String[] args) {
        char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
        String s = new String("hello");
        String w = new String("hello");
        System.out.println(s.contains("o"));
        System.out.println(s.compareTo(w));
        System.out.println(s.equals(w));

        String s2 = new String(s);
        String s3 = new String(charArray);
        try {
            String s4 = new String(charArray,6 , 5);
            System.out.printf("s = %s%ns2 = %s%ns3 = %s%ns4 = %s%n", s, s2, s3, s4);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("you can't go beyond your length");
        }

        for (int i = charArray.length - 1; i >= 0 ; i--) {
            System.out.print(charArray[i]);
        }

        System.out.println(s2);

    }
}
