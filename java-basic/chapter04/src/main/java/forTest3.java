

/*

输出所有的水仙花数，所谓水仙花数是指一个3
   位数，其各个位上数字立方和等于其本身。
    例如： 153 = 1*1*1 + 3*3*3 + 5*5*5


*/
public class forTest3 {
    public static void main(String[] args) {

        //循环100~999的数
        for (int i = 100; i <1000 ; i++) {

            int a = i/100; //百位数  999/100 = 9 取整得9
            int b = i / 10 % 10;//十位数 721/10 =72  72%10取余数的2 得到十位数
            int c = i % 10;//个位数

            if (i == a*a*a + b*b*b + c*c*c){
                System.out.println(i);
            }

        }

    }
}
