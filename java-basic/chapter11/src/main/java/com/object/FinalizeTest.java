package com.object;

/**
 * Author:ZJF
 * Date:2021-01-13 上午8:19
 */
public class FinalizeTest {
    public static void main(String[] args) {

        //当对象被回收时，系统自动调用该对象的finalize方法。子类可以重写该方法，做一些释放资源的操作
        //JVM
        Car car = new Car("ben");
        car = null;

        //主动触发垃圾回收机制
        System.gc();
        System.out.println("program exit");
    }
}

class Car{
    String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("car 被回收");
    }
}
