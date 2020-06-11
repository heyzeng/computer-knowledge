/*

	变量的分类 - 按数据类型分

			基本数据类型
					整型：byte（1字节 -128 ~ 127） short（2字节） int（4字节） long（8字节）
					浮点型: float(4字节) double（8字节）
					字符型：char(2字节)
					布尔类型 ：boolean(一般忽略大小，因为只有两个值true和false)

			引用数据类型 ：类 ，接口， 数组
*/

public class varTest2{


    public static void main(String[] args){

		/*
		下面的代码错误 ： 变量应该先声明再使用
		number = 20;

		int number;
		*/

        //整型 ： byte（1字节 -128 ~ 127） short（2字节） int（4字节） long（8字节）
        byte number = 127;
        short s = 130;
        //在开发中一般使用int类型
        int num = 20;
        long num2 = 10000L; //long类型的值后面需要加上"l"或"L",一般不使用"l"
        System.out.println(number);


        System.out.println("-------------------------------------------");

        //浮点型: float(4字节) double（8字节）

        float f = 12.3f; //float类型的值后面需要加"f"或"F"
        System.out.println(f);

        double d = 12.3; //double类型的值后面可以加"d"或"D"
        d = .5; //0.5
        System.out.println(d);

        System.out.println("-------------------------------------------");

        //字符型：char(2字节)
        //第一种
        char c = 'a'; //只能放一个字符
        c = '中';
        c = 'ほ';

        //第二种
        c = '\t';
        //System.out.println("aaa" + c + "bbb"); //和"aaa\tbbb"是一样的

        //第三种
        c = '\u0056'; //将\u0056对应的字符赋值给c

        c = 56; //将unicode值为56所对应的字符赋值给了c
        System.out.println(c);


        System.out.println("-------------------------------------------");
        //布尔类型 ：boolean(一般忽略大小，因为只有两个值true和false)
        boolean boo = false;
        System.out.println(boo);
    }
}

