package com.practice;


public class ProDetail {


    public static void main(String[] args) {

        Cat myCat = new Cat();
        System.out.println("默认值 " + myCat.name + " " + myCat.age + " " + myCat.color);

        Cat myCat2 = new Cat();
        myCat2.name = "小白";
        System.out.println("mycat " + myCat.name + " " + myCat.age + " " + myCat.color);
        System.out.println("mycat2 " + myCat2.name + " " + myCat2.age + " " + myCat2.color);


    }
}
