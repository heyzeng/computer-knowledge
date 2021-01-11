package com.poly;

/**
 * Author:ZJF
 * Date:2021-01-11 上午9:31
 */
public class PolyObject {

    public static void main(String[] args) {

        //对象多态的一个层面
        //(1) 父类的引用 可以 指向 子类的对象
        //(2) animal 就存在两种类型 1. 编译类型 2. 运行类型
        //(3) 编译类型: 就是编译器识别的类型 animal 的编译类型就是 Animal
        //    当程序员写代码时，只能调用编译类型可以 调用的方法和属性
        //(4) 运行类型: 就是JVM 在运行的过程中识别的类型，这里 animal的运行类型就是 Cat

        //对象多态的第二个层面
        //(1) 一个对象引用，比如 animal 它的编译类型是不能改变的, 这里 就是Animal
        //(2) 一个对象引用 ，它的运行类型是可以变化的. 比如变成 Dog

        Animall animall = new Catt();
        animall.cry();

        animall = new Dogg();
    }
}

class Animall {

    public void cry() {
        System.out.println("Animal crying.. ");
    }
}

class Catt extends Animall {
    public void run() {
        System.out.println("Cat is running");
    }
}

class Dogg extends Animall {
    public void eat() {
        System.out.println("小狗 吃 狗粮...");
    }
}
