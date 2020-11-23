package practice;

/**
 * Author:Jude
 * Date:2020-11-21 11:31 下午
 */
public class OverLoadExer01 {

    public static void main(String[] args) {

        MethodUtils methodUtils = new MethodUtils();
        System.out.println(methodUtils.max(2,3));
        System.out.println(methodUtils.max(2.1,2.5));
        System.out.println(methodUtils.max(2.1,4,8.1));
    }
}

//还在MethodUtils类，定义三个重载方法max()，
//第一个方法，返回两个int值中的最大值，
//第二个方法，返回两个double值中的最大值，
//第三个方法，返回三个double值中的最大值，并分别调用三个方法。

class MethodUtils{

    public int max(int a, int b){
        return a > b ? a :b;
    }

    public double max (double a,double b){
        return a > b ? a : b;
    }

    public double max(double a,double b, double c){
        return (a > b ? a : b) > c ? (a > b ? a : b) : c;
    }
}

