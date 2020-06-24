package java3;

import java.util.Arrays;

public class arrayTool {
    public static void main(String[] args) {

        int[] numbers = {10,2,1,3,5,11,7};

        //toString(int[] numbers) : 以字符串的形式获取数组中所有的元素
        String str = Arrays.toString(numbers);
        System.out.println(str);


        //sort(int[] numbers) 对数组中的元素进行排序
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        //binarySearch(int[] a, int key)使用二分法查找 （注意：查找前必须先排序）如果没有找到返回负数
        int index = Arrays.binarySearch(numbers, 10);
        System.out.println(index);
    }
}
