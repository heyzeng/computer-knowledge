package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author:ZJF
 * Date:2020-12-30 上午9:31
 */
public class CollectionExercise {

    public static void main(String[] args) {

       // Dog[] dogs = {new Dog("jim","red"),new Dog("tom","blue")};

        List list = new ArrayList();
        list.add(new Dog("Jim","red"));
        list.add(new Dog("tom","blue"));

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Object dog:list) {
            System.out.println(dog);
        }
        }
    }

class Dog{
    private String name;
    private String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
