

/*

	循环结构：do-while

	循环的四要素：
		1.初始化条件
		2.循环条件
		3.循环体
		4.迭代条件

	格式：

		初始化条件;

		do{

			循环体;
			迭代条件;

		}while(循环条件);


*/
public class DoWhileTest {
    public static void main(String[] args) {

        //一百以内偶数个数
        int i = 1;
        int count = 0;
        int sum = 0;

        do {
            if (i % 2 == 0){
                count++;
                sum +=i;
            }

            i++;//迭代条件
            System.out.println(i);

        }while (i <= 100);
        System.out.println(count + " " + sum);
    }
}
