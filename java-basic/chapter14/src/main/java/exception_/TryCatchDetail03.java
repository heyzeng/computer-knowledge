package exception_;

/**
 * Author:ZJF
 * Date:2021-01-28 上午9:20
 */
public class TryCatchDetail03 {
    public static void main(String[] args) {
        /*
         * 可以有多个catch语句，捕获不同的异常(进行不同的业务处理)，要求父类异常在后， 子类异常在前，比如(Exception
         * 在后，NullPointerException 在前)， 如果发生异常，只会匹配一个catch, 案例演示
         *
         */

        try {

            int i = 10 / 0;//算术异常


        }  finally {
            System.out.println("here3");
        }

        System.out.println("程序继续...");

    }
}
