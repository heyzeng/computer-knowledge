package practice02;


public class StringToBasicType {

    public static void main(String[] args) {

        //将str1 -> double
        //方法
        //1. 使用 包装类 Double 有一个方法 parseDouble()
        //2. 返回 结果是 double , 对str1 没有影响

        String str1 = "1223.5";
        double str2 = Double.parseDouble(str1);
        System.out.println(str2);


        String str3 = "100";
        int str4 = Integer.parseInt(str3);
        System.out.println(str4);


        String ss = "我爱你";
        //str4 ->  char => 理解成取出 字符串的第几位字符
        //注意，字符串的每个字符编号从 0开始
        char ss1 = ss.charAt(0);
        System.out.println(ss1);


        //在将String 类型转成 基本数据类型时，要确保String类型能够转成有效的数据，
        //比如 我们可以把 "123" , 转成一个整数，但是不能把 "hello" 转成一个整数\

        int aa = Integer.parseInt(ss);
        System.out.println(aa);

    }
}
