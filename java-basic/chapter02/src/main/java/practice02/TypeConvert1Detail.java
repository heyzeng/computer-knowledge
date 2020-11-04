package practice02;


public class TypeConvert1Detail {

    public static void main(String[] args) {


        //基本使用
        char c1 = 'a';
        int i = c1; // char -> int
        long l = c1; // char -> long


        byte b1 = 1;
        short s1  = b1; //byte ->short

        double d1 = 1.1;
        int i1 = 1;
        //float res = d1 + n2; //错误  double -> float
        double d2 = d1 + i1;

        double d22 = 1.1;
        //int n3 = d22; //错误

        int i22 = 1;
        //byte b2 = i; // 错误 byte -> int

        //(byte, short) 和 char之间不会相互自动转换

        byte b3 = 2;
        //char c3 = b3; // byte 和 char 没有自动转换

        //byte，short，char  他们三者可以计算，在计算时首先转换为int类型。

        byte b4 = 1;
        short s2 = 1;

        //short i2 = b4 + s2; // 错误 int -> short


    }
}
