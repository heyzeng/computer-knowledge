package com.poly;

/**
 * Author:ZJF
 * Date:2021-01-12 上午8:25
 */
public class PolyUpTest {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        aaa.run();
        aaa.say();

        aaa = new BBB();//向上转型 (父类引用指向了子类对象) => 动态绑定
        aaa.run();//(1) 先找 BBB 的run ,没有找到 (2) 找 父类的 run
        aaa.say();
    }
}

class AAA {
    public void say() {
        System.out.println("AAA say()");
    }
    public void run() {
        System.out.println("AAA run()");
    }
}

class BBB extends AAA {
    public void say() {
        System.out.println("BBB say()");
    }

}
