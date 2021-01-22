package exception_;

/**
 * Author:ZJF
 * Date:2021-01-22 上午9:33
 */
public class ArrayIndexOutOfBoundsException_ {
    public static void main(String[] args) {

        int[] a = {1,2};
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
        System.out.println(a[10]);
    }
}
