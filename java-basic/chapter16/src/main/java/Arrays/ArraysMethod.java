package Arrays;

import java.util.Arrays;
import java.util.List;

/**
 * Author:Jude
 * Date:2021-07-20 下午11:51
 */
public class ArraysMethod {
    public static void main(String[] args) {
        Integer[] arr = {1, 2 , 3, 4, 10, 89};
        int index = Arrays.binarySearch(arr, 1);
        System.out.println(index);
        System.out.println("=============");

        //copyOf 数组元素的复制

        Integer[] newArr = Arrays.copyOf(arr,arr.length);
        for (Integer integer : newArr) {
            System.out.println(integer);
        }

        System.out.println("=============");

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

        System.out.println("=============");

        /*
         * fill 数组元素的填充
         * Integer[] num = new Integer[]{9,3,2};
         * Arrays.fill(num, 99);
         */
        Integer[] num = new Integer[]{9,3,2};
        Arrays.fill(num,99);
        for (Integer integer : num) {
            System.out.println(integer);
        }

        System.out.println("=============");

        /*
		 equals 比较两个数组元素内容是否完全一致
		 boolean equals = Arrays.equals(arr, arr2);
		 */
        boolean equals = Arrays.equals(arr, newArr);
        System.out.println(equals);

        System.out.println("=============");

        /*
         * toString 返回数组的字符串形式Arrays.toString(arr)
         */

        double[] arr3 = {1.1, 1.3, 8, -34};
        System.out.println(Arrays.toString(arr3));

        System.out.println("=============");

        /*
         * asList 将一组值，转换成list List<Integer> asList = Arrays.asList(2,3,4,5,6,1);
         * System.out.println("asList=" + asList);
         */
        List<Integer> asList = Arrays.asList(2, 3, 1);
        System.out.println("asList = " + asList ) ;
    }
}
