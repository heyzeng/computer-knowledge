package com.homework;

/**
 * Author:ZJF
 * Date:2021-01-12 上午8:58
 */
public class Cylinder extends Circle{
    private double length; //长度

    public Cylinder(double radius, double length) {
        super(radius);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double calculateCylinderArea(){
        return length * calculateArea();
    }
}
