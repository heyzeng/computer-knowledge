package com.exer;

import java.util.Scanner;

/*
1. 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
成绩>=最高分-10    等级为’A’
成绩>=最高分-20    等级为’B’
成绩>=最高分-30    等级为’C’
其余              等级为’D’

提示：先读入学生人数，根据人数创建int数组，存放学生成绩。

 */
public class ScoreTest {
    public static void main(String[] args) {
        //输入学生人数
        Scanner s = new Scanner(System.in);
        int studentNumber = s.nextInt();

        //  创建数组
        int[] studentScore = new int[studentNumber];

        //录入学生成绩
        System.err.println("请输入" + studentNumber + "成绩");
        for (int i = 0; i < studentScore.length; i++) {
            //把学生成绩录入数组中
            studentScore[i] = s.nextInt();
        }

        //查找学生最高分
        int maxScore = 0;
        for (int i = 0; i < studentScore.length; i++) {
            if (maxScore < studentScore[i]) {
                maxScore = studentScore[i];
            }
        }
            System.err.println("最高分为:" + maxScore);

            // //5.分等级
            //		/*
            //		 成绩>=最高分-10    等级为’A’
            //		成绩>=最高分-20    等级为’B’
            //		成绩>=最高分-30    等级为’C’
            //		其余                            等级为’D’
            //
            for (int i = 0; i < studentScore.length; i++) {
                int score = studentScore[i];
                if (score >= maxScore - 10) {
                    System.err.println("A");
                } else if (score >= maxScore - 20) {
                    System.err.println("B");
                } else if (score >= maxScore - 30) {
                    System.err.println("C");
                } else {
                    System.err.println("D");
                }

            }

        }

    }
