package com.java4;

/*

 	面向对象特性之 ：封装性

 	为什么要使用封装性？
 		当我们创建对象以后。可以通过对象名.属性名进行赋值。这种方式只能对属性的类型和范围进行限制。往往我们可能
 		还需要更多约束条件，而这些约束条件是无法在属性的声明处加以限制的。所以我们采取如下方式
 		1.使用private修饰属性。该属性就不能在其它的地方被任意调用了。
 		2.提供公共的方法。用来对属性进行赋值和获取属性的值。在方法中可以进行条件限制。


 	封装性(狭义上):
	 	1.私有化属性
	 	2.提供公共的set/get方法	（set/get方法只是一个普通的方法。如果开心可以叫  a,b,c方法都可以）

	 封装性（广义上）
	 	1.四种权限修饰符 ：public protected 缺省的  private
	 	2.类只能被public和缺省的所修饰
	 	3.类的成员：方法，属性，内部类，构造器可以被四种权限修饰符修饰。

 */
public class AnimalTest {
    public static void main(String[] args) {


        Animal animal = new Animal();
        animal.setLegs(9);
        animal.info();
        System.out.println(animal.getLegs());
    }
}

class Animal{

    //1.将属性私有化防止该类中的属性在其它的地方被调用
    private String name;
    private int age;
    private  int legs;

    //给name属性赋值
    public void setName(String n) {
        this.name = n;
    }

    //获取name属性的值
    public String getName() {
        return name;
    }

    public void setAge(int a) {

        if (a >= 0) {
            this.age = a;
        } else {
            //如果不符合我们的条件采取的方式有   1.直接给原属性赋默认值    2.直接抛出异常
            System.out.println("哥们你是火星上来的吧");
        }

    }

    public int getAge() {
        return age;
    }
    //2.提供一个公共的方法用来给属性赋值
    public void setLegs(int l) {
        //校验
        if (l % 2 == 0) {
            legs = l;
        } else {
            legs = 4;
            System.out.println("哥们你眼瞎啊");
        }
    }
    /*
     * 我们约定俗成的 将给属性设置值的方法叫做 setXxx  获取属性值的方法叫做getXxx
     */

    public int getLegs() {
        return legs;
    }

    public void info() {
        System.out.println(name + " age=" + age + " legs=" + legs);
    }
}
