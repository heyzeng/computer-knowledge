

/*

	变量间的运算

		基本数据类型间的运算（7种不包括boolean）

				自动类型提升：小容量的变量和大容量的变量做运算结果用大容量的变量来接收。

					byte,short,char -> int -> long -> float -> double

					注意 ：1.容量指的是表数范围。
						   2. byte,short,char三者之间做运算，三者会先提升为int再运算

				强制类型转换 :自动类型提升的逆过程（详见VarTest4.java）

		String与基本数据类型间的运算 (详见VarTest6.java)

*/
public class varTest3{

    public static void main(String[] args){

        //基本数据类型间的运算
        int a = 10;
        byte b = 20;
        //int类型和byte类型做运算，结果用int类型来接收。因为int类型比byte类型的范围要大。
        int c = a + b;


        long number = 20L;
        float number2 = 12.3f;
        float number3 = number + number2;

		/*
		下面的代码错误 ： byte,short,char三者之间做运算，三者会先提升为int再运算
		short s = 100;
		char cc = 'a';
		short cc2 = s + cc;
		*/

        short s = 100;
        //'a'对应的unicode值是97   'A'对应的unicode值是65
        char cc = 'a'; //char和short在做运算时，会将'a'对应的unicode值去做运算
        int cc2 = s + cc; //197

        System.out.println(cc2);

    }
}






