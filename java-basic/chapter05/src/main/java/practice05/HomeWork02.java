package practice05;

import java.util.Scanner;


public class HomeWork02 {

    public static void main(String[] args) {

        /*
		------------------------------小小计算器-------------------------

		1.加法
		2.减法
		3.乘法
		4.除法
		0.退出
		请选择：1

		思路
		1. 从界面分析，我们发现菜单是反复的显示，是循环 do..while
		2. 在判断选择时，选择只有 5种， 使用 switch

		化繁为简 , 程序员思维方式
		1. 显示菜单
		2. 接收用户的输入，并判断用户想干什么 char choice , 扫描器
		3. 完成 各种运算
		*/

        Scanner scanner = new Scanner(System.in);
        char choice = ' ';

        int a = 10;
        int b = 20;


        do {

            System.out.println("------------------------------小小计算器-------------------------");
            System.out.println("\t\t1.加法");
            System.out.println("\t\t2.减法");
            System.out.println("\t\t3.乘法");
            System.out.println("\t\t4.除法");
            System.out.println("\t\t0.退出");
            System.out.println("\t\t请选择：");

            choice = scanner.next().charAt(0);

            switch (choice){
                case '1':
                    System.out.printf("%d + %d = %d",a,b,a + b);
                    break;
                case '2':
                    System.out.printf("%d - %d = %d",a,b,a -b);
                    break;
                case '3':
                    System.out.printf("%d * %d = a*b",a,b,a * b);
                    break;
                case '4':
                    System.out.printf("%d / %d = a/b",a,b,a/b);
                    break;
                case '0':
                    System.out.print("退出");
                    break;

            }


        }while (choice != '0');
    }
}
