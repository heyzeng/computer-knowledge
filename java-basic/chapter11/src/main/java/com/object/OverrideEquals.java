package com.object;

/**
 * Author:Jude
 * Date:2021-01-12 下午10:41
 */
public class OverrideEquals {
    public static void main(String[] args) {

        Person person = new Person("JIM", 10, '男');
        Person person2 = new Person("JIM", 10, '男');

        System.out.println(person.equals(person2));// 没有重写前False, 重写后，返回 T,而且调用的equals方法根据就近原则，则调用自己重写的
    }
}

class Person{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //如果两个Person对象的各个属性值都一样，结果为true，反之为false
    public boolean equals(Object obj){
        if (obj == this){return true;}//判断是不是同一个对象

        if (!(obj instanceof Person)){//判断类型 如果obj不是一个Person
            return false;
        }

        Person p2 = (Person)obj;//为了取得 obj的属性，我们需要将其进行向下转型
        return this.age == p2.age && this.gender == p2.gender && this.name.equals(p2.name);
    }
}
