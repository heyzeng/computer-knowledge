package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Author:ZJF
 * Date:2020-12-31 上午10:03
 */
public class HashMapExercise01 {

    public static void main(String[] args) {

        HashMap hashMap = new HashMap();

        Emp emp1 = new Emp(1, "Jim", 100000);
        Emp emp2 = new Emp(2, "Tom", 200000);
        Emp emp3 = new Emp(3, "Jude", 100);

        hashMap.put(emp1.getId(),emp1);
        hashMap.put(emp2.getId(),emp2);
        hashMap.put(emp3.getId(),emp3);

        //first ergodic
        Set set = hashMap.keySet(); // to get key
        for (Object key : set) {
            Emp emp = (Emp) hashMap.get(key); //to get value
            if (emp.getSal() > 18000){
                System.out.println(emp);
            }
        }

        System.out.println("----");
        //second ergodic
        Iterator iterator = set.iterator(); //to get key
        while (iterator.hasNext()){
            Object next = iterator.next();// ergodic key
            Emp emp = (Emp)hashMap.get(next); //to get value
            if (emp.getSal() > 18000){
                System.out.println(emp);
            }
        }
    }
}

/*
使用HashMap添加3个员工对象，要求
键：员工id
值：员工对象

并遍历显示工资>18000的员工
(遍历方式最少两种)
员工类：姓名、工资、员工id
*/

class Emp {
    private int id;
    private String name;
    private double sal;

    public Emp(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}


