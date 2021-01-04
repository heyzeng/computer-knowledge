package com.inner.nonameinner;

import java.io.Serializable;

/**
 * Author:ZJF
 * Date:2020-12-24 上午10:03
 */
public class NoNameInnerClassApply01 {

    public static void main(String[] args) {

        show(new A() {
            @Override
            public void say() {
                System.out.println("ok");
            }
        });
    }

    //方法
    public static void show(A a){
        a.say();
    }
}

interface A{
    void say();
}

class Dog implements Serializable {

}
