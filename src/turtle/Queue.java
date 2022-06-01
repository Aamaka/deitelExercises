package turtle;

public class Queue {

    int[] arr = new int[5];
    int noOfElements;


    public boolean isEmpty() {
         return  noOfElements != 1;
    }
    public void add(int element) {
        if(noOfElements < arr.length){
            arr[noOfElements] = element;
            noOfElements ++;}

    }
    public int getSize() {
        return noOfElements;
    }

    public void remove() {
        arr[0] = arr[1];
        noOfElements --;
    }

    public int peek() {
        return arr[0];
    }
}
