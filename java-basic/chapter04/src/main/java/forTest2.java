/*

不断输入整数，统计正数的个数，直到输入0为止
*/
import java.util.Scanner;

public class forTest2{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int positiveNum = 0;
        boolean boo = true;
//        int i = scanner.nextInt(); 不要在循环外输入数字

       //不断输入数字要加死循环
       while (boo){
            int i = scanner.nextInt();
            if (i == 0){
                boo = false;//中断死循环条件
                System.out.println("stop");
            }else if (i > 0){
                positiveNum++;
            }
            System.out.println("positiveNum = " + positiveNum);

        }
        }
}