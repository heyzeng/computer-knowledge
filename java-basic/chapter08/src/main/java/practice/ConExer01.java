package practice;


public class ConExer01 {

    public static void main(String[] args) {

        Person01 person01 = new Person01();
        Person01 person02 = new Person01("TOM", 19);

        System.out.println(person01.age + " " +person01.name);
        System.out.println(person02.age + " " +person02.name);
    }

}

/*
在前面定义的Person类中添加两个构造器：
第一个无参构造器：利用构造器设置所有人的age属性初始值都为18
第二个带pName和pAge两个参数的构造器：
使得每次创建Person对象的同时初始化对象的age属性值和name属性值。
分别使用不同的构造器，创建对象.

*/
class Person01{

    int age;
    String name;

    //第一个构造器
    public Person01(){
        age = 18;
    }

    //第二个构造器
    public Person01(String pName,int pAge){
        age = pAge;
        name = pName;
    }

}