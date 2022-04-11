package chapter3Tests;

import personalFun.MethodsForUse;
import personalFun.MyPC;

public class MyPCTest {
    public static void main(String[] args) {
        MyPC.setName("amaka");
        System.out.println(MyPC.getName());

        MethodsForUse methods = new MethodsForUse("amaka",12);
        methods.setName("amara");
        System.out.println(methods.getName());

        MyPC pc = new MyPC("fay",72);
        pc.setAge(27);
        System.out.println(pc.getAge());




    }

}
