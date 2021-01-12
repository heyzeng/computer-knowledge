package com.homework;

/**
 * Author:ZJF
 * Date:2021-01-12 上午8:35
 */
public class Homework01 {
    public static void main(String[] args) {

        ManKind manKind = new ManKind(1, 10);
        manKind.manOrWomen();
        manKind.employee();

        System.out.println("========");
        Kids kids = new Kids(1, 10, 10);
        kids.printAge();
        kids.manOrWomen();
        kids.employee();
    }
}


/*
 定义一个ManKind类，包括
  (1)
成员变量int sex和int salary；
方法void manOrWorman()：根据sex的值显示“man”(sex==1)或者“women”(sex==0)；
方法void employeed()：根据salary的值显示“no job”(salary==0)或者“ job”(salary!=0)。
要求加上两个参数有参构造

	分析 : sex 值 只能是 0 or 1
	不敢
*/

class ManKind {
    private int sex;
    private int salary;

    public ManKind(int sex, int salary) {
        this.sex = sex;
        setSex(sex);
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        if (sex == 0 || sex == 1){
            this.sex = sex;
        }else {
            System.out.println("no sex ,default is 1");
            this.sex = 1;
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWomen(){
        if (sex == 1 ){
            System.out.println("man");
        }else {
            System.out.println("women");
        }
    }

    public void  employee(){
        if (salary == 0){
            System.out.println("no job");
        }else {
            System.out.println("have a job");
        }
    }

}

/*
 (2)定义类Kids继承ManKind，并包括
成员变量int yearsOld；//特有属性
方法printAge()打印yearsOld的值。
(3)在Kids类的main方法中实例化Kids的对象someKid，用该对象访问其父类的成员变量及方法。
*/

class Kids extends ManKind{
    private int yearsOld;

    public Kids(int sex, int salary, int yearsOld) {
        super(sex, salary);
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println("age = " + yearsOld);
    }

    public static void main(String[] args) {
        Kids kids = new Kids(1, 4800, 30);
        kids.setSalary(0);
        kids.setSex(0);
        kids.employee();
        kids.manOrWomen();
    }
}
