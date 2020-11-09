package practice05;


public class HomeWork06 {

    public static void main(String[] args) {


			/*
			打印 99 乘法表

			分析
			1. 使用 i  控制行 9行
			2. 使用 j 控制 列 1行-1列 2 - 2 3 - 3
			3. 有一个拆解思想[化繁为简]
			*/

        for (int i = 1; i < 10; i++) { //控制行

            for (int j = 1; j <= i; j++) { //控制列

                System.out.printf("%d * %d = %d\t",j,i,i*j);

            }
            System.out.println();

        }
    }
}
