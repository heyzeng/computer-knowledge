package exception_;

/**
 * Author:ZJF
 * Date:2021-01-28 上午9:12
 */
public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            int[] arr = { 1, 2 };
            System.out.println(arr[4]);
            //如果异常发生了，则异常发生后面的代码不会执行，直接进入到catch块
            System.out.println("hi ~");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("异常信息=" + e.getMessage());
        } finally {
            System.out.println("不管是否发生异常，都执行 finally");
        }



        System.out.println("程序继续...");
    }
}
