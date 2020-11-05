package practice03;


public class Homework02 {

    public static void main(String[] args) {


        //二、定义变量保存 秒数，打印输出 xx小时xx分钟xx秒
		/*

		  需求理解 : 考察能力
			给你秒数 ->  转成 对应   xx小时xx分钟xx秒

		  思路分析 : 逻辑能力 =>  只有多写，多练
			 (1) 转成 xx秒
			 (2) 转成 分钟
			 (3) 转成 小时*/


        //(1) 先定义一个 int  seconds  =  345678
        //(2) 定义一个 int  hours = seconds / 3600 (含有多少个3600, 就有多少个小时)
        //(3) 定义一个 int  minutes = seconds % 3600 / 60 (不足3600 的秒数，含有多少个60)
        //(4) 定义一个 int  leftSeconds = seconds % 60
        int times =10000000;
        int hours = times /3600;
        int minutes = times % 3600 /60;
        int seconds = times % 60;

        System.out.printf("%d小时 %d 分钟%d 秒",hours,minutes,seconds);
    }
}
