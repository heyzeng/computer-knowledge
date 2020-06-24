import java.util.Scanner;

;

/*
        编写程序：由键盘输入三个整数分别存入变量num1、num2、num3，
        对它们进行排序(使用 if-else if-else),并且从小到大输出。

        */
public class caseThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 >= num2){
            if (num3 >= num1){
                System.out.println("num3=" + num3 + ",num1=" + num1 + ",num2=" + num2 );
            } else if (num1 >= num3) {
                System.out.println("num1=" + num1 + ",num2=" + num2 + ",num3=" + num3);
            }else {
                System.out.println("num1=" + num1 + ",num3=" + num3 + ",num2=" + num2);
            }
        } else {//num1 <= num2
            if (num3 >= num2) {
                System.out.println("num1=" + num1 + ",num2=" + num2 + ",num3=" + num3);
            } else if (num3 <= num1){
                System.out.println("num3=" + num3 + ",num1=" + num1 + ",num2=" + num2 );
            }else {
                System.out.println("num1=" + num1 + ",num3=" + num3 + ",num2=" + num2);
            }

        }
    }
}
