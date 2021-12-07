import java.util.PriorityQueue;

/**
 * Author:Jude
 * Date:2021-12-07 下午11:02
 */
public class lc_0215_findKthLargest {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int kthLargest = findKthLargest(nums, k);
        System.out.println(kthLargest);
    }

    public static int findKthLargest(int[] numbers, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int number : numbers) {
            queue.add(number);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
    }
}
