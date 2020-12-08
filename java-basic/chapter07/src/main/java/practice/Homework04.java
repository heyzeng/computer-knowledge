package practice;


public class Homework04 {

    public static void main(String[] args) {


			/*
			定义一个4行4列的二维数组(注意：行和列也可能是 不相同的)，
			逐个从键盘输入值，编写程序将四周的数据清0
			*/

        //创建二维数组
        int[][] arr = {{1,3,4,6}, {6 ,7, 8, 8}, {1,2,3,4}, {5, 6, 7}};

        for( int i = 0; i < arr.length; i++) {
            for( int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        //编写程序将四周的数据清0
			/*
			思路:
			遍历 二维数组，如果是 第1行/ i = 0 || 最后一行/ i = arr.length ||第1列 j ==0 || 最后1列 j = arr[i].length -1, 就设置为0
			*/

        for( int i = 0; i < arr.length; i++) { //行
            for( int j = 0; j < arr[i].length; j++) {//列
                if( i == 0 || i == arr.length -1 || j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 0;
                }
            }
        }

        System.out.println("===================================");

        for( int i = 0; i < arr.length; i++) {
            for( int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
