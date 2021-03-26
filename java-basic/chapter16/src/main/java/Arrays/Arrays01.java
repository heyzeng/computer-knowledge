package Arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Author:ZJF
 * Date:2021-03-21 上午12:10
 */
public class Arrays01 {
    public static void main(String[] args) {
        Integer[] arr = {1,4,2,5};

        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer n1 = (Integer) o1;
                Integer n2 = (Integer) o2;

                if (n1 < n2) {
                    return -1;
                }else if (n1 > n2){
                    return 1;
                }else {
                    return 0;
                }
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}

