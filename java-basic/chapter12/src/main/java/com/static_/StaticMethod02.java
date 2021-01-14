package com.static_;

/**
 * Author:ZJF
 * Date:2021-01-14 上午8:17
 */
public class StaticMethod02 {
    public static void main(String[] args) {

        Student jim = new Student("Jim");
        Student tom = new Student("tom");

        Student.payFee(1000);
        Student.payFee(1000);
        System.out.println(Student.returnFee()); //2000

        int[] arr = {1,2,3};
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

        System.out.println("=====");
        MyTools.printArray(arr);
    }
}

class Student{
    private String name;
    private static double totalFee;

    public Student(String name) {
        this.name = name;
    }

    public static void payFee(double totalFee){
        Student.totalFee += totalFee;
    }

    public static double returnFee(){
        return totalFee;
    }
}

class MyTools {
    public static void printArray(int[] arr){
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
