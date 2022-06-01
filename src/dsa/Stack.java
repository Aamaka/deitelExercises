package dsa;

public class Stack {

 private int numberOfElement ;
    private final int[] elements = new int[5];

    public boolean isEmpty() {
        return numberOfElement == 0;
    }

    public void push(int element) {
        try {
            elements[numberOfElement] = element;
            numberOfElement++;
        }catch (ArrayIndexOutOfBoundsException i){
            System.out.println("it cant go above 5");
        }

    }

    public int pop() {

     numberOfElement --;
        return elements[numberOfElement];
    }

    public int peek() {
        return elements[numberOfElement - 1];
    }
}
