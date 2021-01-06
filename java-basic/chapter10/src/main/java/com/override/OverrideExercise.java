package com.override;

/**
 * Author:ZJF
 * Date:2021-01-06 下午8:17
 */
public class OverrideExercise {

    public static void main(String[] args) {

        Student jim = new Student("Jim", 10, 1, 10.1);
        jim.showInfo();
    }
}

/*
 编写一个Person类，包括属性/private（name、age），构造器、方法say(返回自我介绍的字符串）。
编写一个Student类，继承Person类，增加ID、Score属性/private，以及构造器，定义say方法(返回自我介绍的信息)。
编写Test类，分别创建Person和Student对象，调用say方法输出自我介绍。
*/

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showInfo(){
        System.out.println(name + " " + age);
    }
}

class Student extends Person {

    private int Id;
    private double score;

    public Student(String name, int age, int id, double score) {
        super(name, age);//父类构造器，完成父类属性初始化
        Id = id;
        this.score = score;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public void showInfo() {
        System.out.println(score + " " + Id + " " + super.getName() + super.getAge());
    }
}
