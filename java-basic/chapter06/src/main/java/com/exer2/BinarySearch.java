package com.exer2;
/*
    二分查找
 */
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] number = { 12, 30, -5, 6, 9, 10, 5 };
        Arrays.sort(number);//二分查找先排序

        //遍历
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

        //定义变量
        int findNumber = 12;
        int start = 0;
        int end = number.length -1;

        //二分查找
        while (start <= end){
            int mid = (start + end) / 2;
            if (findNumber == number[mid]){
                System.out.print("元素位置 " + mid);
                break;
            }else if (findNumber > number[mid]){
                start = mid +1;
            }else {
                end = mid -1;
            }
        }


    }
}
