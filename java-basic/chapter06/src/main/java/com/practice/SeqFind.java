package com.practice;

import java.util.Scanner;

// 顺序查找
public class SeqFind {

    public static void main(String[] args) {

        /*
			有一个数列/数组：白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王
	      猜数游戏：从键盘中任意输入一个名称，判断数列中是否包含此名称【顺序查找】
		  要求: 如果找到了，就提示找到，并给出下标值
		*/

        Scanner scanner = new Scanner(System.in);
        String[] hero = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王", "金毛狮王", "金毛狮王"};
        System.out.println("输入名字");
        String findName = scanner.next();

        int index = -1;

        for (int i = 0; i < hero.length; i++) {



            if (findName.equals(hero[i])){
                index = i;
                break;
            }
        }


        if (index != -1){
            System.out.println("找到了"+ index);
        }else {
            System.out.println("没有找到");
        }


    }
}
