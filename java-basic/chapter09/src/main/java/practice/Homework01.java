package practice;

/**
 * Author:Jude
 * Date:2020-12-01 上午10:02
 */
public class Homework01 {

    public static void main(String[] args) {

        Homework01 homework01 = new Homework01();
        System.out.println(homework01.max(1.0, 3.1, 0.1));
    }

    //使用方法重载实现求三个double数的最大值
    public double max(double a, double b, double c) {
        return (a > b ? a : b) > c ? (a > b ? a : b) : c;
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }
}


