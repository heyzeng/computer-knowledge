package com.interface_;

/**
 * Author:ZJF
 * Date:2021-01-19 上午10:29
 */
public class InterfacePolyPass {
    public static void main(String[] args) {
        A a = new A();
        a.cry();

        B b = new B();
        b.cry();

        //1. 当一个类实现了某个接口
        //2. 这个类的对象可以赋给该接口的引用
        //3. 如果这个类被继承，那么这个类的子类的对象，也可以赋给该接口的引用
        //4. 不限于一级，可以多级传递.
        AIter a1 = a;
        a1.cry();

        AIter b1 = b;
        b1.cry();
    }
}

interface AIter{
    public void cry();
}

class A implements AIter{

    @Override
    public void cry() {
        System.out.println("cry.....");
    }
}

class B extends A{

}
