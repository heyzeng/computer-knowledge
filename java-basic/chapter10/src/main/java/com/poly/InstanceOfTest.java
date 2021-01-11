package com.poly;

/**
 * Author:ZJF
 * Date:2021-01-11 上午8:22
 */
public class InstanceOfTest {

    public static void main(String[] args) {

        AAAA aaaa = new AAAA();
        BBBB bbbb = new BBBB();
        Object o = new Object();

        //instanceOf 比较操作符，用于判断某个对象的运行类型是否为XX类型或XX类型的子类型
        System.out.println(bbbb instanceof AAAA);
        System.out.println(bbbb instanceof Object);
        System.out.println(aaaa instanceof Object);
        System.out.println(o instanceof BBBB);


    }
}

class AAAA{}

class BBBB extends AAAA{}
