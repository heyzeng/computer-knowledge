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

        Student[] stu = new Student[20];

        for (int i = 0; i < stu.length; i++) {

            //创建学生对象
            Student student = new Student();
            //给学生赋值号码
            student.number = i + 1;
            //给学生赋值年级(1~6)
            student.state = (int)(Math.random() * 6 +1);
            //成绩
            student.score = (int)(Math.random() * 100);
            //将学生对象存放到数组中
            stu[i] = student;
        }

        for (int i = 0; i < stu.length; i++) {
            Student s = stu[i];
            if (s.state == 3){
                //输出学生信息
                System.out.println(s.number + " " + s.state + " " + s.score);
            }
        }

    }

}

class Student{
    int number;
    int state;
    int score;
}