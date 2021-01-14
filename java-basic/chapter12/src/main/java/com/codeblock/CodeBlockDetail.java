package com.codeblock;

/**
 * Author:ZJF
 * Date:2021-01-14 上午8:43
 */
public class CodeBlockDetail {
    public static void main(String[] args) {

        //创建子类对象实例，父类也会被加载
        //new CCC();
        //使用类的静态成员时(静态属性，静态方法) , 使用的这个类，会加载 , 它的超类，都会被加载..
        System.out.println(CCC.num);
    }
}

class AAA {
    static {
        System.out.println("AAA ");
    }
}

class BBB extends AAA {
    static {
        System.out.println("BBB ");
    }
}

class CCC extends BBB {

    public static int num = 10;

    static {
        System.out.println("CCC ");
    }

    public CCC() {
        System.out.println("CCC 构造器...");
    }
}

