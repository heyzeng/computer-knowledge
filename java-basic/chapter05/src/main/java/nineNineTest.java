

public class nineNineTest {
    public static void main(String[] args) {

        /*
            九九乘法口诀
        	1 * 1 = 1
	        1 * 2 = 2  2 * 2 = 4
	        1 * 3 = 3  2 * 3 = 6  3 * 3 = 9
         */
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j + " * " + i + " = " + i*j + "  ");

            }
            System.out.println();//换行

        }

    }
}
