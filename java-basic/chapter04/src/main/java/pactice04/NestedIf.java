package pactice04;


import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {

        /*
			参加百米运动会，如果用时8秒以内进入决赛，否则提示淘汰。
			并且根据性别提示进入男子组或女子组。【可以让学员先练习下】,
			输入成绩和性别，进行判断和输出信息。


			思路
			1. 定义扫描器
			2. 变量 double score  接收成绩, 如果  <=8 就再输入 性别, 再判断
			3. 如果 score > 8 淘汰
			*/

        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        if (score <= 8){

            System.out.println("congratulations you enter the final");

            char sex = scanner.next().charAt(0);
            if ("man".equals(sex)){
                System.out.println("please enter group of man");
            }else if ("women".equals(sex)){
                System.out.println("please enter group of woman");
            }else{
                System.out.println("i dont know");
            }

        }else {
            System.out.println("you out");
        }

    }
}
