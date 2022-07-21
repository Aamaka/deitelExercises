package dataStructures;

class Node<T>{
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public void addNext(Node<T> node){
        next = node;
    }

    public Node<T> next(){
        return next;
    }
}


public class SinglyLinkedList<T> {
    private Node<T> head;
    private int size;


    public SinglyLinkedList(){
        head = null;
        size = 0;
    }

    public SinglyLinkedList(T data){
        this.head = new Node<>(data);
        this.size++;
    }

    public void  insert(T data){
        Node<T> newNode = new Node<>(data);

        Node<T> current = head;
        while (current.next() != null){
            current = current.next();
        }
        current.addNext(newNode);
        size++;
    }

    public int size (){
        return size;
    }

    public Node<T> getHead(){
        return head;
    }

}
