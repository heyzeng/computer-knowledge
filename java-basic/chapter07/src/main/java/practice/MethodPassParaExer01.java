package practice;

//基本数据类型传递
public class MethodPassParaExer01 {

    public static void main(String[] args) {

        T5 t5 = new T5();
        Person person = new Person();

        person.name = "Tom";
        person.age =10;

//        t5.m1(person);  //Tom  10
        t5.m2(person); // Tom 20
//        t5.m3(person); //Tom 10 ????

        System.out.println(person.name + " "+person.age); // Tom 10


    }
}

class Person{

    String name;
    int age;
}

class T5{

    public void m1(Person person){

        person = new Person();
        person.age =100;

    }

    public void m2(Person person){

        person.age = 20;
    }

    public void m3(Person person){

        person = null;

    }

}
