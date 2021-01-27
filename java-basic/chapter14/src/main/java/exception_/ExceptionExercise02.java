package exception_;

import java.util.Scanner;

/**
 * Author:ZJF
 * Date:2021-01-27 上午8:37
 */
public class ExceptionExercise02 {
    public static void main(String[] args) {
        /*
         * 如果用户输入的不是一个整数，就提示他反复输入，
         * 直到输入一个整数为止

         */
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("please input");
                int i = scanner.nextInt();
                System.out.println(i);
                break;
            } catch (Exception e) {
                System.out.println("not int");
                scanner.next();//清除一下可能字符
            }
        }
    }
}
