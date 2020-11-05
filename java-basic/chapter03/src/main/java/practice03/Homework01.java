package practice03;



public class Homework01 {

    public static void main(String[] args) {


		/*
		定义两个变量，分别保存键盘输入的两个整数【键盘输入可选，如果不用输入，可以直接用变量保存】

		示例效果如下：


		请输入第一个整数：10
		请输入第二个整数：5

		*************************************

				小小计算器


		*************************************


		10 + 5 =15

		10 - 5 = 5

		10 * 5 = 50

		10 / 5 = 2

		*/

        int a = 10;
        int b = 5;

        System.out.println("*************************************\n\n");
        System.out.println("\t\t小小计算器\n\n");
        System.out.println("*************************************");

        System.out.printf("%d + %d",a,b);
        System.out.printf("%d - %d",a,b);
        System.out.printf("%d * %d",a,b);
        System.out.printf("%d / %d",a,b);

    }
}
