package practice03;


import java.util.Scanner;

public class IfExer2 {

    public static void main(String[] args) {


		/*
		岳小鹏参加Java考试，他和父亲岳不群达成承诺：
		如果：
		成绩为100分时，奖励一辆BMW；
		成绩为(80，99]时，奖励一台iphone7plus；
		当成绩为[60,80]时，奖励一个 iPad；
		其它时，什么奖励也没有。
		请从键盘输入岳小鹏的期末成绩，并加以判断
		 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩");
        int score = scanner.nextInt();


        if (score == 100) {
            System.out.println("成绩为100分时，奖励一辆BMW；");
        } else if (score > 80 & score <= 99){
            System.out.println("成绩为(80，99]时，奖励一台iphone7plus");
        } else if (score >= 60 & score <=80){
            System.out.println("当成绩为[60,80]时，奖励一个 iPad");
        } else {
            System.out.println("其它时，什么奖励也没有。");
        }
    }
}
