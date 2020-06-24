/*
从键盘分别输入年、月、日，判断这一天是当年的第几天

   注：判断一年是否是闰年的标准：
       1）可以被4整除，但不可被100整除
       2）可以被400整除


*/
import java.util.Scanner;

public class switchTest2{

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("请输入年份");
        int year = s.nextInt();
        System.out.println("请输入月份");
        int month = s.nextInt();
        System.out.println("请输入几号");
        int day = s.nextInt();


        int sumDay = 0; //用来记录总天数

        switch(month){
		/*
		case 1:
			sumDay += day;
			break;
		case 2:
			sumDay += 31 + day;
			break;
		case 3:
			sumDay += 31 + day + 28;
			break;

		*/

            case 3:
                //判断闰年
                if((year % 4 == 0 && year % 100 !=0)  || (year % 400 == 0)){
                    sumDay += 29;
                }else{
                    sumDay += 28;
                }

            case 2:
                sumDay += 31;
            case 1:
                sumDay += day;
                break;
        }

        System.out.println(sumDay);
    }
}
