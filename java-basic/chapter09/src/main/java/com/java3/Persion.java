package com.java3;


public class Persion {
    private String namePrivate;
    String name;
    public String namePublic;
    private void sayPrivate() {
        System.out.println("sayPrivate");
    }

    void say() {
        System.out.println("say");
    }

    public void sayPublic() {
        System.out.println("sayPublic");
    }

    public void test(){
        //在本类中可以调用的权限修饰符有 ：private public 缺省的
        System.out.println(name);
        System.out.println(namePrivate);
        System.out.println(namePublic);

        say();
        sayPrivate();
        sayPublic();
    }
}
