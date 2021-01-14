package com.static_;

/**
 * Author:ZJF
 * Date:2021-01-13 下午7:39
 */
public class StaticDetail {
    public static void main(String[] args) {

        A a = new A();
        int n1 = a.n1;
        System.out.println(a.n1);

        //实例变量不能通过 类名.类变量名 方式访问
        //System.out.println(A.age);
        //类变量是在类加载时就初始化了，也就是说，即使你没有创建对象，只要类加载了，就可以使用类变量了
        int n2 = B.n2;
        System.out.println(B.n2);

    }
}

class A {
    public int n1 = 10;
}

class B {
    public static int n2 = 20;
}
