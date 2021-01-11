package com.poly;

/**
 * Author:ZJF
 * Date:2021-01-11 上午9:24
 */
public class PolyDown {

    public static void main(String[] args) {

        Animal animal = new Cat();

        Cat cat = (Cat)animal;
        cat.catchMouse();
    }
}

class Animal { //父类
    String name = "动物";
    int age = 10;

    public void sleep() {
        System.out.println("睡");
    }

    public void run() {
        System.out.println("跑");
    }

    public void eat() {
        System.out.println("吃");
    }

    public void show() {
        System.out.println("哈哈");
    }
}

class Cat extends Animal { //子类
    public void eat() {//重写
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}

class Dog extends Animal {

}
