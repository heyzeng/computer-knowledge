package exception_;

/**
 * Author:ZJF
 * Date:2021-01-28 上午9:09
 */
public class TryCatch01 {
    public static void main(String[] args) {

        try {
            int[] arr = { 1, 2 };
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
