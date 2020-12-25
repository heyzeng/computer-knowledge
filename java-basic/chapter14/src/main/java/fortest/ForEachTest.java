package fortest;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Author:ZJF
 * Date:2020-12-25 上午10:35
 */
public class ForEachTest {

    public static void main(String[] args) {

        int [] some = new int[]{1,2};

        int[] a = {1,3,4};
        for (int i:a) {//增强for循环
            System.out.println(i);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //Arrays.toString
        System.out.println(Arrays.toString(a));//打印数组[1, 3, 4]
    }
}
