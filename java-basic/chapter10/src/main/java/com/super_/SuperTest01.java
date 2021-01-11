package com.super_;

/**
 * Author:ZJF
 * Date:2021-01-08 上午9:28
 */
public class SuperTest01 {

    public static void main(String[] args) {

        BB bb = new BB();
        bb.m1();
        bb.m2();
    }
}

class AA {
    public int n1 = 10;
    protected int n2 = 20;
    int n3 = 30;
    private int n4 = 40;

    public void run() {

    }
    protected void eat() {

    }
    void sleep() {

    }
    private void cry() {

    }

    public  AA() {

    }
    public AA(String name) {

    }
}

class BB extends AA{

    public void m1(){
        super.eat();
        super.run();
        super.sleep();
    }

    public void m2(){
        //访问父类的属性 , 不能访问父类的private属性 [案例]    super.属性名
        //如果子类，和父类不在同一个包 ，默认的属性是否可以访问? 答不能
        System.out.println(super.n1 + " " + super.n2 + " "+ super.n3);
    }

    public BB() {
//        super();
        super("name");
    }
}
