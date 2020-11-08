package practice05;


public class ArrayApply3 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,1000};
        int[] arr2 = arr1;
        arr1[0] = 888;

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);

    }
}
