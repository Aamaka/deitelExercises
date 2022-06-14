package dataStructures;

public class MyStack {

    String[] arr = new String[5];
    private int noOfItems;

    public boolean isEmpty() {
        return noOfItems != 1;
    }

    public void push(String item) {
        if(noOfItems < arr.length){
            arr[noOfItems] = item;
            noOfItems ++;}
    }

    public int getSize() {
        return noOfItems;
    }

    public String peek() {
        return arr[noOfItems - 1];
    }

    public String pop() {
        noOfItems--;
        return arr[noOfItems];
    }
}
