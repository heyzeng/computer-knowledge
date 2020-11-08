package practice05;


public class ArrayApply7 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int addNum = 999;
        int dex = 1;

        //加入一个判断用户输入的下标是否合理的处理，如果不合理，给出提示信息
        //index  到 [0, arr.length]

        int[] arr2 = new int[arr.length + 1];//{0,0,0,0,0}

        for (int i = 0; i <arr2.length; i++) {
            System.out.println(arr2[i] + "\t");

        }

        for (int i =0,j = 0; i < arr2.length; i++) {

            if (i != dex){
                arr2[i] = arr[j];
                j++;
            }
            arr2[1] = addNum;
            System.out.println(arr2[i]);

        }



    }
}
