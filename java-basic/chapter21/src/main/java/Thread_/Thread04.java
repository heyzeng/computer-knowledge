package Thread_;

/**
 * Author:ZJF
 * Date:2021-01-04 下午7:20
 */
public class Thread04 {

    public static void main(String[] args) {

        //如果我们希望通过 extends Thread创建一个线程
        //如果，我们希望启动两个线程，必须创建两个 T4对象
        T4 t4 = new T4();
        T4 t41 = new T4();

        t4.start();
        t41.start();

        //实现接口的方式，使用线程
        //这时，我们启动了两个线程，但是共享的是同一个对象的内容
        T5 t5 = new T5();
        new Thread(t5).start();
        new Thread(t5).start();

    }


}

class T4 extends Thread {
    private int n = 10;

    @Override
    public void run() {
        super.run();
    }
}

class T5 implements Runnable {
    private int num = 50;

    @Override
    public void run() {

    }
}
