package com.practice;


public class BinaryFind {

    public static void main(String[] args) {


        int[] num = {1,2,4,5,8,10};

        int findNum = 5;
        int leftIndex = 0;
        int rightIndex = num.length - 1;
        int findIndex = -1;

        while (rightIndex >= leftIndex){ //循环条件

            int midIndex = (leftIndex + rightIndex) / 2;
            int numMid = num[midIndex];

            if (findNum == numMid){
                findIndex = midIndex;
                break;
            } else if (numMid > findNum){ //左边迭代
                rightIndex = midIndex - 1;

            }else {
                leftIndex = midIndex + 1;
            }

        }

        if (findIndex != -1 ){
            System.out.println("找到 index = " + findIndex);
        }else {
            System.out.println("没有找到");
        }



    }
}
