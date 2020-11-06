package practice04;


import java.util.Scanner;

public class DoWhileExer01 {

    public static void main(String[] args) {
        /*
		如果老公同意老婆购物，则老婆将一直购物，直到老公说不同意为止
		[System.out.println("老婆问：我可以继续购物吗？y/n")]
		*/

        Scanner scanner = new Scanner(System.in);
        char answer;

        do {

            System.out.println("shopping");
            answer = scanner.next().charAt(0);

        }while (answer == 'y');


        //统计1――200之间能被5整除但不能被3整除的个数

        int sum = 0;
        int i = 1;

        do {

            if (i % 5 ==0 && i % 3 != 0){
                System.out.println(i);
                sum++;
            }
            i++;
        }while(i<=200);
        System.out.println(sum);

    }
}
