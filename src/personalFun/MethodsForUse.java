package personalFun;

public class MethodsForUse {
    private static String name;
    private  int age;

    public  MethodsForUse(String name, int age ){
     MethodsForUse.name = name;
     this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        MethodsForUse.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void letsDance(String song){
        name = "my mother is my guardian, she cares for me";
        for (int i = 0; i < song.length(); i++) {
            System.out.println(song.charAt(i));
        }

    }
}
