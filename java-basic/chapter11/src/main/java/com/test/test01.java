package com.test;

import java.util.Objects;

/**
 * Author:ZJF
 * Date:2021-01-13 上午8:28
 */
public class test01 {
    public static void main(String[] args) {

        Professor professor = new Professor("jim", 100, 10000, "nanjing", 1020);
        Professor professor1 = new Professor("jim", 100, 10000, "nanjing", 1020);
        System.out.println(professor.equals(professor1));

    }
}

///*
//（1）要求有属性“姓名name”，“年龄age”，“职称post”，“基本工资salary”（10分）
//（2）编写业务方法， introduce（），实现输出一个教师的信息。（10分）
//（3）：编写教师类的三个子类：教授类(professor)、副教授类(vice professor)、讲师类(lecturer)。工资级别分别为：
//          教授为1.3、副教授为1.2、讲师类1.1。在三个子类里面都重写父类的introduce（）方法。
//（4）定义并初始化一个老师对象，调用业务方法，实现对象基本信息的后台打印。（10分）
//
//OOP
//(1) 类名  Teacher 属性 (name, age, post,salGrade ) 方法 introduce
//(2) 教授类(professor)、副教授类(vice professor)、讲师类(lecturer), 重写 introduce
//(3) 测试
//*

class  Professor {
    private String name;
	private int age;
	private double salary;
	private String post;
	private double salGrade;

    public Professor(String name, int age, double salary, String post, double salGrade) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.post = post;
        this.salGrade = salGrade;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalGrade() {
        return salGrade;
    }

    public void setSalGrade(double salGrade) {
        this.salGrade = salGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return age == professor.age &&
                Double.compare(professor.salary, salary) == 0 &&
                Double.compare(professor.salGrade, salGrade) == 0 &&
                Objects.equals(name, professor.name) &&
                Objects.equals(post, professor.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary, post, salGrade);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", post='" + post + '\'' +
                ", salGrade=" + salGrade +
                '}';
    }

    public void introduce(){
        System.out.println(this.age + this.salary);
    }
}
