package com.java;

/*

 	对象数组 ：

 		1.数组的类型是引用数据类型
 		2.数组中存放的是对象（对象的地址值）
 		3.一定要注意数组的元素中存放的地址值是同一个对象，还是多个对象。

 */
public class ObjectArray {
    public static void main(String[] args) {

        Person[] people = new Person[5];

        for (int i = 0; i < people.length; i++) {
            Person s = new Person();
            s.age = 10;
            s.name = "Jude";
            people[i] = s;
        }

        people[0].age = 100;
      //遍历数组中所有的对象，并输出对象的属性值
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].age + " " + people[i].name);
        }


    }

    public void test2(){

    }
    public void test() {
        //该数组中存放的元素是Person类型的对象
        //引用数据类型的默认值为null
        Person[] ps = new Person[5];

        //往数组中存放对象
        Person person = new Person();
        person.name = "小龙哥";
        person.age = 16;
        ps[0] = person;//将对象放入到了数组中


        Person person2 = new Person();
        person2.name = "小苍姐";
        person2.age = 18;
        ps[1] = person2;

        //需求 ：修改数组索引为0的元素的对象中的age属性
        //		Person p = ps[0];
//		p.age = 20;
        ps[0].age = 20;

        for (int i = 0; i < 2; i++) {
            Person per = ps[i];
            System.out.println(per.name + "  " + per.age);
        }
    }
}

class Person{
    String name;
    int age;
}