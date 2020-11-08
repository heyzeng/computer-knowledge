package practice05;


public class HomeWork01 {

    public static void main(String[] args) {

        // 输出1-100之间的不能被5整除的数，每5个一行
        //思路分析
		/*
		化繁为简
		1. 1-100 输出
		2. 不能被5整除的数
		3. 每5个一行 : 如果统计到了 5 个，我们就换行 => int count
		*/

        int count = 0;
        for (int i = 1; i <101; i++) {

            if (i % 5 != 0){
                System.out.print(i + "\t");
                count++;
                if (count % 5 == 0){
                    System.out.println();
                }
            }

        }
    }
}
