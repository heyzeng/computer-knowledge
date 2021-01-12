package com.poly;

/**
 * Author:ZJF
 * Date:2021-01-12 上午8:14
 */
public class PolyProperties {
    public static void main(String[] args) {

        Base base = new Base();
        System.out.println(base.n);

        Sub sub = new Sub();// 属性没有重写之说！属性的值看编译类型
        System.out.println(sub.n);
    }
}

class Base {
    public int n = 200;
}

class Sub extends Base {
    public int n = 300;
}
