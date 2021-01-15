package com.abstract_;

/**
 * Author:ZJF
 * Date:2021-01-15 上午9:26
 */
public class AbstractDetail {
    public static void main(String[] args) {
       // A a = new A(); 'A' is abstract; cannot be instantiated
    }
}

//抽象类不能被实例化
//抽象类不一定要包含abstract方法。也就是说,抽象类可以没有abstract方法
abstract class A {
}

//一旦类包含了abstract方法,则这个类必须声明为abstract
abstract class B {
    public abstract void say();
}

//抽象类可以有任意成员【因为抽象类还是类】，比如：非抽象方法、构造器、静态属性等等
//简单的说，就是非抽象类有的成员，抽象类都可以有
abstract class C {
   // public abstract String name;//abstract 只能修饰类和方法，不能修饰属性和其它的
    public void say(){
    }

    public abstract void hi();
}


abstract class DD{
    public abstract void say();
    public abstract void Hi();

}

//如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法，除非它自己也声明为abstract类
abstract class FF extends DD{
    private String name;
    public void say(){
    }
}

//抽象方法不能使用private、final 和 static来修饰，因为这些关键字都是和重写相违背的
class EE extends DD{

    @Override
    public void say() {

    }

    @Override
    public void Hi() {

    }
}
