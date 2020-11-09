package practice05;


public class HomeWork08 {

    public static void main(String[] args) {

        /*
		求1+（1+2）+（1+2+3）+（1+2+3+4）+...+(1+2+3+..+100)的结果

		分析
		1. 一共有100
		1
		1,2
		1,2,3
		...
		2. 需要循环控制 每一项的个数
		3. 累计到 sum
		*/
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j <= i; j++) {

                sum += j;

            }

        }
        System.out.println(sum);
    }
}
