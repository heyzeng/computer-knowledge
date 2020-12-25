package com.interface_;

/**
 * Author:ZJF
 * Date:2020-12-25 下午5:38
 */
public class InterfaceDetail02 {

    public static void main(String[] args) {
        new aa().hi();
    }
}

interface IA{
    int n1 = 10;
    void say();
}

interface IB{
    int n1 = 20;
    void hi();

}

class aa implements IA,IB{

    @Override
    public void say() {

    }

    @Override
    public void hi() {
        System.out.println(IA.n1 + " " + IB.n1);
    }
}
