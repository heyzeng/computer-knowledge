package Thread_;

/**
 * Author:ZJF
 * Date:2021-01-04 下午7:09
 */
public class Thread03 {

    public static void main(String[] args) {

        new Thread(new T3("hello,world", 10)).start();
        new Thread(new T3("hi", 5)).start();
    }
}

//请编写一个程序,创建两个线程, 一个线程每隔1秒输出 “hello,world”,输出10次，退出，一个线程每隔1秒输出 “hi”, 输出 5次退出.

class T3 implements Runnable {
    private String message;
    private int time;

    public T3(String message, int time) {
        this.message = message;
        this.time = time;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(message + ++count);//输出
            if (count == time) {
                break;
            }

        }

    }
}
