package personalFun;

import chapter8.Time;

public class TimeToPlay {
    public static void main(String[] args) {
//        Division mydiv = new Division();
//        mydiv.setDivisibleNumbers(1,2,3,4,5,6,7,8,9,0);
//        System.out.println(mydiv.isDivisible());
//
//
//        for(int i = 0;i < 15; i++){
//
//            if (i == 10)
//
//            continue;
//            if (i == 13)break;
//            System.out.print(i+ "->");
//        }
//        System.out.println();
//
//        int j = 0;
//        while(j < 20){
//            j++;
//            if(j == 6){
//
//                continue;}
//           // j++;
//
//            System.out.print(j+ "...");
//        }
//        System.out.println();

        Time time = new Time(0,15,7);
        System.out.println("time to eat at constructor "+time.getTime()+ " "+ time.getHour()+ ":"+ time.getMinutes()+":"+time.getSeconds());

        time.setTime(12,16,13);
        System.out.println("time to eat "+time.getTime()+ " "+ time.getHour()+ ":"+ time.getMinutes()+":"+time.getSeconds());

        time.setHour(22);
        time.setMinutes(15);
        time.setSeconds(15);

        System.out.println(time);


        System.out.println("time to eat "+time.getTime()+ " "+ time.getHour()+ ":"+ time.getMinutes()+":"+time.getSeconds());



    }




}


