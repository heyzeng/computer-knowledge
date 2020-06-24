package java2;

/*

  一面向对象学习的三条主线
	1.java类及类的成员 ：属性，方法，构造器，代码块，内部类
	2.面向对象的三大特征 ：封装性，继承性，多态性
	3.其它关键字 ：this,super,interface,final,static.......

 二面向对象与面向过程
	1.面向对象是相对于面向过程而言的。面向过程，强调的是功能行为。
	2.面向对象，将功能封装进对象，强调具备了功能的对象


三 类(class)和对象(object)是面向对象的核心概念。
	1.类是对一类事物的描述，是抽象的、概念上的定义（汽车设计图）
	2.对象是实际存在的该类事物的每个个体，因而也称实例(instance)。（具体的汽车）
			对象是由类派生出来的（new 出来的）

四 类的成员 ：属性和方法
	属性  = field = 成员变量
	方法（功能行为）  = method = 成员方法 = 函数

五 ：面向对象的落地实现
	1.创建一个类并提供必要的属性和方法
	2.通过类创建（new,派生）对象
	3.通过对象名调用属性和方法
			给对象的属性赋值 ： 对象名.属性名 = 变量值
			调用方法 ：对象名.方法名

  说明：
  	1.同一个类的多个对象，每个对象独自拥有一份属性。修改了a对象中的属性，并不会影响到b对象中的属性
 */
public class oop {
    public static void main(String[] args) {

        Person person = new Person();
        person.age = 10;
        person.name = "Jude";

        person.eat();
        person.say();
        person.show();


    }
}


class  Person{

    //属性
    String name;
    int age;
//	int sex;
//	String address;

    public void show(){
        System.out.println("show===" + name + " " + age);
    }


    //方法
    public void say(){
        System.out.println(name + "我就是这么帅");
    }

    public void eat(){
        System.out.println("我喜欢吃鱼");
    }
}