package com.object;

/**
 * Author:ZJF
 * Date:2021-01-12 上午9:08
 */
public class EqualsExercise {
    public static void main(String[] args) {

        Order order = new Order(1, "Jim");
        Order order1 = new Order(1, "Jim");
        System.out.println(order.equals(order1));
    }
}

/*
 * 编写Order类，有int型的orderId，String型的OrderName，private属性。
相应的getter()和setter()方法，两个参数的构造器，重写父类的equals()方法：
public boolean equals(Object obj)，
并判断测试类中创建的两个对象是否相等。属性是否相同, 相同返回 t, 否则返回 False. 5min
*/

class Order{
    private int orderId;
    private String OrderName;

    public Order() {

    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        OrderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return OrderName;
    }

    public void setOrderName(String orderName) {
        OrderName = orderName;
    }

    public boolean equals(Object obj){
        if (this == obj){return true;}

        if (!(obj instanceof Order)){return false;}

         Order order = (Order)obj;

        return this.orderId == order.orderId && this.OrderName.equals(order.OrderName);
    }
}
