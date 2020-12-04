package practice;

/**
 * Author:Jude
 * Date:2020-12-04 上午9:59
 */
public class Homework04 {

    public static void main(String[] args) {

        Person person = new Person("JIM", 10);
        Person person1 = new Person("JIM",10);

        System.out.println(person.toCompare(person1));
    }


}

class Person{

    int age;
    String name;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public boolean toCompare(Person p){
        return this.name.equals(p.name) && this.age == p.age;
    }
}
