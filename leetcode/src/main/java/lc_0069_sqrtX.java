/**
 * Author:Jude
 * Date:2021-12-12 下午11:19
 */
public class lc_0069_sqrtX {
    public static void main(String[] args) {
        System.out.println(mySqrX(4));
    }

    // 1 双指针
    public static int mySqrX(int x) {
        if (x <= 1) {
            return x;
        }

        int left = 1;
        int right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int sqr = x / mid;

            if (sqr == mid) {
                return mid;
            } else if (mid > sqr) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}
