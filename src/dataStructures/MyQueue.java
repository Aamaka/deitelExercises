package dataStructures;

public class MyQueue {
    int[] arr = new int[5];
    private int front = -1;
    private int back =-1;

    public boolean isEmpty() {
        return front == -1 && back == -1;
    }

    public void enqueue(int element) {
        if(back == arr.length - 1){
            System.out.println("overflow");
        } else if (front == -1 && back == -1) {
            front = back = 0;
            arr[back] = element;
        }
        else {
            back++;
            arr[back] = element;
        }
    }

    public void dequeue(){
        if(front == -1 && back == -1){
            System.out.println("underflow");
        } else if (front == back) {
            front = back = -1;
        }
        else {
            System.out.printf("%d", arr[front]);
            front ++;
        }
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else {
            for (int i = front; i < back -1 ; i++) {
                System.out.println(arr[i]);
            }
        }
    }
    public int peek(){
        return arr[front];
    }
}
