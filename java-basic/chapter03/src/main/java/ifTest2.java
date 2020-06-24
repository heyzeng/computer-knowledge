

import java.util.Scanner;

public class ifTest2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入小鹏成绩");

        int score = scanner.nextInt();

        if (score == 100){
            System.out.println("宝马");
        } else if ( score >80 && score <= 99){
            System.out.println("iphone11");
        }else  {
            System.out.println("打一顿");
        }

        System.out.println("结束");
    }
}
