package com.example;


public class arrayTest04 {
    public static void main(String[] args) {

        //1.二数数组的声明和初始化
        int[][] numbers;
        String names[][]; //不建议使用
        String[] persons[];//不建议使用

        //静态初始化
        persons = new String[][]{{"小苍苍","110"},{"小饭饭","100"},{"小泷泷","211"}};
        //下面的声明和初始化不能分开进行
        String[][] students = {{"小龙哥","985"},{"小帅帅","211"}};
        //动态初始化
		/*
		persons = new String[2][3];//2指的是二维数组的长度。3指的是二维数组元素（一维数组）的长度。

		names = new String[3][];//只是指明了二维数组的长度
		names[0] = new String[2];
		names[1] = new String[3];
		names[2] = new String[2];
		*/


        //2.获取二维数组元素的元素
        System.out.println(persons[1][0]);
        System.out.println(persons[2][0]);
        //赋值
        persons[2][1] = "911";
        System.out.println(persons[2][1]);


        //3.二维数组的属性 ：length
        System.out.println(persons.length);//二维数组的长度
        System.out.println(persons[0].length); //获取二维数组元素的长度

        System.out.println("--------------------------------------------------------");

        //4.遍历二维数组中的元素
		/*
		for (int i = 0; i < persons.length; i++) {
			//获取二维数组的元素（一维数组）
			String[] person = persons[i];
			//对二维数组的元素（一维数组进行遍历）
			for (int j = 0; j < person.length; j++) {
				System.out.println(person[j]);
			}
		}
		*/

        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons[i].length; j++) {
                System.out.println(persons[i][j]);
            }
        }

        //5.二维数组元素的默认值 ：null
        // 二维数组元素（一维数组）的元素的默认值和一维数组元素的默认值相同


        //6.二维数组的内存解析  详见MoreArrayTest2.java
    }
}
