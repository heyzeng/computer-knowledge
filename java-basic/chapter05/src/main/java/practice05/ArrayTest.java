package practice05;


public class ArrayTest {

    public static void main(String[] args) {


		/*
		一个养鸡场有6只鸡，它们的体重分别是3kg,5kg,1kg,
        3.4kg,2kg,50kg 。请问这六只鸡的总体重是多少?平
        均体重是多少? 请你编一个程序。
		*/

        double[] ch = {3,5,1,3.4,2,50};

        //遍历数组求和 在除总数
        double sumCh =0.0;

        for (int i = 0; i < ch.length; i++) {

            sumCh += ch[i];
        }

        System.out.printf("平均体重是%.3f",sumCh/ch.length);
    }
}
