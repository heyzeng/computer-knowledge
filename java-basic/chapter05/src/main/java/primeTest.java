

/*
	质数（也叫素数）：只能被1和本身整除的数

	求100以内的质数 ？

	质数的定义中明确指出了一个前提条件，一个大于1的自然数。1不属于这个范围，所以1不是质数
 */
public class primeTest {
    public static void main(String[] args) {

        boolean boo = true;
        for (int i = 2; i <= 100; i++) {

            for (int j = 2; j < i ; j++) {
                if (i % j == 0) {
                    boo = false;
                    break;//一旦测到j是某个数时可以被整除，那么后面的数字(j)就不用再检测
                }
            }

            if (boo){
                System.out.println(i);
            }
            //将标签重置
            boo = true;


        }


    }

}
