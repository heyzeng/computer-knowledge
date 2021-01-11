package com.super_;

/**
 * Author:ZJF
 * Date:2021-01-07 下午6:25
 */
public class SuperDetail {

    public static void main(String[] args) {

        BBB bbb = new BBB();
        bbb.m1();
        bbb.m2();
    }
}

class GrandPa {
    public void hello() {
        System.out.println("GrandPa hello()");
    }
}

class AAA extends GrandPa{
    public int n1 = 100;
    public void say() {
        System.out.println("AAA say...");
    }
    public void hi() {
        System.out.println("AAA hi....");
    }
    public void hello() {
        System.out.println("AAA hello()");
    }
}

class BBB extends AAA{
    public int n1 = 10;
    public void say(){
        System.out.println("say bbb");
    }

    public void m1(){
        //当子类中有和父类中的成员（属性和方法）重名时，为了访问父类的成员，必须通过super。
        //如果没有重名，使用super、this、直接访问是一样的效果
        //希望调用 父类的 say
        super.say();

        //希望调用 父类的 n1
        System.out.println(super.n1);

        //希望调用 父类 hi, super、this、直接访问是一样的效果
        this.hi();///查找流程 (1) 直接到父类去查找 hi方法 (2) 如果父类没有就继续向上查找 (3) 如果都没有，则报错
        super.hi();//查找流程(1) 先在本类去查找 hi方法 (2) 如果本类没有，则继续向父类及以上查找, 如果都没有，则报错
        hi();//等价 this.hi()

        //属性使用super, this , 默认不写的查找关系和 方法一样
    }

    public void m2(){
        //super的访问不限于直接父类，如果爷爷类和本类中有同名的成员，也可以使用super去访问爷爷类的成员；
        //如果多个基类中都有同名的成员，使用super访问遵循就近原则。A->B->C
        super.hello();
    }
}
