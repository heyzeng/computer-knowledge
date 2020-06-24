

/*


	嵌套循环 ： 一个循环a作为另一个循环b的循环体。那么a循环叫做内层循环。b叫做外层循环。


	执行的总次数 = 外层循环的次数 * 内层循环的次数


	可以理解成 ：外层循环控制行，内层循环控制列



*/
public class forForTest {
    public static void main(String[] args) {

      /*
		输出
							i(行)    j（#）   k(*)
			####*			1		 4			1
			###* *			2		 3			2
			##* * *			3		 2			3
			#* * * *		4		 1			4
			* * * * *		5		 0			5
		*/

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");

            }

            System.out.println();//换行

        }


    }
}
