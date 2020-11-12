package practice;


public class Homework02 {
    public static void main(String[] args) {

        //思路
        //1. 先确定 最左边的下标 leftIndex = 0 最右边下标 rightIndex = arr.length - 1
        //2. 找到中间数 midIndex = ( leftIndex + rightIndex) / 2; mid = arr[midIndex]
        //3. 比较，如果 findNum >  mid; 向右 leftIndex = midIndex+1.。
        //4. 比较，如果 findNum <  mid; 向左 rightIndex = midIndex-1.。
        //5. 比较，如果 findNum ==  mid; 找到
        //6. 3,4,5 循环，直到 leftIndex > rightIndex 找不到，退出


        //二分查找必须是有序数组
        int[] arr = {1,2,4,100, 200,456};

        int index = -1;
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        int findNum = 100;
        int midIndex = 0;
        int mid = 0;

        //while循环条件

        while (rightIndex >= leftIndex){


            midIndex = (rightIndex + leftIndex) / 2;
            mid = arr[midIndex];

            if (findNum < mid){
                rightIndex = midIndex - 1;
            }else if (findNum > mid){
                leftIndex = midIndex +1;

            } else {
                index = midIndex;
                break;

            }

        }

        if (index == -1){
            System.out.println(" no find");
        }else {
            System.out.println(index);
        }


    }
}
