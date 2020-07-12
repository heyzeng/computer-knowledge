package com.java4;

/*

        构造器（构造方法） ：

        作用：1.创建对象     2.给对象进行初始化

        格式：
        权限修饰符    类名(形参列表){

        }

        说明：
        1.创建对象必调构造器
        2.如果一个类中没有显示的声明构造器，那么系统会默认帮我们创建一个空参的构造器
        3.如果一个类中显示的定义了构造器，那么系统将不会再默认帮我们添加空参的构造器
        4.构造器可以有多个但是彼此之间必须构成重载
        */
public class ContractorTest {

    public static void main(String[] args) {

		/*
		 	通过构造器给对象进行初始化的特点？
		 	1.通过构造器给对象进行初始化只能初始化一次。
		 	2.通过构造器给属性初始化比较方法。
		 */
        Computer cp = new Computer();
        cp.name = "拯救者";
        cp.type = "y600";
        cp.info();

        /*
         * 思考：即然可以通过构造器给属性进行初始化，还有必要提供set/get方法吗？
         * 有必要，因类通过构造器进行初始化只能初始化一次。如果需要对属性进行修改还是需要set/get方法。
         */
        Computer computer = new Computer("拯救者", "y700");
        computer.info();

    }
}


class Computer {

    String name;
    String type;

    //构造器是在创建对象的时候进行调用的且只能调用一次。
    public Computer() {
        System.out.println("computer()");
    }

    public void setName(String n) {
        //使用场景 ： 1.给对象进初始化    2.如果某个变量只需要初始化一次或者某些代码只需要执行一次那么可以考虑放在构造器中。
    }

    //构造器 - 思考 ：如何调用构造器？
    public Computer(String name) {
        System.out.println("computer(name)" + name);
    }

    //构造器可以有多个但是彼此之间必须构成重载
    public Computer(String n, String t) {
        name = n;
        type = t;
    }

    public void info() {
        System.out.println(name + " " + type);
    }

    public void say() {
        System.out.println("aaaa");
    }

    public void say(String name) {

    }

}
