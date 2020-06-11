

/*


	强制类型转换：自动类型提升的逆过程 （小容量和大容量的变量做运算结果用小容量的变量来接收）

	格式 ：(强转的类型)

	注意：使用强制类型转换可能会损失精度

*/
public class varTest4{

    public static void main(String[] args){

        int a = 128;
        //使用强制类型转换符(byte)
        byte b2 = (byte)a;
        System.out.println(b2);

        float f = 12.3f;
        int number = (int)f;
        System.out.println(number);


        System.out.println("-----------------------------------");

        byte by = 20;
        int num = (int)by; //小容量赋值给大容量，即使加上强制类型转换符也不会报错。
        System.out.println(num);

    }
}
