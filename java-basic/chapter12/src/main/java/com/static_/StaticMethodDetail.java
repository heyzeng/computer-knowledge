package com.static_;

/**
 * Author:ZJF
 * Date:2021-01-14 上午8:32
 */
public class StaticMethodDetail {
    public static void main(String[] args) {

        DD.hello();
        DD.hi();
        DD.ok();
    }
}

class EE {
    public String name = "EE";
}

class DD extends EE {
    /*
     * 类方法和普通方法都是随着类的加载而加载，将结构信息存储在方法区 ：类方法中无this的参数,普通方法中隐含着this的参数
     * 类方法中，不能使用this ,普通方法可以使用this

     */

    private int num = 200;
    private static String name = "老王";
    public static void hi() {
        //System.out.println(this.num);
    }

    //类方法中不允许使用和对象有关的关键字，比如this和super
    public static void ok() {
        //System.out.println(this.num);
        //System.out.println(super.name);
    }
    //类方法(静态方法)中 只能访问 静态变量 或静态方法

    public void m1() {

    }

    public static void hello() {
        ok();
        //m1();
        System.out.println(name);
    }
    //普通成员方法(非静态方法)，既可以访问 普通变量(方法)，也可以访问静态变量(方法)
    public void m2() {
        ok();
        m1();
        System.out.println(name);
        System.out.println(num);
    }
}
