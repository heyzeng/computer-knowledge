package practice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author:ZJF
 * Date:2020-12-16 上午9:12
 * 请编写一个猜拳的游戏
 * 有个人 Tom，设计他的成员变量. 成员方法, 可以电脑猜拳. 电脑每次都会随机生成 0, 1, 2
 * 0 表示 石头 1 表示剪刀 2 表示 布
 * 并要可以显示 Tom的输赢次数（清单）, 假定 玩三次.
 */

public class TomGame {

    public static void main(String[] args) {

        JimTest jimTest = new JimTest();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" -----0 表示 石头 1 表示剪刀 2 表示 布-----");
        int tomNowNum = scanner.nextInt();
        int jim = jimTest.tomNum(tomNowNum);
        int computer = random.randomNum();
        jimTest.playComputer(jim, computer);

        new ArrayList();
    }
}

//请编写一个猜拳的游戏
class JimTest {
    int count;

    //人出数
    public int tomNum(int num) {
        return num;
    }


    //输赢比较
    public void playComputer(int tomNum, int computerNum) {
        if (computerNum - tomNum == 0) {
            System.out.println("平局");
        } else if (tomNum - computerNum == 1) {
            System.out.println("你赢了");
        } else {
            System.out.println("你输了");
        }
    }
}

class RandomTest {
    //随机产生数
    public int random() {
        return (int) (Math.random() * 3);
    }
}

