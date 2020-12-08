package practice;


public class Homework03 {

    public static void main(String[] args) {

        /*
		已知有个排序好（升序）的数组，要求插入一个元素(扩容)，最后打印该数组，
		顺序依然是升序 【10， 12， 45， 90】 23 【10， 12，23， 45， 90】

		1 本质就是数组扩容
		2 我们找到要插入的位置
		3 23 <= arr[i]就是我们要插入的位置
		*/

        int[] arr = {10, 12, 45, 90};
        int[] newArr = new int[arr.length + 1];
        int inputNum = 23;
        int indexNum = -1;


        for (int i = 0; i < arr.length; i++) {

            if (inputNum <= arr[i]){
                indexNum = i;
                break;
            }
        }


        for (int i = 0,j = 0; i < newArr.length; i++) {
                if (i != indexNum){
                    newArr[i] = arr[j];
                    j++;
                }
        }


        //把插入的值赋给newArr,然后把新数组赋给arr
        newArr[indexNum] = inputNum;
        arr = newArr;


        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //test int[] newArr = {10, 12, 0,45, 90};
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.println(newArr[i]);
//        }
    }
}
