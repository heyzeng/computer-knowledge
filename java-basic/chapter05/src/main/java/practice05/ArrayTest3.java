package practice05;


import java.util.Scanner;

public class ArrayTest3 {

    public static void main(String[] args) {


        //循环输入5个成绩，保存到double数组,并输出
        //1. 定义一个 可以存放5个double 数组
        //double[] arr = new double[5]; // 0.0


        double[] scores = new double[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {

            double score = scanner.nextDouble();

            scores[i] = score;
        }

        for (int i = 0; i < scores.length; i++) {

            System.out.println(scores[i]);
        }

    }
}
