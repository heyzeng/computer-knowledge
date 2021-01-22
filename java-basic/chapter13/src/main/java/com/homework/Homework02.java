package com.homework;

import java.util.Objects;

/**
 * Author:ZJF
 * Date:2021-01-22 上午8:26
 */
public class Homework02 {
    public static void main(String[] args) {

        Computer computer = new Computer("apple", 100);
        Computer computer1 = new Computer("apple", 100);
        System.out.println(computer.equals(computer1));

        Person person = new Person("Jim", '男', computer);
        Person person1 = new Person("Jim", '男', computer1);
        System.out.println(person.equals(person1));
        System.out.println(person.hashCode() + " " + person1.hashCode());
    }
}

class Computer{
    private String brand;
	private double price;

    public Computer(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean equals(Object object){
        if (this == object){
            return true;
        }

        if (!(object instanceof Computer)){
            return false;
        }

        Computer computer = (Computer)(object);
        return brand.equals(computer.brand) && this.price == computer.price;

    }
}

//定义Person类，里面包含姓名、性别和电脑属性（Computer类型），合理封装，并覆盖equals方法，比较属性值是否相同
class Person{
    private String name;
	private char gender;
	private Computer computer;

    public Person(String name, char gender, Computer computer) {
        this.name = name;
        this.gender = gender;
        this.computer = computer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }

        if (!(o instanceof Person)){
            return false;
        }

        Person person = (Person)o;
        return person.computer.equals(this.computer) && person.gender == this.gender && person.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getGender(), getComputer());
    }
}
