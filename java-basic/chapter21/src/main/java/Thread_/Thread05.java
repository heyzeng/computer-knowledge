package Thread_;

/**
 * Author:ZJF
 * Date:2021-01-05 下午5:21
 */
public class Thread05 {

    public static void main(String[] args) {
        T6 t6 = new T6();
        new Thread(t6).start();
        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello");
            if (i == 5) {
                t6.setLoop(false);
            }
        }


    }
}

//需求：启动一个子线程a，要求在main线程中去停止线程a, 请编程实现
//1 子线程 输出 hi , 循环输出 100 毫秒
//2.主线程, 输出 10次 hello, 当输出到 第5次hello, 就想办法，停止子线程
//3.主线程，继续输出 hello, 当输出第10次，主线程退出
//4.其实就是一个线程间通信的问题.

class T6 implements Runnable {
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    public T6(boolean loop) {
        this.loop = loop;
    }

    public T6() {

    }

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hi");

        }
    }
}
