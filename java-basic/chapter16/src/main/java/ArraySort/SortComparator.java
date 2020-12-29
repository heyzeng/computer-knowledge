package ArraySort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Author:ZJF
 * Date:2020-12-29 上午9:23
 */
public class SortComparator {

    public static void main(String[] args) {

        Integer[] arr ={1,4,2,5};

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               if (o1 > o2){
                   return -1;
               }else if (o1 < o2){
                   return 1;
               }else {
                   return 0;
               }
            }
        });

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
    }
}

