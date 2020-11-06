package practice05;


public class ArrayApply2 {

    public static void main(String[] args) {

        /*

		请求出一个数组int[]的最大值 {4,-1,9, 10,23}，并得到对应的下标

		思路
		1. 假定第一个元素就是最大数 max, maxIndex
		2.遍历数组每个元素，如果我发现 max 比后面的某个元素小，就做相应变化
		*/

        int[] arr = {4,-1,10,23};

        int max = arr[0];
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("max = " + max + " maxIndex = " + maxIndex);
    }
}
