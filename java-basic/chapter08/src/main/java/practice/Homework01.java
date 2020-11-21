package practice;


public class Homework01 {

    public static void main(String[] args) {

        //定义方法，实现求某个double数组的最大值. 输出即可
        int[] arr = {1,3,2};
        Homework01 homework01 = new Homework01();
        homework01.getMax(arr);

    }

    public void getMax(int[] arr){

        //保护机制
        if (arr.length == 0){
            System.out.println("No");
            return ;
        }

        //求最大数组
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("max = " + max);
    }
}
