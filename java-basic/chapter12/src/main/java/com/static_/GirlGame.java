package com.static_;

/**
 * Author:ZJF
 * Date:2021-01-13 下午7:31
 */
public class GirlGame {
    public static void main(String[] args) {

        Girl a = new Girl("a");
        Girl b = new Girl("b");
        Girl c = new Girl("c");

        a.playGame();
        b.playGame();
        c.playGame();

        System.out.println(a.count);
        System.out.println(b.count);
        System.out.println(c.count);

        a.count = 100;
        System.out.println(b.count);
        System.out.println(Girl.count);

    }
}

class Girl{
    private String name;
    public static int count;//count 变量是所有Boy对象共享的数据

    public Girl(String name) {
        this.name = name;
    }

    public void playGame(){
        System.out.println("play Game");
        count++;
    }
}
