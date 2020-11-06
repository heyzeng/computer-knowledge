package practice04;


import java.util.Scanner;

public class Exam02 {

    public static void main(String[] args) {

        //如果是星期一到星期三，打印：AAA，星期四到星期五，打印：BBB，
        //星期六到星期日，打印CCC =>程序员
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter week?");
        String week = scanner.next();


        if ("Monday".equals(week) || "Tuesday".equals(week) || "wednesday".equals(week)){
            System.out.println("AAA");
        }else if ("Thursday".equals(week) || "Friday".equals(week)){
            System.out.println("BBB");
        }else if ("saturday".equals(week) || "sunday".equals(week)){
            System.out.println("CCC");
        } else {
            System.out.println("The programmer");
        }
    }
}
