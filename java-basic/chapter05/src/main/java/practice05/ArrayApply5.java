package practice05;


public class ArrayApply5 {

    public static void main(String[] args) {

        //数组元素的反转
        //要求：随机生成五个数，并将其反转打印，把数组的元素内容反转.
        //arr{1,2,3,4,5}   {5,4,3,2,1}

        //思路：第一个和最后一个交换，交换的次数为 arr.length /2

        int[] arr = {1,2,3,4,5};
        int temp = 0;


        for (int i = 0; i < arr.length / 2; i++) {

            temp = arr[i];
            arr[i] = arr[arr.length -1 - i];
            arr[arr.length - i - 1] = temp;

        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
