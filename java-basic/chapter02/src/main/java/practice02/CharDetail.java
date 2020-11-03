package practice02;

public class CharDetail {
    public static void main(String[] args) {

        char a = '男';
        System.out.println(a);

        //使用注意点
        //字符常量是用单引号(‘ ’)括起来的单个字符

        //  在java中，char的本质是一个整数，在输出时，是unicode码对应的字符
        //  字符 <------>  数
        char b = '韩';
        System.out.println("b = " + b);
        System.out.println("b = " + (int)b);//韩 -> 对应数字

        //可以直接给char赋一个整数，然后输出时，会按照对应的unicode 字符输出
        char c4 = 74;
        System.out.println("c4=" + c4); // J
        System.out.println("c4=" + (int)c4); // 74

        //char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode码
        char c5 = 'a';
        System.out.println((int)c5); // a = 97
        System.out.println(c5 + 100); // 97+100

    }
}
