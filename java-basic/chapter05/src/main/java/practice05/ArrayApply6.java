package practice05;


public class ArrayApply6 {

    //数组扩容

    public static void main(String[] args) {

//		//增加一个88 到 arr1 中
//		/*
//		思路
//		1. 先创建一个新数组 int[] newArr = new int[arr1.length + 1];
//		2. 遍历 arr1 将数据拷贝到 newArr
//		3. newArr[newArr.length - 1] = addNum
//		4. arr1 = newArr;
//		*/

        //注意下角标 0，1 2 以0开始的。

        int[] arr1 = {1,2,3};
        int addNum = 88;

        int[] arr2 = new int[arr1.length + 1];

        for (int i = 0; i < arr1.length; i++) {

            arr2[i] = arr1[i];

        }

        arr2[arr1.length] = addNum;
        arr1 = arr2; //让arr1 指向新的扩容后的数组，原来的数组当做垃圾被回收


        for (int i = 0; i < arr2.length; i++) {

            System.out.print(arr1[i] + "\t");
        }

        System.out.println(arr1.length);

    }
}
