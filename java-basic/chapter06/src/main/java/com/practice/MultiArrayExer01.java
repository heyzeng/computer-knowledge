package com.practice;


public class MultiArrayExer01 {

    public static void main(String[] args) {


        //解读
        //1. x表示一个一维数组
        //2. y表示二维数组
        int[] x, y[]; //


        //知识点
        //一维数组：int[] x  或者int x[]
        //二维数组： int[][] y 或者  int[] y[]  或者 int  y[][]

        /*
        int arr[][]={{4,6},{1,4,5,7},{-2}};
        遍历该二维数组
                */

        int arr[][]={{4,6},{1,4,5,7},{-2}};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }



}
