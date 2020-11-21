package practice;


public class ConTest {

    public static void main(String[] args) {

        Person11 person11 = new Person11("TOM",11);
        System.out.println(person11.age + " " + person11.name);

        //传统写法
//        Person11 person111 = new Person11();
//        person111.name = "T";
//        person111.age = 111;

    }
}

class Person11{

    String name;
    int age;

    //构造器
    public Person11(String pName, int pAge){
        System.out.println("构造器被调用");
        age = pAge;
        name = pName;

    }

}