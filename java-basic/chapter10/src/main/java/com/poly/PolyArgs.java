package com.poly;

/**
 * Author:ZJF
 * Date:2021-01-11 上午8:44
 */
public class PolyArgs {

    public static void main(String[] args) {

        Employee work = new Work(100, "Jim");
        Employee manager = new Manager(1000,"Tom");

        PolyArgs polyArgs = new PolyArgs();
        polyArgs.showEmpAnnal(work);
        polyArgs.showEmpAnnal(manager);

        polyArgs.testWork(work);
        polyArgs.testWork(manager);


    }

    public void showEmpAnnal(Employee e){
        System.out.println(e.getAnnual() + " " + e.getName());
    }

    public void testWork(Employee e){
        if (e instanceof Work){
            ((Work) e).work();
        }else if (e instanceof Manager){
            ((Manager) e).manage();
        }
    }
}

class Employee{
    private double monSal;
    private String name;

    public Employee(double monSal, String name) {
        this.monSal = monSal;
        this.name = name;
    }

    public double getMonSal() {
        return monSal;
    }

    public void setMonSal(double monSal) {
        this.monSal = monSal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnual () {
        return 12 * monSal;
    }
}

//普通员工和经理继承了员工，经理类多了奖金bonus属性和管理manage方法，
//普通员工类多了work方法，普通员工和经理类要求分别重写getAnnual方法
class Work extends Employee{

    public Work(double monSal, String name) {
        super(monSal, name);
    }

    public void work(){
        System.out.println("work");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}

class Manager  extends  Employee{
    private double bonus;

    public Manager(double monSal, String name) {
        super(monSal, name);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }

    public void manage() {
        System.out.println("经理 " + getName() + " 正在管理中....");
    }
}



