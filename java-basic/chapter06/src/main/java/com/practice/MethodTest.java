package com.practice;


public class MethodTest {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.cal(4);
        cat.calculate();
        cat.getNumber(1,2);
        cat.speak();


    }
}
class Cat{//定义一个猫类(数据类型)  Cat.class

    int age;  // 0
    String color; // null
    String name; // null


    public void calculate(){
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    //行为 =》 方法
    //添加speak 成员方法,输出 我是一只好猫
    //解读
    //1. public 表示公开方法
    //2. void 没有返回值
    //3. speak 方法名, () 没有形参
    //4 { } 称为方法体
    //5. 写入你的代码
    public void speak(){
        System.out.println("hello world");
    }


    public void cal(int n){

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;

        }
        System.out.println(sum);
    }


    public void getNumber(int a,int b){
        int sum = 0;
        sum = a + b;
        System.out.println(sum);
    }
}
