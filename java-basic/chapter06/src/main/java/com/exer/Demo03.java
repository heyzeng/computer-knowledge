package com.exer;

/*
 练习二
创建一个char类型的36个元素的数组，前26个元素放置'A'-'Z‘,   后10个元素放置'0'-'9‘。
使用for循环访问所有元素并打印出来。
 */
public class Demo03 {
    public static void main(String[] args) {

        char[] chars = new char[36];
        char ch = 'A';
        char ch2 = '0';


        for (int i = 0; i < chars.length ; i++) {

            if (i <=25){
                chars[i] = ch;
                ch = (char)(ch + 1);
            }else {
                chars[i] = ch2;
                ch2 = (char)(ch2 + 1);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }


    }
}
