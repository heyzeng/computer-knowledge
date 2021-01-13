package com.test;

/**
 * Author:ZJF
 * Date:2021-01-13 上午8:35
 */
public class test03 {
    public static void main(String[] args) {

        Teacher tom = new Teacher("tom", 1, 1);

        test03 test03 = new test03();
        test03.printSal(tom);
    }
    //编写一个测试类,将各种类型的员工的全年工资打印出
    public void printSal(Employee2 employee2){
        employee2.printYearSal();
    }
}


/*
 六、设计父类—员工类。子类：工人类(Worker),农民类(peasant),教师类(teacher),科学家类(scientist),服务生类(waiter)。（10分）
（1）其中工人,农民,服务生只有基本工资。（10分）
（2）教师除基本工资外,还有课酬(元/天)。（10分）
（3）科学家除基本工资外,还有年终奖(bonus)。（10分）
（4）编写一个测试类,将各种类型的员工的全年工资打印出来。（10分）

思路分析
1. 类名 Employee2 属性 (sal name)
2. 子类 工人类(Worker),农民类(peasant),教师类(teacher) 特有属性[classDays classSal],科学家类(scientist) 属性[bonus],
     服务生类(waiter)
3. 测试
*/

class Employee2{
    private String name;
    private double sal; //月工资
    private int salMonths; // 有效的月薪 数

    public Employee2(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    //编写方法，返回基本的年薪
    public double basicYearSal(){
        return sal * salMonths;
    }

    //提供一个方法, 可以通过编译，在运行时，进行动态绑定到对应的子类
    public void printYearSal() { //

    }
}

class Work extends Employee2{
    public Work(String name, double sal) {
        super(name, sal);
    }

    public void printYearSal() {
        System.out.println("工人的年薪" + basicYearSal());
    }
}

class  Teacher extends Employee2{
    private int classDays;
    private double classSal;

    public Teacher(String name, double sal, double classSal) {
        super(name, sal);
        this.classSal = classSal;
    }

    public int getClassDays() {
        return classDays;
    }

    public void setClassDays(int classDays) {
        this.classDays = classDays;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    public void printYearSal() {
        System.out.println("老师的年薪" + (basicYearSal() + classDays * classSal));
    }
}
