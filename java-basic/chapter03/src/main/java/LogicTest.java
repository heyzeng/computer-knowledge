

/*
     vip
 */
/*

	&―逻辑与  and       | ―逻辑或  or       ！―逻辑非
	&& ―短路与      || ―短路或        ^ ―逻辑异或

	&和&& : 两边同时为true结果才为true
	|和|| : 两边只要有true结果就为true
	! : 取反
	^ : 相同(运算符两边的boolean类型的值)为false,不同为true

	说明：
		1.逻辑运算符是对boolean类型的值进行运算的
		2.逻辑运算符的结果为boolean类型


	[面试题]&和&&，|和||的区别是什么？

*/
public class LogicTest{

    public static void main(String[] args){

		/*
		boolean boo = true;
		boolean boo2 = false;

		System.out.println(boo &  boo2); //false
		System.out.println(boo &&  boo2); //false
		System.out.println(boo |  boo2); //true
		System.out.println(boo ||  boo2); //true
		System.out.println(!boo2); //true
		System.out.println(boo ^  boo2);//true
		*/

        System.out.println("------------------------------------");


		/*

			&和&&的区别？（&和&& : 两边同时为true结果才为true）

				&和&& 左边的式子结果为true的时候，右边的式子都执行.(因为判断不出结果)
				&左边的式子结果为false时右边的式子仍然执行。
				&&左边的式子结果为false时右边的式子不再执行(因为根据左边的值就能判断出结果)。


		*/

		/*
		boolean boo = false;

		int a = 5;
		if(boo & a++ < 10){
			System.out.println("boo=" + boo);
		}
		System.out.println("a=" + a);


		int b = 5;
		if(boo && b++ < 10){
			System.out.println("boo=" + boo);
		}
		System.out.println("b=" + b);
		*/

        System.out.println("------------------------------------");

		/*
			|和||的区别？（|和|| :两边只要有true结果就为true ）

				|和|| 左边的式子结果为false的时候，右边的式子都执行.(因为判断不出结果)
				|左边的式子结果为true时右边的式子仍然执行。
				||左边的式子结果为true时右边的式子不再执行(因为根据左边的值就能判断出结果)。

		*/
        boolean boo = true;

        int a = 5;
        if(boo | a++ < 10){
            System.out.println("boo=" + boo);
        }
        System.out.println("a=" + a);


        int b = 5;
        if(boo || b++ < 10){
            System.out.println("boo=" + boo);
        }
        System.out.println("b=" + b);

    }
}
