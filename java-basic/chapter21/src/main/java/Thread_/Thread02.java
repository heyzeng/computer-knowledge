package Thread_;

/**
 * Author:ZJF
 * Date:2021-01-04 下午7:00
 */
public class Thread02 {

    public static void main(String[] args) {

        T2 t2 = new T2();
        new Thread(t2).start();//因为 T2 没有 start 方法, 将  t2 对象，放入一个Thread对象
    }

}

class T2 implements Runnable {//实现接口的方式创建线程类

    @Override
    public void run() {
        int count = 0;

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            count++;
            System.out.println(count + " hello world");

            if (count == 10) {
                System.out.println("线程结束");
                break;
            }
        }
    }
}
