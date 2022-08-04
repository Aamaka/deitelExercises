package abstactsAndInterface;

public class SplitAndSum {
     public static void main(String[] args) {
          split(132189);
     }
     public static void split(int number){
          String m = String.valueOf(number);
               int sum = 0;
               for (int i = 0; i <= m.length(); i++) {
                    sum += i;
               }
          if(sum > 9){
               split(sum);
               System.out.println(sum);}
          else System.out.println(sum);



//    public static void split(int number) {
//        String l ;
//        String m = String.valueOf(number);
//        int k = 0;
//        int sum = 0;
//        for (int i = 0; i <= m.length(); i++) {
//            sum += i;
//        }
//        if (sum > 9) {
//            l = String.valueOf(sum);
//            for (int j = 0; j <= l.length(); j++) {
//                k += j;
//            }
//            System.out.println(k);
//        }else System.out.println(sum);
//    }

     }
}
