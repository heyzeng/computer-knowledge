package com.exer2;

/*
    冒泡排序
 */
public class bubbleSort {
    public static void main(String[] args) {

        int[] number = {10 , 11 , 99 , 56} ;

        for (int i = 0; i < number.length - 1; i++) {

            for (int j = 0; j < number.length - 1 - i; j++) {

                if (number[j] > number[j + 1]){
                    //定义临时数组
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;

                }
            }
        }

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
