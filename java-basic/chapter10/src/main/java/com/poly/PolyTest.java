package com.poly;

/**
 * Author:ZJF
 * Date:2021-01-12 上午8:16
 */
public class PolyTest {
    public static void main(String[] args) {

        Master jim = new Master("JIM");
        Dog_ dog_ = new Dog_("小黄");
        Fish fish = new Fish("黄花鱼");
        Cat_ cat_ = new Cat_("小白");
        Food food = new Food("骨头");

        jim.feed(dog_,food);
        jim.feed(cat_,fish);
        jim.feed(cat_,food);
    }
}


class Master {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Master(String name) {
        super();
        this.name = name;
    }

//	//喂食物 -> 给猫猫喂鱼
//	public void feed(Cat cat , Fish fish) {
//		System.out.println("主人 " + name + " 给 " + cat.getName() + " 吃 " + fish.getName());
//	}
//
//	//方法重载
//	public void feed(Dog dog , Bone bone) {
//		System.out.println("主人 " + name + " 给 " + dog.getName() + " 吃 " + bone.getName());
//	}

    //思考 如果喂食物的组合关系，那么就会出现很多的 feed方法，出现方法爆炸=>提出解决方案 多态

    public void feed(Animal_ animal, Food food) {
        System.out.println("主人 " + name + " 给 " + animal.getName() + " 吃 " + food.getName());
    }

}

//使用程序 ， 模拟 主人给动物喂食物
class Food { //食物
    private String name;

    public Food(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Fish extends Food { //鱼肉

    public Fish(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

}

class Bone extends Food  {//骨头

    public Bone(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

}

class Animal_ { //动物类
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal_(String name) {
        super();
        this.name = name;
    }

}

class Cat_ extends Animal_ { //猫类

    public Cat_(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

}

class Dog_ extends Animal_ {

    public Dog_(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

}
