package com.practice;

public class BubbleSort {

    // 冒泡排序
    public static void main(String[] args) {

        int[] arr = {7,4,8,6}; // 内部确实交换三次
        int temp = 0;

        for (int i = 0; i < arr.length -1   ; i++) { // 外层控制行 0 1 2

            for (int j = 0; j < arr.length  -1 - i; j++) {

                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr [j + 1] = temp;
                }
            }

        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}
