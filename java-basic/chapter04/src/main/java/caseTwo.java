/*

3)  求ax2+bx+c=0方程的根。a,b,c分别为函数的参数，如果：b2-4ac>0，
则有两个解；b2-4ac=0，则有一个解；b2-4ac<0，则无解；
提示1：x1=(-b+Math.sqrt (b2-4ac))/2a
               X2=(-b-Math.sqrt(b2-4ac))/2a
提示2：Math.sqrt(num);求num的平方根

*/

import java.util.Scanner;

public class caseTwo{

    public static void main(String[] args){
		/*
		//Math.sqrt ：开方
		double number = Math.sqrt(4);

		System.out.println(number);
		*/

        Scanner s = new Scanner(System.in);
        System.out.println("请输入a的值");
        int a = s.nextInt();
        System.out.println("请输入b的值");
        int b = s.nextInt();
        System.out.println("请输入c的值");
        int c = s.nextInt();

        //计算
        //判断是否有解
        if(b * b - 4 * a * c > 0){ //有两个根
            //计算两个根
            //x1=(-b+Math.sqrt (b2-4ac))/2a
            //X2=(-b-Math.sqrt(b2-4ac))/2a

            int num1 = (-b + (int)(Math.sqrt(b * b - 4 * a * c))) / (2 * a);
            int num2 = (-b - (int)(Math.sqrt(b * b - 4 * a * c))) / (2 * a);


        }else if(b * b - 4 * a * c == 0){//有一个根

        }else{//无解
            System.out.println("无解1`");

        }
    }
}