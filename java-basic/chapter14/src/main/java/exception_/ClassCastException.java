package exception_;

/**
 * Author:Jude
 * Date:2020-12-26 上午10:21
 */
public class ClassCastException {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Cat cat = (Cat) dog;

    }
}

class Animal{ }

class Dog extends Animal{ }

class Cat extends Animal{}