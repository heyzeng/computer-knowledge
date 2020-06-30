package com.exer2;


public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person("sss",15);
        System.out.println(person.getAge());
        System.out.println(person.getName());

    }
}
/*
 *  1. 在前面定义的Person类中添加构造器，利用构造器设置所有人的age属性初始值都为18。

	2. 添加带name和age两个参数的构造器,使得每次创建Person对象的同时初始化对象的age属性值和name属性值
*/

class Person {

    private String name;
    private int age;


    public Person() {
        age = 18;
    }

    public Person(String n, int a) {
        name = n;
        age = a;
    }


    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

