

/*
	赋值运算符 ：=
	扩展赋值运算符： +=, -=, *=, /=, %=

*/
public class SetValueTest{

    public static void main(String[] args){

        int a = 10;

        a += 1; //可以理解成 a = a + 1;

        System.out.println("a=" + a);

        System.out.println("--------------------------------------");

        //[面试题]
        byte b = 10;

        //编译错误 ：因为byte类型和int类型做运算时，byte类型会提升为int类型所以结果用int来接收
        //b = b + 1;

        b += 1; //不会改变原来的数据类型

        System.out.println("b=" + b);

        System.out.println("--------------------------------------");

        int i = 1;
        i *= 0.1;//I =(int)( i*0.1);
        System.out.println("i=" + i);//0

        i++;
        System.out.println(i);//1



    }
}
