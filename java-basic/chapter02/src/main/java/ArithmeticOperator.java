
//演示算术运算符的使用
public class ArithmeticOperator
{
    public static void main(String[] args) {

        //演示 / 使用
        //说明
        //1.  整数相除 得到 整数部分，小数部分会去掉
        //2. 如果我们希望保留小数，部分，需要运算的数有小数即可
        System.out.println(10 / 4); //2
        System.out.println(10.0 / 4); // 2.5

        //演示 % 使用
        //说明
        //1. a % b = a - a/b * b
        System.out.println(10 % 3); //  ==>  10 - 10 / 3 * 3  = 10 - 9 = 1
        System.out.println(-10 % 3); // ==>  -10 - (-10) / 3 * 3 = -10 + 9 = -1
        System.out.println(-10 % -3); // ==>  -10 - (-10) / (-3) * (-3) = -10 +9 = -1
        System.out.println(10 % -3); // ==>  10 - 10 / (-3) * (-3) = 10 - 9 = 1

        //++ 的使用
        //使用方式分为两大类

        //第一类是独立使用 , ++n 和  n++ 完全等价

        int num = 8;
        num++; //==> num = num + 1;
        ++num; //==> num = num + 1;
        System.out.println("num=" + num); // 10


        //第二类使用, 表达式
        int a = 10;
        int total = a++; //等价 int total = a; a = a+1;
        System.out.println("total=" + total + ", a=" + a);// 10, 11
        int b = 20;
        int total2 = ++b; //等价 b = b + 1; int total2 = b;
        System.out.println("total2=" + total2 + ", b=" + b);//21, b = 21

    }
}
