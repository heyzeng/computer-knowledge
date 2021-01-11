package com.poly;

/**
 * Author:ZJF
 * Date:2021-01-11 上午9:09
 */
public class PolyArray {

    public static void main(String[] args) {
        //多态数组
        Person[] person = {new Person("J", 10), new Student("o", 18, 10.1),
                new Teacher("L", 70, 1000)};

        PolyArray polyArray = new PolyArray();
        polyArray.test(person);
    }

    /*
     * 应用实例升级：如何调用子类特有的方法，比如
     * Teacher 有一个 teach , Student 有一个 study怎么
     * 调用？[实现在多态数组调用各个对象的方法]遍历+instanceof + 向下转型
     */
    public void test(Person[] person) {
        for (int i = 0; i < person.length; i++) {
            if (person[i] instanceof Teacher) {
                ((Teacher) person[i]).teach();
            } else if (person[i] instanceof Student) {
                ((Student) person[i]).study();
            } else {
                person[i].say();
            }
        }

    }
}

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        super();
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

    public String say() {
        return "信息 name= " + name + " age= " + age;
    }
}

class Student extends Person {
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public void study() {
        System.out.println("学生 " + getName() + " is studying java...");
    }

}

class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void teach() {
        System.out.println("老师 " + getName() + " is teaching java ");
    }
}
