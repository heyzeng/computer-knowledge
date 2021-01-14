package com.final_;

/**
 * Author:ZJF
 * Date:2021-01-14 上午8:37
 */
public class FinalDetail {
}

//final 和 static 往往搭配使用，效率更高，底层编译器做了优化处理
class EE {
    static {
        System.out.println("EE 的静态代码块被调用 ");
    }
    public final  static int stuTotal = 360;

    public void f1() {
        //当final修饰局部变量，我们称为局部常量，可在声明时赋初值，也可以在它使用前赋值，赋初值不能再修改了
        final int num ;
        num = 6;

        System.out.println(num);
    }
}

//如果类不是final类，但是含有final方法，则该方法虽然不能重写，但是可以被继承。
class CC {
    public final void hi() {
        System.out.println("hi");
    }
}

class DD extends CC {

}

//final 不能继承，但是可以实例化
final class  BB {

}

class AA {
    /*
     * ① 定义时：如 public final double TAX_RATE=0.08;
     * ② 在构造器中
     * ③ 在代码块中。
     * final 不能修改.
     */
    private final int NUM /*= 10*/;

    //如果final修饰的属性是静态的，则初始化的位置只能是 ① 定义时  ② 在静态代码块 不能在构造器中赋值

    private final static String name /*= "tom" */;

    static {
        name = "jack";
    }

    {
        NUM = 40;
    }
    public AA() {
        //NUM = 30;
    }
}
