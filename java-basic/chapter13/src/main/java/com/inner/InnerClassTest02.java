package com.inner;

/**
 * Author:ZJF
 * Date:2021-01-20 上午9:34
 */
public class InnerClassTest02 {
    public static void main(String[] args) {

        AAA aaa = new AAA();
        aaa.test();
    }
}

class AAA { //外部类
    private int n = 10;

    class BBB{//内部类, 它作用域就在 AAA中
        String name;

        public void say(){
            System.out.println("say...");
        }
    }

    public void test(){
        BBB bbb = new BBB();
        bbb.say();
    }
}
