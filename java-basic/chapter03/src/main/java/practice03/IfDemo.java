package practice03;


import java.util.Scanner;

public class IfDemo {

    public static void main(String[] args) {

        /*
			编写一个程序,可以输入人的年龄,如果该同志的年龄大于18岁,则输出 “你年龄大于18,要
			对自己的行为负责!”
			*/
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 18){
            System.out.println("你年龄大于18,要\n" +
                    "\t\t\t对自己的行为负责!");
        } else {
            System.out.println("no");
        }
    }
}
