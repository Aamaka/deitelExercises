package chapter11;

public class Main {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        Beans beans = messenger.buyBeans(5000,false,false);
        System.out.println(beans);
    }
}
