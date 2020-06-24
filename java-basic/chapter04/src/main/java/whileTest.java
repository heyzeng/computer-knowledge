;

/*


	循环结构 ：while

	循环的四要素：
		1.初始化条件
		2.循环条件
		3.循环体
		4.迭代条件

	格式：
		初始化条件：
		while(循环条件){
			循环体;
			迭代条件;
		}

*/
public class whileTest {
    public static void main(String[] args) {
        //需求:求100以内的偶数，求偶数的个数，求偶数的总和？
        int sum = 0; //和
        int count = 0; //计数
        int i = 1; //初始化条件

        while (i <= 100){//循环条件

            if (i % 2 == 0 ) {//循环体
                count++;
                sum +=i; //sum = sum +i
                System.out.println(i);
            }
            i ++;//迭代条件

            System.out.println("sum = " + sum + " count = " + count);

        }
    }
}
