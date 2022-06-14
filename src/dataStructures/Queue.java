package dataStructures;

public class Queue {

    int[] arr = new int[5];
    int front = -1;
    int rear = -1;


    public boolean isEmpty() {

        return  rear == -1 && front == -1;
    }
    public void enqueue(int element) {
        if(isEmpty()){
            front = rear = 0;
            arr[rear] = element;
        }
        else if( rear == arr .length - 1) {
            System.out.println("overflow");
        }
        else {
            rear ++;
            arr[rear] = element;
        }

    }
    public void dequeue() {
        if(!isEmpty()){
            front ++;
        }
    }

    public int peek() {
        return arr[front];
    }
}
