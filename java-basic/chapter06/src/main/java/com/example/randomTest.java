package com.example;


public class randomTest {
    public static void main(String[] args) {
        //获取随机数
        for (int i = 0; i < 100; i++) {
            //获取随机数(范围 [0.0,1.0)) - （整数)
            int random = (int)(Math.random() * 90)+  10;
            //需求 ：随机获取 10 - 99
            System.out.println(random);
        }
    }
}
