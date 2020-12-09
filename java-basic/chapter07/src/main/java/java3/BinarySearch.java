package java3;

/**
 * Author:ZJF
 * Date:2020-12-09 下午3:24
 */
public class BinarySearch {

    public static void main(String[] args) {

        int[] arr ={1,2,3,4,6,8};
        int findNum = 6;
        int left = 0;
        int right = arr.length - 1;
        int indexFind = -1;

       while (right >= left){
            int midIndex = (right + left) / 2;
            int midNum = arr[midIndex];

            if (findNum == midNum){
                indexFind = midIndex;
                break;
            } else if (findNum  >midNum ){
                left = midIndex  + 1;
            }else {
                right = midIndex - 1;


            }
        }

        if (indexFind != -1 ){
            System.out.println("找到 index = " + indexFind);
        }else {
            System.out.println("没有找到");
        }
    }
}
