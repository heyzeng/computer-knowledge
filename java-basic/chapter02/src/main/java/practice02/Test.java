package practice02;


import jdk.nashorn.internal.ir.CallNode;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /**
         * 定义两个变量，分别保存键盘输入的两个整数【键盘输入可选，如果不用输入，可以直接用变量保存】
         *
         * 示例效果如下：
         *
         *
         * 请输入第一个整数：10
         * 请输入第二个整数：5
         *
         * *************************************
         *
         * 	    小小计算器
         *
         *
         * *************************************
         *
         *
         * 10 + 5 =15
         *
         * 10 - 5 = 5
         *
         * 10 * 5 = 50
         *
         * 10 / 5 = 2
         */
        int m = 10;
        int n = 5;
        //Scanner m = new Scanner(System.in);
        //Scanner n = new Scanner(System.in);

        System.out.println("*************************************\n");
        System.out.println("             小小计算器                 \n");
        System.out.println("*************************************");

        System.out.printf("%d + %d = %d\n",m,n,(m+n) );
        System.out.printf("%d - %d = %d\n",m,n,(m-n));
        System.out.printf("%d * %d = %d\n",m,n,(m*n));
        System.out.printf("%d / %d = %d",m,n,(m/n));
    }
}
