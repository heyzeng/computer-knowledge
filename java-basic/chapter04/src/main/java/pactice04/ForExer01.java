package pactice04;


public class ForExer01 {

    public static void main(String[] args) {

        /*
		打印1~100之间所有是9的倍数的整数，统计个数  及 总和.

		编程的两大技巧(化繁为简, 先死后活)
		化繁为简: 将一个相对复杂功能，分解成小的功能，逐一实现
		思路
		1. 先输出 1-100
		2. 对输出的值，进行过滤得到 9的倍数 if
		3. 统计个数: 定义一个变量count,每进入if ,count++;
		4. 总和 : 定义一个变量sum,  每进入if, sum +=i;
		5. 做的灵活一点 start end
		*/
        int count = 0;
        int sum = 0;
        int start = 1;
        int end = 100;
        for (int j = start; j <= end; j++) {

            if (j % 9 ==0){

                count++;
                sum +=j;
            }
            System.out.printf("count = %d,sum = %d",count,sum);
        }
    }
}
