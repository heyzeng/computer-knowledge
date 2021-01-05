package Thread_;

import java.util.Scanner;

/**
 * Author:ZJF
 * Date:2021-01-05 下午5:40
 */
public class Thread06 {

    public static void main(String[] args) {

        T7 t7 = new T7();
        T8 t8 = new T8(t7);
        t7.start();
        t8.start();


    }
}

//在main方法中创建并启动两个线程。第一个线程循环随机打印100以内的整数，直到第二个线程从键盘读取了“Q”命令。
//思路
//1. 写出第一个线程类 循环随机打印100以内的整数
//2. 写一个线程类，有得到 前面线程的对象应用
class T7 extends Thread{
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println((int)(Math.random() * 100) + 1);
        }
    }
}

class T8 extends Thread{
    private Scanner scanner = new Scanner(System.in);
    private T7 t = null;

    public T8(T7 t) {//?
        this.t = t;
    }

    @Override
    public void run() {
        while (true){
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q')
            t.setLoop(false);
            break;
        }
    }
}

