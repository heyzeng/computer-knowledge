package wrapper;

/**
 * Author:ZJF
 * Date:2021-03-16 上午10:02
 */
public class test {
    public static void main(String[] args) {
//        System.out.println(Fibonacci(10));
        System.out.println(Fuc(2,2));
    }

    public static long Fibonacci(int n) {
        if (n ==0 || n == 1) return n;

        int one = 0; int two = 1; int three = 1;
        for (int i = 2; i < n; i++) {

            one = two;
            two = three;
            three = one  + two;
        }
        return three;
    }

    // x的n 次方
    public static int Fuc(int x ,int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * x;
        }
        return result;
    }
}
