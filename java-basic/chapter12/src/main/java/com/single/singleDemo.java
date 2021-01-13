package com.single;

import jdk.nashorn.internal.ir.CallNode;

/**
 * Author:ZJF
 * Date:2021-01-13 上午9:06
 */
public class singleDemo {
    public static void main(String[] args) {

        /**
         * 1)	二者最主要的区别在于创建对象的时机不同：饿汉式是在类加载就创建了对象实例，而懒汉式是在使用时才创建。
         * 2)	饿汉式不存在线程安全问题，懒汉式存在线程安全问题.
         * 3)	饿汉式存在浪费资源的可能。因为如果程序员一个对象实例都没有使用，那么饿汉式创建的对象就浪费了，懒汉式是使用时才创建，就不存在这个问题。
         * 4)	在javaSE标准类中，java.lang.Runtime就是经典的单例模式
         *
         *
         * java.lang.Runtime 经典单例模式
         *
         * public class Runtime {
         *     private static Runtime currentRuntime = new Runtime();
         *     public static Runtime getRuntime() {
         *         return currentRuntime;
         *         private Runtime() {}
         *     }
         *     }
         */
        Dog dog = Dog.getDog();
        Dog dog1 = Dog.getDog();
        System.out.println(dog == dog1);//true

        Cat jim = Cat.getCat("jim");
        Cat tom = Cat.getCat("tom");//不起作用
        System.out.println(jim == tom);//true
    }
}

//恶汉式
// 对象还没使用就创建了
class Dog{
    private String name;

    //事先就创建一个
    private   static  Dog dog = new Dog("jim");

    //将构造器私有化
    private Dog(String name) {
        this.name = name;
    }
    //提供一个public static 方法，可以返回dog
    public static  Dog getDog(){
        return dog;
    }
}

//懒汉式
//存在线程安全问题
class Cat{
    private String name;

    private static Cat cat;

    private Cat(String name) {
        this.name = name;
    }

    public static Cat getCat(String name){
        if(cat == null) {
            Cat cat = new Cat(name);
        }
        return cat;
    }
}
