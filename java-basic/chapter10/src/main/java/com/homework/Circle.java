package com.homework;

/**
 * Author:ZJF
 * Date:2021-01-12 上午8:56
 */
public class Circle {
    private double radius;// 半径

    public Circle(){
        this(1);
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }}
