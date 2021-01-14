package com.static_;

/**
 * Author:ZJF
 * Date:2021-01-13 下午7:42
 */
public class StaticMethod01 {
    public static void main(String[] args) {

        AA.say();
    }
}

class AA{
    public static void say(){
        System.out.println("aaa");
    }
}
