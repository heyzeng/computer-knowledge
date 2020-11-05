package practice03;

public class IfExer {

    public static void main(String[] args) {


        /*
		编写程序，声明2个int型变量并赋值。判断两数之和，如果大于等于50，打印“hello world!”
		*/
        int n1 = 11;
        int n2 = 50;
        if ((n1 + n2) >= 50) {
            System.out.println("hello world");
        }


        /*
		编写程序，声明2个double型变量并赋值。判断第一个数大于10.0，且第2个数小于20.0，打印两数之和
		*/
        double m1 = 11.0;
        double m2 = 12.1;

        if (m1 > 10.0 & m2 < 20.0) {
            System.out.println(m1 + m2);
        }


		/*
		定义两个变量int，判断二者的和，是否能被3又能被5整除，打印提示信息

		*/

        int a1 = 10;
        int a2 = 5;

        if ((a1 + a2 ) % 3 ==0 && (a1 + a2 ) % 5 ==0){
            System.out.println("是否能被3又能被5整除");
        }else {
            System.out.println("no");
        }


		/*
		判断一个年份是否是闰年，闰年的条件是符合下面二者之一：
		(1)年份能被4整除，但不能被100整除；(2)能被400整除
		 */

        int years = 2000;
        if ((years % 4 == 0 && years % 100 != 0) || years % 400 == 0){
            System.out.println("闰年");
        } else {
            System.out.println("是平年");
        }
    }
}
