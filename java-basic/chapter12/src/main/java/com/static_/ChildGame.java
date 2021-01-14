package com.static_;

/**
 * Author:ZJF
 * Date:2021-01-13 下午7:25
 */
public class ChildGame {
    public static void main(String[] args) {

        int count = 0;
        Boy jim = new Boy("JIM");
        count++;
        Boy tom = new Boy("TOM");
        count++;
        Boy lucky = new Boy("Lucky");
        count++;

        System.out.println(count);

    }
}

class Boy {
    private String name;
    private int count;

    public Boy(String name) {
        this.name = name;
    }

    public void playGame(){
        System.out.println("play Game");
        count++;
    }
}
