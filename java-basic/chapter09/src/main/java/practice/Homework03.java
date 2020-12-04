package practice;

/**
 * Author:Jude
 * Date:2020-12-02 上午9:11
 */
public class Homework03 {

    public static void main(String[] args) {

        Homework03 homework03 = new Homework03();

        int[] arr = {1,3,2};
        homework03.SortBy(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String[] arr1= {"Jim","jude","A"};
        homework03.SortBy(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }


    }

    //使用方法重载实现使用冒泡排序完成 对 int [] 从小到大排序，
    //和对 String[] 数组的各个元素按照 长度 从大到小排序

    public void SortBy(int[] arr){

        //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -i - 1; j++) {
                int temp = 0;
                if (arr[j] > arr[j + 1]){
                    temp = arr[j+1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void SortBy(String[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -1 -i; j++) {
                String temp = "";
                if (arr[i].length() < arr[i+1].length()){
                    temp = arr[j+1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
