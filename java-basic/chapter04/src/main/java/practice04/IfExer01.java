package practice04;


import java.util.Scanner;

public class IfExer01 {

    public static void main(String[] args) {

        /*
		大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出一定的条件：高：180cm以上；富：财富1千万以上；帅：是。条件从控制台输入。
		如果这三个条件同时满足，则：“我一定要嫁给他!!!”
		如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。”
		如果三个条件都不满足，则：“不嫁！”

		int height ; double money; boolean handsome;

		思路分析
		1. 创建一个扫描器
		2. 定义三个变量 int height ; double money; boolean handsome;
		3. 多分支判断
		*/

        Scanner scanner = new Scanner(System.in);
        int high = scanner.nextInt();
        int money = scanner.nextInt();
        String handsome = scanner.next();


        if (high >= 180 && money >= 100000000 && "帅".equals(handsome)){
            System.out.println("yes,i will marry you ");
        } else if (high >= 180 || money >= 100000000 || "帅".equals(handsome)){
            System.out.println("not too bad");
        }else {
            System.out.println("no");
        }
    }
}
