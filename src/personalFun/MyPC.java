package personalFun;

public class MyPC {
    private static String name;
    private int age;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        MyPC.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyPC(String name, int age) {
        MyPC.name = name;
        this.age = age;
    }

}
