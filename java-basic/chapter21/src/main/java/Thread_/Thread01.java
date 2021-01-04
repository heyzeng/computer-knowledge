package Thread_;

/**
 * Author:ZJF
 * Date:2021-01-04 下午6:55
 */
public class Thread01 {

    public static void main(String[] args) {

        T1 t1 = new T1();
        t1.start();
    }
}

//run 方法，就是我们线程主要执行的方法
//当我们启动一个线程时，就会执行run
//要求1:请编写一个程序,该程序可以每隔一秒。在控制台输出 “hello,world”
//要求2: 对上一个题改进:该程序可以每隔一秒。在控制台输出“hello,world”,当输出10次后，自动退出

class T1 extends Thread {//T1 是类，遵守 OOP 的所有原则

    @Override
    public void run() {

        int count = 0;
        while (true) {

            try {
                Thread.sleep(1000);//休眠1s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            count++;
            System.out.println("hello world");

            if (count == 10) {
                System.out.println("结束线程");
                break;
            }

        }
    }
}
