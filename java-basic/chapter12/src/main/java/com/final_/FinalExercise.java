package com.final_;

/**
 * Author:ZJF
 * Date:2021-01-14 上午8:40
 */
public class FinalExercise {
}

class Circle {
    private double radius;
    private final double PI /*= 3.14*/;

    {
        PI = 3.14;
    }

    public Circle(double radius, double PI) {
        this.radius = radius;
        //this.PI = PI;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}
