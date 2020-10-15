package practice02;


public class ArithmeticOperator {
    public static void main(String[] args) {

        //1.  整数相除 得到 整数部分，小数部分会去掉
        //2. 如果我们希望保留小数，部分，需要运算的数有小数即可
        System.out.println(10 / 4); //2
        System.out.println(10.0 / 4); //2.5

        // a%b = a - a/b*b
        System.out.println(10 % 3); // 1
        System.out.println(10 % -3); // 1
        System.out.println(-10 % -3); // -1
        System.out.println(-10 % 3 ); // -1


        //++ 的使用
        //使用方式分为两大类
        //第一类是独立使用 , ++n 和  n++ 完全等价
        int num = 8;
        ++num;
        num++;
        System.out.println("num = " + num);

        //第二类使用, 表达式
        int n = 10;
        int total = n++; // total  = a ; a = a +1
        System.out.println(total + " " + n); // 10 11
        int m = 10;
        int total_ = ++m; // m = m+1 total_=m
        System.out.println(total_ + " " + m); // 11 11


    }
}
