package Arrays;

import java.util.Arrays;
import java.util.Comparator;


public class CustomCompare {
    public static void main(String[] args) {
        Integer[] arr = {1,4,5,2,10};

        CustomCompare.sort(arr, (o1, o2) -> {
            // TODO Auto-generated method stub
            // 向下转型 Object -> Integer
            Integer n1 = (Integer) o1;
            Integer n2 = (Integer) o2;

            if (n1 > n2) {
                return 1;
            } else if (n1 < n2) {
                return -1;
            } else {
                return 0;
            }
        });

        System.out.println("自己写的方式");

        System.out.println(Arrays.toString(arr));
    }

    public static void sort(Integer[] arr , Comparator comparable) {

        Integer temp = 0;
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if (comparable.compare(arr[j],arr[j + 1]) > 0){
                    temp = arr[j];
                    arr[j+1] = temp;
                    arr[j] = arr[j +1];
                }
            }
        }
    }
}

