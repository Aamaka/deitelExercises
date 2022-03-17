package chapter2;

import java.util.Scanner;
public class Comparing{
   public static void main(String[] args){
   Scanner input = new Scanner (System.in);
   System.out.print("enter number1: ");
   int number1 = input.nextInt();

   System.out.print("enter number2: ");
   int number2 = input.nextInt();

  System.out.print("enter number3: ");
  int number3 = input.nextInt();

  
 int biggest = number1;
 int smallest = number1;

 if (number2 > biggest){ 
biggest =number2;
}
 if (number3 > biggest){biggest = number3;
}

 if (number2 < smallest){smallest = number2;
}
 if (number3 < smallest){smallest = number3;
}

 System.out.printf("%n%nthe smallest number is %d%n",smallest);
 System.out.printf("the biggest number is %d%n",biggest);

}

}


