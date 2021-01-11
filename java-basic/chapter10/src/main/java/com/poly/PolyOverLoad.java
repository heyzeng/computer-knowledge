package com.poly;

/**
 * Author:ZJF
 * Date:2021-01-11 上午9:36
 */
public class PolyOverLoad {

    public static void main(String[] args) {

        //方法的重载提现多态
        T t = new T();
        t.say(100);
        t.say("Jim");

    }
}

class T {
    public void say(String name) {
        System.out.println("hi " + name);
    }
    public void say(int num) {
        System.out.println("hello" + num);
    }
}
