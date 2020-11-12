package practice;


import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {


		/*
		有一个数组 {1， 2， 3， 4， 5}， 可以将该数组进行缩减，提示用户是否继续缩减，
		每次缩减最后那个元素。当只剩下最后一个元素，提示，不能再缩减。
		*/

        int[] arr = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        char choice = ' ';

        do {

            if (arr.length == 1){
                System.out.println("Dont make it");
                break;
            }

            int[] newArr = new int[arr.length - 1];
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = arr[i];
            }

            arr = newArr;


            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

            System.out.println("choice y or n");
            choice = scanner.next().charAt(0);

        }while (choice != 'n');


    }
}
