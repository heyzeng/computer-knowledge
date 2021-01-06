package com.override;

/**
 * Author:ZJF
 * Date:2021-01-06 下午8:09
 */
public class OverrideDetail {

    public static void main(String[] args) {

        BB bb = new BB();
        bb.hi();
//        bb.run();
//        bb.say("name");
    }

}

class AA {

    public void say(String name) {
        System.out.println("AA say() " + name);
    }

    public Object hi() {
        return new Object();
    }

    void run() {
        System.out.println("AA run...");
    }
}

class BB extends AA{

    //子类的方法的参数,方法名称,要和父类方法的参数,方法名称完全一样
    @Override
    public void say(String name) {
        System.out.println("BB say" + name);
    }

    //子类方法的返回类型需要和父类方法返回类型一样，或者是父类返回类型的子类
    @Override
    public String hi() {//string extend object
        return "";
    }

    //子类方法不能缩小父类方法的访问权限
    //一代更比一代强
//    @Override
//    void run() {
//        System.out.println("BB run");
//    }


    @Override
    public void run() {
        System.out.println("BB run");
    }
}
