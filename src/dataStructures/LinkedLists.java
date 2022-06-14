package dataStructures;

public class LinkedLists {
    private MyNode first;
    int numberOfNodes;

    public boolean isEmpty() {
        return first == null;
    }

    public void addFirst(int data) {
        MyNode node = new MyNode();
        node.data = data;
        node.next = first;
        first = node;
        numberOfNodes ++;

    }

    public int getSize() {
        return numberOfNodes;
    }

    public MyNode peek() {
        return first;
    }

    public MyNode deleteFirst() {
        MyNode temp = first;
        first = first.next;
        numberOfNodes --;
        return temp ;
    }

}
