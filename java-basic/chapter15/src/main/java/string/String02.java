package string;

/**
 * Author:ZJF
 * Date:2020-12-28 下午4:22
 */
public class String02 {

    public static void main(String[] args) {

        String a = "hello"; //指向常量池
        String c = "hello";
        System.out.println(a==c);//true
        //1. 当 a + b
        //2. 先创建StringBuilder对象
        //3. 使用StringBuilder 的 append 拼接
        //4. c 指向 堆的

        String b = "world";//指向常量池
        String d = a + b;

        System.out.println(a==c);//true
        System.out.println(a.equals(c));

        System.out.println(d);

    }
}
