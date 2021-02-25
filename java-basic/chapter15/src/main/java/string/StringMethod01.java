package string;

/**
 * Author:ZJF
 * Date:2021-02-23 下午7:38
 */
public class StringMethod01 {
    public static void main(String[] args) {

        String name = "Jude";

        // 1.equalsIgnoreCase 忽略大小写的判断内容是否相等
        if (name.equalsIgnoreCase("JUDE")){
            System.out.println("success");
        }else {
            System.out.println("fail");
        }

        // 2.length 获取字符的个数，字符串的长度
        System.out.println("aa李".length());//3

        // 3.indexOf 获取字符在字符串对象中第一次出现的索引，索引从0开始，如果找不到，返回-1
        System.out.println(name.indexOf("J"));//0

        // 4.lastIndexOf 获取字符 在字符串中最后一次出现的索引，索引从0开始，如果找不到，返回-1
        String a = "@@@";
        int index = a.lastIndexOf("@");
        System.out.println(index);

        // 5.substring 截取指定范围的子串
        String username = "hello,张三丰";
        System.out.println(username.substring(6));
        System.out.println(username.substring(0,5));


    }
}
