

/*

	三元运算符 ：

	格式 ：(条件表达式)? 表达式1 ：表达式2;

	说明：
		1.条件表达式的结果只能为boolean类型
		2.如果条件表达式的结果为true则执行表达式1，如果条件表达式的结果为false则执行表达式2
		3.表达式1和表达式2的类型必须一样。
			如果表达式1和表达式2可以进行自动类型提升那么也可以。例 ：double d = (a > b)? 100 : 12.3;
		4.三元运算符可以嵌套使用，但是不建议
		5.三元运算符可以被if所替换。但是反之不成立。如果两者都可以使用的情况下，建议使用三元运算符
					效率高一些。
*/
public class sanyuanTest {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int max = (a>b)?a:b;
        System.out.println(max);

        System.out.println("---------------------------");

        String maxString = (a > b)? "a大":"b大";

        System.out.println("---------------------------");
        //下面的代码不对 ：表达式1和表达式2的类型必须一样,
        //如果表达式1和表达式2可以进行自动类型提升那么也可以。
        //String str	= (a > b)? a:"b大";

        double d = (a > b)? 100 : 12.3;

        System.out.println("d=" + d);

        System.out.println("----------------------------");

        int num1 = 10,num2 = 11;
		/*
			下面的代码成立的条件(结果true) ： num1 > num2
					不成立的条件(结果为false) ： num1 <= num2
					上面的num1,num2都是未知量。

		*/
        String str3 = (num1 > num2)? "aaa" : "ccc";
        System.out.println("str3=" + str3);

        System.out.println("----------------------------");

        //需求 ：求三个数的最大值
        int aa = 5,bb = 10,cc = 15;


        int maxNum = (aa > bb)? aa : bb;
        maxNum = (maxNum > cc)? maxNum : cc;
        System.out.println("maxNum=" + maxNum);




        //下面的写法不建议（三元运算符的嵌套使用）
        int maxNum2 = (((aa > bb)? aa : bb) > cc)? ((aa > bb)? aa : bb) : cc;
        System.out.println("maxNum2=" + maxNum2);
    }
}
