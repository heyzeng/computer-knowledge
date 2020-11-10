package com.practice;


public class WhyMethod {

    public static void main(String[] args) {


        int[] arr1 = {1,3,4,65,1};

        MyTool myTool = new MyTool();
        myTool.printArr(arr1);

        int[] arr2 = {1, 2, 50, 900, 900, -12, 10000};

        myTool.printArr(arr2);

        int[] arr3 = {1, 2, 50, 900, 900};

        myTool.printArr(arr3);


    }
}

class MyTool{

    public void printArr(int[] arr){// 方法

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
