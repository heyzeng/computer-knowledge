package com.exer;

/*
 * 2.编写程序，定义三个重载方法并调用。方法名为mOL。
 * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。 在主类的main
 * ()方法中分别用参数区别调用三个方法。
 *
 * 3.定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方法求两个double值中的最大值，
 * 第三个方法求三个double值中的最大值，并分别调用三个方法。
 *
 */
public class Demo {
    public static void main(String[] args) {

        DemoNumber demoNumber = new DemoNumber();
        double max = demoNumber.max(1, 2);
        System.out.println(max);

        System.out.println("--------");

        double max1 = demoNumber.max(1, 4, 4);
        System.out.println(max1);

    }

}

class DemoNumber{
    public double max(double a,double b){
        return (a > b) ? a:b;
    }
    public double max(double a,double b,double c){
        double MaxNumber = max(a, b);
        return (MaxNumber > c) ? a:b;
    }

}
