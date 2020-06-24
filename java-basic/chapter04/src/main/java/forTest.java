;

/*

	循环结构：for循环

	循环的四要素：
		1.初始化条件
		2.循环条件
		3.循环体
		4.迭代条件

	格式：
		for(初始化条件;循环条件;迭代条件){
				循环体;
		}

	执行顺序 ：1 -> 2 -> 3 -> 4 -> 2 -> 3 .......2

	说明：
		1.初始化条件只执行一次
		2.循环条件的结果为布尔类型，如果结果为true则继续执行循环，如果结果为false则跳出循环结构
		3.迭代条件必须有，否则就成了死循环。
*/
public class forTest {
    public static void main(String[] args) {
        //需求：求100以内的偶数,求偶数的个数,求偶数的和?
        int count = 0; //计数
        int sum = 0; //求和

        for (int i = 1; i < 200; i++) {
            if (i % 2 == 0){
                sum += i; //sum = sum + i
                count ++;
                System.out.println(i);
            }

        }
        //输出
        System.out.println("sum = " + sum + " count = " + count);
    }
}
