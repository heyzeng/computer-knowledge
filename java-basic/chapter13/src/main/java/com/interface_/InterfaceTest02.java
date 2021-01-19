package com.interface_;

/**
 * Author:ZJF
 * Date:2021-01-19 上午10:38
 */
public class InterfaceTest02 {
    public static void main(String[] args) {
        IAA.hello();
    }
}

interface IAA{
    public void hi();

    default public void hey(){
        System.out.println("hi");
    }

    public static void hello(){
        System.out.println("hello");
    }
}
