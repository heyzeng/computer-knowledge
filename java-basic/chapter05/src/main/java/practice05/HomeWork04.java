package practice05;


public class HomeWork04 {

    public static void main(String[] args) {


		/*
		求出1-1/2+1/3-1/4…..1/100的和 [选做]

		思路 [大家缺] =》 不要急 => 解决问题的思维体系
		1. 1-1/2+1/3-1/4…..1/100  等价 (1/1)-(1/2)+(1/3)-(1/4)…..(1/100)
		2. 规律 共用 100项， 每一项的分子 1 ，分母是 从 1 ， 2， 3， 4.  1000
		3. 奇数项是正数 ， 偶数项是负数

		走代码
		*/

        double sum = 0.0;
        for (int i = 1; i < 101; i++) {

            if (i % 2 == 0){//偶数为负数

                sum -= 1/i;

            } else{
                sum += 1/i;
            }

        }
        System.out.printf("sum = %.2f",sum);


    }
}
