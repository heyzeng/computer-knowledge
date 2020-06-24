package com.exer;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.HashMap;

/*
 * 定义类Student，包含三个属性：学号number(int)，年级state(int)，
 * 成绩score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定，
 * 打印出3年级(state值为3）的学生信息。

 */
public class studentTest {

    public static void main(String[] args) {

        Student[] students = new Student[20];
        students.equals(students);
        HashMap<String, Integer> stringHashMap = new HashMap<String, Integer>();
        Integer aaa = stringHashMap.put("aaa", 1);
        System.out.println(stringHashMap + " " );

    }
}

class Student{
    int number;
    int state;
    int score;
}