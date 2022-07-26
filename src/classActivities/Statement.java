package classActivities;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Statement {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 20)
                                    .filter((x -> x % 2 != 0)).map(x -> x * x * x)
                                    .sum());
        SecureRandom random = new SecureRandom();
        random.ints(10, 1, 7)
                .filter((x -> x % 2 == 0))

                .forEach(System.out::println);

       /*                   ^
                            |
        because its only returns a method ,we use a method reference
        */

        //to generate a stream of 20 numbers ranging from 1 to 13
        String  result = random.ints(20, 1, 13)
               //                returning each element as a string value
                .mapToObj(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(result);

        String string = new Scanner(System.in).nextLine();
        string = string.toLowerCase();
        String[] element = string.split(" ");

        List<String> list= Stream.of(element).sorted().distinct().toList();
        System.out.println(list);


        System.out.println(IntStream.rangeClosed(1, 10)
                .summaryStatistics());
        System.out.println(IntStream.rangeClosed(1, 10).map((el -> el * 2)));
        int sumOfNumber = IntStream.rangeClosed(1, 10).map((el -> el * 2)).sum();
        System.out.println(sumOfNumber);


        IntStream sumOfNumber1 = IntStream.rangeClosed(1, 10).filter(x -> x % 2 == 0);

        System.out.println(sumOfNumber1);

        int product = IntStream.rangeClosed(1, 5)
                .reduce((acc, el) -> acc * el)
                .getAsInt();
        System.out.println(product);

        /*no need for .getAsInt() which deals with the Optional class
        the identity sum up the answer based on the number in the identity e.g
        reduce(2, (acc, el) -> acc * el)
        this will result to 240*/
        //the identity element is the first element of our accumulator(acc)
//        2 being the value of the identity is the accumulator starting point i.e 2 * the first element
        int product1 = IntStream.rangeClosed(1, 5)
                .reduce(2, (acc, el) -> acc * el);
        System.out.println(product1);



        int element1 = 3;
        IntUnaryOperator unaryOperator = x -> x * element1;
        System.out.println(unaryOperator);

        System.out.println(IntStream.rangeClosed(1, 3).map( x -> x * 2).sum());

        System.out.println(IntStream.rangeClosed(1, 3)
                .map((int x) -> {return x * 2;})
                .sum());

        int[] a = {1,4, 4, 2, 5, 5,6,5};
        System.out.println(IntStream.of(a).distinct().sum());
        System.out.println(IntStream.of(a).distinct()
                                          .mapToObj(String::valueOf)
                                          .collect(Collectors
                                          .joining("_")));

        System.out.println(IntStream.of(a).count());
        System.out.println(IntStream.of(a).max().getAsInt());
        System.out.println(Arrays.asList(a));
        System.out.println(Arrays.stream(a).sorted());
//
//        System.out.println(Arrays.stream(a)
//                .sorted()
////                .collect(Collections.asLifoQueue(a)));
    }
}
