package com.practice;


public class MultiArray {

    public static void main(String[] args) {

        int[][] arr = new int[3][6];

        arr[1][2] = 1;
        arr[1][3] = 2;


        //遍历二维数组
        //说明

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
}
