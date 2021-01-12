package com.homework;

/**
 * Author:ZJF
 * Date:2021-01-12 上午9:01
 */
public class Homework04 {
    public static void main(String[] args) {
        Circle circle = new Circle(10.1);
        System.out.println(circle.calculateArea());

        Cylinder cylinder = new Cylinder(10, 1);
        System.out.println(cylinder.calculateCylinderArea());
    }
}
