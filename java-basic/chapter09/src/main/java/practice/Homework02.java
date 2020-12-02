package practice;

/**
 * Author:Jude
 * Date:2020-12-02 上午8:56
 */
public class Homework02 {

    public static void main(String[] args) {

        Homework02 homework02 = new Homework02();

        double[] arr = {1,3.2,1.1};
        System.out.println(homework02.getMaxIndexFromArray(arr));

        String[] arr1 = {"aaa","TOM","jude"};
        System.out.println(homework02.getMaxIndexFromArray(arr1));

    }

    //使用方法重载实现返回 double 数组中最大值的下标和 String 数组的长度最大的元素的下标

    //使用方法重载实现返回 double 数组中最大值的下标
    public int getMaxIndexFromArray(double[] arr){

        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[maxIndex] < arr[i]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public int getMaxIndexFromArray(String[] arr){

        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[maxIndex].length() < arr[i].length()){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
