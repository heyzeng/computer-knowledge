

/*

	进制的表示方式 ：

	二进制：0,1 ，满2进1.以0b或0B开头。
	十进制：0-9 ，满10进1.
	八进制：0-7 ，满8进1. 以数字0开头表示。
	十六进制：0-9及A-F，满16进1. 以0x或0X开头表示。此处的A-F不区分大小写。
			如：0x21AF +1= 0X21B0


	数字在底层以二进制方式的表示方式：
		1.所有数字在计算机底层都以二进制形式存在。
		2.计算机以补码的形式保存所有的整数。
		3.正数的原码、反码、补码都相同(三码合一)

		4.负数：
			原码：直接将一个数值换成二进制数。最高位是符号位
			负数的反码：是对原码按位取反，只是最高位（符号位）确定为1。
			负数的补码：其反码加1。


	位运算符：
		左移 << : 在一定的范围内，每向左移一位原来的数乘以2
		右移 >> : 在一定的范围内，每向右移一位原来的数除以2

		右移 >>： 如果是正数，那么最高位用0补.如果是负数，那么最高位用1补
		无符号右移 >>>：无论是正数还是负数，最高位都用0补
*/
public class BitTest {
    public static void main(String[] args){
        int number = 10; //二进制

        number = 010; //八进制

        number = 0x10;//十六进制

        System.out.println(number);


        int a = 128;
        byte b = (byte)a;
        System.out.println(b);

        System.out.println("-----------------------------");

        System.out.println(3 << 1 ); //6
        System.out.println(3 << 2 ); //12
        System.out.println(3 << 3 ); //24

        System.out.println(1 << 31);

        System.out.println("-------------------------------");

        System.out.println(24 >> 1); //12
        System.out.println(24 >> 2); //6
        System.out.println(24 >> 3);//3

        //右移 ： 如果是正数，那么最高位用0补.如果是负数，那么最高位用1补
        System.out.println(3 >> 1);// 1
        System.out.println(-6 >> 1);// -3
        //无符号右移 ：无论是正数还是负数，最高位都用0补
        System.out.println("--------------无符号右移-----------------");
        System.out.println(3 >>> 1);//
        System.out.println(-6 >>> 1);//

    }
}
