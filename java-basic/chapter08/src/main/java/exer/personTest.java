package exer;

/*
 * 要求：(1)创建Person类的对象，设置该对象的name、age和sex属性，调用study方法，
 * 输出字符串“studying”，调用showAge()方法显示age值，调用addAge()方法给对象的age属性值增加2岁。
(2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
*/
public class personTest {

    public static void main(String[] args) {

        Person person = new Person();
        person.age = 10;
        person.sex = "男";
        person.name = "Jude";

        person.study();
        person.showAge();
//        int age = person.addAge();
//        System.out.println(age);
        int i = person.addAge(2);
        System.out.println(i);


    }
}

class Person{

    String name;
    String sex;
    int age;

    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println(age);
    }

    public int addAge(){
        age += 2;
        return age;
    }
    public int addAge(int i){ //i的值可变
        age +=i;
        return age;
    }
}