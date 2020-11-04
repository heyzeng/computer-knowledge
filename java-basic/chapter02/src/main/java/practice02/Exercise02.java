package practice02;


public class Exercise02 {
    public static void main(String[] args) {


        //需求: 假如还有97天放假，问：xx个星期零xx天 =》 理解能力
        // 就是把一个整数，转成对应的 星期数和剩余天数
        //星期数 97 %7 天数 97-97%7 *7
        int totalDays = 97;
        int week = totalDays / 7;
        int day = totalDays % 7;
        System.out.printf("%d个星期零%d天",week,day);


        //需求
        /**
         定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：
         5/9*(华氏温度-100),请求出华氏温度对应的摄氏温度。
         */


        // 5/9 = 0 所以5.0/9
        double huaShi = 1000;
        double sheShi = 5.0 / 9 * (huaShi - 100);
        System.out.println(sheShi);

        System.out.printf("华氏温度 %.2f  对应的摄氏温度 %.2f" , huaShi, sheShi);

    }
}
