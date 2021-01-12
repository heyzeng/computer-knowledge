package com.object;

/**
 * Author:ZJF
 * Date:2021-01-12 上午9:28
 */
public class EqualsTest {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        System.out.println(a == a1);

        A a2 = a1;
        A a3 = a1;
        System.out.println(a3 == a2);
        System.out.println(a1 == a2);
    }
}

class A{}
