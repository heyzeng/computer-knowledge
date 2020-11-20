package practice;


public class ConDetail {

    public static void main(String[] args) {

//        new Dog("Tom");
//        new Person();

    }

}


//如果程序员没有定义构造方法，系统会自动给类生成一个默认无参构造方法(也叫默认构造方法)，
//比如 Person (){}
class Person{

    //默认的一个无参构造器

    //一旦定义了自己的构造方法,默认的构造方法就覆盖了，
    //就不能再使用默认的无参构造方法，除非显示的定义一下
    public Person(String name){

    }

    public Person(){}
}

class Dog{
    //一个类可以定义多个不同的构造方法，构造方法重载
    String name;
    int age;

    //第1个构造器
    public Dog(String dbname){
        System.out.println("ok");
        name = dbname;
    }

    //第2个构造器
    public Dog(String dbname, int age){
        name = dbname;
        age = age;
    }
}