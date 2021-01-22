package com.homework;

/**
 * Author:ZJF
 * Date:2021-01-22 上午8:41
 */
public class Homework03 {
}

/*

a)做一个Student类，Student类有名称（name），性别(sex),年龄（age），学号（stu_id），做合理封装，
    通过构造器在创建对象时将4个属性赋值。
b)写一个Teacher类，Teacher类有名称（name），性别（sex），年龄（age），工龄（work_age),做合理封装，
    通过构造器在创建对象时将4个属性赋值。
c)抽取一个父类Person类，将共同属性和方法放到Person类
d)学生需要有学习的方法（study），在方法里写生“我承诺，我会好好学习。”。
e)教师需要有教学的方法（teach），在方法里写上“我承诺，我会认真教学。”。
f)学生和教师都有玩的方法（play），学会玩的是足球，老师玩的是象棋，此方法是返回字符串的，
    分别返回“xx爱玩足球”和“xx爱玩象棋”（其中xx分别代表学生和老师的姓名）。因为玩的方法名称都一样，所以要求此方法定义在父类中，子类实现重写。
  //下面g, h 是使用，因此我们可以开始走代码
g)定义多态数组，里面保存2个学生和2个教师，要求按年龄从高到低排序，
h)定义方法，形参为Person类型，功能：调用学生的study或教师的teach方法 //多态

 思路分析
 1. 父类Person类 , 属性 [名称（name），性别(sex),年龄（age）],方法 [setXX, getXX, play返回字符串]
 2. Student类 , 属性 [学号（stu_id）]  方法 study, play重写
 3. Teacher类, 属性 [工龄（work_age)] 方法 teach , play重写
 4. 输出信息[OOP 编程思想]
 4.1 给 Teach 类和 Student 增加 printInfo方法
 4.2 充分利用我现有的方法，进行组合输出
 */
