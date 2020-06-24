package com.exer;

import java.util.Scanner;

/*
 * 练习三
 保存五个通过键盘或命令行输入的数字
 */
public class Demo04 {
    public static void main(String[] args) {

        //设定数组长度
        int[] num = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            int s = scanner.nextInt();
            num[i] = s;
        }

        for (int i = 0; i < num.length; i++) {

            System.out.println(num[i] + " ");


        }


    }
}
