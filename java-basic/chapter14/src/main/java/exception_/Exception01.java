package exception_;

/**
 * Author:ZJF
 * Date:2021-01-25 下午4:10
 */
public class Exception01 {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 0;

        //java的设计者，提供了一种机制
        //1. 如果我们程序中，发生非致命的异常的，可以再处理后,继续程序运行
        //2. 这个机制，我们叫异常处理机制
        try {
            int n3 = n1 / n2;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(".....");
    }
}
