package com.abstract_;

/**
 * Author:ZJF
 * Date:2021-01-15 上午9:36
 */
public class AbstractClassPolyArr {
    public static void main(String[] args) {

        Animal animal = new Cat("cat");
//        animal = new Dog("dog");

        Cat cat = new Cat("cat");
        test(cat);
        Dog dog = new Dog("dog");
        test(dog);
    }
    public static void test(Animal animal){

        animal.eat();//动态绑定
        if (animal instanceof Cat){
            ((Cat) animal).catchMouse();
        }else if (animal instanceof Dog){
            ((Dog) animal).lookDoor();
        }
    }

}

abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eat();
}

class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("cat eat");
    }

    public void catchMouse(){
        System.out.println("cat catch mouse");
    }
}

class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("dog eat bone");
    }

    public void lookDoor(){
        System.out.println("dog look door");
    }
}

