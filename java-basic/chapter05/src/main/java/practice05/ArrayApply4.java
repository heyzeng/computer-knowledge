package practice05;


import java.lang.reflect.Array;

public class ArrayApply4 {

    public static void main(String[] args) {

        int [] arr1  = {1,3,5};
        int [] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {

            arr2[i] = arr1[i];
        }

        arr1[0] = 888;

        System.out.println(arr1[0]);
        System.out.println(arr2[0]); //堆内从重新开辟了空间给arr2={1,3,5}
    }
}
