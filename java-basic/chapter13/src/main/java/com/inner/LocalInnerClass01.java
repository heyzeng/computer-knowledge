package com.inner;

/**
 * Author:ZJF
 * Date:2021-01-20 上午9:52
 */
public class LocalInnerClass01 {
    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.say();

        System.out.println(outer.hashCode());
    }
}

interface Aa {

}

class Outer{
    private int n1 = 11;
    private static String name = "张三";
    private int n2 = 50;

    private void hi() {
        System.out.println("hi");
    }

    class TT {

    }

    public void say(){
        int n3 = 13; //n3默认是final

        //不能添加访问修饰符,因为它的地位就是一个局部变量。局部变量是不能使用修饰符的。但是可以使用final 修饰，
        //因为局部变量也可以使用final
        class LocalInner01{
            int n2 = 12;
            public void hi(){

                System.out.println("hi");

                //可以直接访问外部类的所有成员，包含私有的
                System.out.println("n1 =" + n1 + " n2=" + n2 + "n3=" + n3);

                //如果外部类和内部类的成员重名时，内部类访问的话，默认遵循就近原则，如果想访问外部类的成员，则可以使用 （外部类名.this.成员）
                System.out.println(Outer.this.n2 + " " + Outer.this.hashCode());
            }
        }

        LocalInner01 localInner01 = new LocalInner01();
        localInner01.hi();
    }

}
