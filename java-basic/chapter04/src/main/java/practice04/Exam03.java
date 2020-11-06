package practice04;


public class Exam03 {

    public static void main(String[] args) {


        //思路水仙花数
        //判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
        //例如： 153 = 1*1*1 + 3*3*3 + 5*5*5   ★  [动脑~~]
        // 1 dismantling num eg: a*a*a + b*b* c*c*c = num
        int num = 153;
        int a = num / 100;
        int b = num % 100 / 10;
        int c  = num % 100 % 10;

        if (a*a*a + b*b*b +  c*c*c ==num){
            System.out.println("是水仙花数");
        }else {
            System.out.println("no ");
        }
        System.out.println(a + " " + b + " " + c);


    }
}
