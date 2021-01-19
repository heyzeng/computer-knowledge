package com.interface_;

/**
 * Author:ZJF
 * Date:2021-01-19 上午11:10
 */
public interface IUser {
    void say();
    public void hi();
}

interface IOrder{
    //接口中的属性,只能是final的，而且是 public static final 修饰符。比如： int a=1
    int num = 1; //属性都是 public static final
    public void run();

    public static void main(String[] args) {
        System.out.println(IOrder.num);
    }
}


class AAA implements IUser{

    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}

//抽象类实现接口，可以不用实现接口的方法
abstract class BBB implements IOrder{

}

//一个类同时可以实现多个接口
//口诀：类是单继承，接口是多实现
class CCC implements IOrder,IUser{

    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }

    @Override
    public void run() {

    }
}
