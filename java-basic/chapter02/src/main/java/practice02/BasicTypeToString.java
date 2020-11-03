package practice02;


public class BasicTypeToString {
    public static void main(String[] args) {

        int num = 100;
        float price = 30.5F;
        char name = '字';
        boolean boo = true;

        //说明
        //1. num + "" 结果是 String ,并赋给str1变量
        //2. num 本身没有影响
        String str1 = num + "";
        String str2 = price + "";
        String str3 = name + "";
        String str4 = boo + "";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3); // "字"
        System.out.println(str4); // "true"

        System.out.println(str1 + 100); //100100
        System.out.println(num + 100); //300


    }
}
