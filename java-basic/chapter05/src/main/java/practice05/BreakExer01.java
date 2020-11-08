package practice05;


public class BreakExer01 {

    public static void main(String[] args) {


        /*
		某人有100,000元,每经过一次路口，需要交费,规则如下:
当现金>50000时,每次交5%
当现金<=50000时,每次交1000
编程计算该人可以经过多少次路口,使用 while break方式完成


		思路
		1. double  money  = 100,000
		2. 当现金>50000时,每次交5%   money =  money  * 0.95
		3. 当现金<=50000时,每次交1000 money -= 1000;
		4. 当现金 <1000, 退出
		*/

        double money = 100000;
        int passNum = 0;
        while (true){

            if (money >5000){
                money = money *0.95;
                passNum++;

            } else if (money > 1000){
                money -= 1000;
                passNum++;
            } else {
                break;
            }
        }
    }
}
