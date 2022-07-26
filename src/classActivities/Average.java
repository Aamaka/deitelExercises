package classActivities;

import java.security.SecureRandom;
import java.util.OptionalDouble;
import java.util.stream.IntStream;


public class Average {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        IntStream stream = random.ints(10, 0, 1001);
        System.out.println(stream.average());
//        // count returns a result of type long
//        long evenCount = stream
//                .filter(e -> e % 2 == 0)
//                .count();
//
//        long oddCount =stream.filter(e -> e % 2 != 0).count();
//
//        double evenAverage = stream
//                .filter(e -> e % 2 == 0).average().getAsDouble();
//
//        OptionalDouble oddAverage = stream
//                .filter(e -> e % 2 == 1).average();
//        if(oddAverage.isPresent()){
//            evenAverage = oddAverage.getAsDouble();
//        }



    }
}
