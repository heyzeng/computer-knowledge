package com.codeblock;

/**
 * Author:ZJF
 * Date:2021-01-14 上午9:18
 */
public class StaticCodeBlock01 {
    public static void main(String[] args) {

        /**
         * static
         * hello
         * hello
         * hello
         * hello
         */
//        new BB();
//        new BB();
//        new BB();
//        new BB();

        BB.hi();//static hi



    }
}

class BB{

    //如果是普通代码块，是对对象初始化, 每创建一个对象
    {
        System.out.println("hello");
    }

    //而且它随着类的加载而执行，并且只会执行一次
    static {
        System.out.println("static");
    }

    public static void hi(){
        System.out.println("hi");
    }
}
