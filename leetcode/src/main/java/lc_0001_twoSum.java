/**
 * Author:Jude
 * Date:2021-12-07 下午11:06
 */

import java.util.Arrays;

/**
 * 两数之和
 */
public class lc_0001_twoSum {
    public static void main(String[] args) {
        int[] nums = {1,2,8,10};
        int target = 10;

        System.out.println(Arrays.toString(twoSum(nums,target)));
        System.out.println(Arrays.toString(twoPoint(nums,target)));
    }

    // 1 暴力遍历
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return null;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("no have");
    }

    // 2 双指针
    public static int[] twoPoint(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int k = nums[i] + nums[j];
            if (target == k) {
                return new int[] {i,j};
            } else if (target < k){
                j--;
            } else {
                i++;
            }
        }
        throw new IllegalArgumentException("no have");
    }
}
