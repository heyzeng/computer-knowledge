/*
	String(引用数据类型)与基本数据类型(8种)间的运算
	1.String与基本数据类型只能做连接运算。
	2.String与基本数据类型做运算结果还是String
*/
public class varTest6 {
    public static void main(String[] args){

        //第一种赋值方式
        String s = "hello";
        //第二种赋值方式(现了解即可，但后面需要掌握)
        String s2 = new String("java");

        System.out.println(s);
        System.out.println(s2);

        System.out.println("------------------------------");

        String str = "hello";
        boolean boo = true;
        // + :连接运算符
        String str2 = str + boo;

        int a = 100;
        str2 = str + a;

        System.out.println(str2);
        System.out.println(str + a);

		/*
		int aa = 50;
		int bb = 100;
		int cc = aa + bb;
		System.out.println(cc);
		System.out.println(aa + bb);
		*/

        System.out.println("-------------------练习------------------");

        String st = "圆圆";
        char ch = 'a'; //97
        int number = 100;

        System.out.println(st + ch + number); //圆圆a100
        System.out.println(number + ch + st); //197圆圆
        System.out.println(st + (ch + number)); //圆圆197
        System.out.println(st + number + ch); //圆圆100a

		/*
		int aa = 10,bb = 20;
		//byte by2 = (byte)aa + (byte)bb; 错误的，因为两个byte相加会先提升为int
		byte by2 = (byte)(aa + bb);
		System.out.println(by2);
		*/
    }

}
