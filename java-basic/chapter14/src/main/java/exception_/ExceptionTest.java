package exception_;

import java.util.Scanner;

/**
 * Author:Jude
 * Date:2020-12-26 上午11:04
 * 提示输入整数为止
 */
public class ExceptionTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int parseInt = 0;
        while (true) {

            try {
                System.out.println("请输入一个整数");
                String a = scanner.next();
                parseInt = Integer.parseInt(a);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                continue;
            }

        }
    }
}
