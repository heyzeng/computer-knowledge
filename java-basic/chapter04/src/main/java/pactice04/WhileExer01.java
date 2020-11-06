package pactice04;


import java.util.Scanner;

public class WhileExer01 {

    public static void main(String[] args) {

        //不断输入姓名，直到输入 "exit" 为止[使用while完成]
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入值");
        String str = scanner.next();

        while (!("exit").equals(str)){
            System.out.println("yes amd!");
            str = scanner.next();
        }


        //打印1―100之间所有能被3整除的数
        int i = 1;
        while (i <= 100){
            if (i % 3 ==0){
                System.out.println(i);
            }
        }

    }
}
