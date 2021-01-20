package com.inner;

/**
 * Author:ZJF
 * Date:2021-01-20 上午9:31
 */
public class InnerClassTest01 {
}

//如何理解
//1. 类该怎么写就怎么写，基本的语法一样
//2. 变化就是1. 作用域发生变化 2. 使用形式有微小变化

class MyInner{

    class BB{
        class C{
            public void say(){
                class Cat{}
            }
        }
    }

    class AA {}
}
