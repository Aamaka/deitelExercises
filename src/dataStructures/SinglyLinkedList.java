package dataStructures;

class Node<T>{
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T data(){
        return data;
    }
    public void addNext(Node<T> node){
        next = node;
    }

    public Node<T> next(){
        return next;
    }

    public void setNext(Node<T> node){
        this.next = node;
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

    public void  insert(T data, int position){
        if(position < 0 || position > size){
            throw new IllegalArgumentException(
                    String.format("position %d cannot be less than 0 and greater than size ",position));

        }
        Node<T> newNode = new Node<>(data);
        int count = 0;

        Node<T> current = head;
        while (count < position){
            current = current.next();
            count++;

        }
        Node<T> temp = current.next();
        current.addNext(newNode);
        current.addNext(temp);
        size++;

    }
    public void delete(){
        Node<T> current  = head;
        if(head.next() == null){
            head = null;
            return;
        }
        while (current.next().next() != null){
            current = current.next();
        }
        current.setNext(null);
        size--;
    }

    public void delete(T data){
        Node<T> current = head;
        Node<T> previous = head;

        while (current.data() != data && current.next() != null){
            previous = current;
            current = current.next();
        }
        if(current.next() == null){
            throw new IllegalArgumentException(String.format("Data %d not found", data));
        }
        previous.setNext(current.next());
    }

    public void printList(){
        Node<T> current = head;

        while (current != null){
            System.out.println(current.data() + "-->");
            current = current.next();
        }
    }

    public int size (){
        return size;
    }

    public Node<T> getHead(){
        return head;
    }

}
