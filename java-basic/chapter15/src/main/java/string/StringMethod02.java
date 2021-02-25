package string;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Author:ZJF
 * Date:2021-02-23 下午7:45
 */
public class StringMethod02 {
    public static void main(String[] args) {

        // 1.toUpperCase转换成大写
        String s = "heLLo";
        System.out.println(s.toUpperCase());

        // 2. toLowerCase
        System.out.println(s.toLowerCase());

        // 3.concat拼接字符串
        String s1 = "张无忌";
        String s2 = s1.concat("love").concat("赵敏");
        System.out.println(s2);

        // 4.replace 替换字符串中的字符
        s1 = "张无忌 and 赵敏 赵敏 赵敏 赵敏";
        String s3 = s1.replace("张无忌","his");
        System.out.println(s3);

        // 5.split 分割字符串, 对于某些分割字符，我们需要 转义比如 | \\等
        String poem = "鹅鹅鹅,曲项向天歌,白毛浮绿水,红掌拨清波";
        String[] s4 = poem.split(",");
        for (int i = 0; i < s4.length; i++) {
            System.out.println(s4[i]);
        }
        // 打印数组的方法
        System.out.println(Arrays.toString(s4));

        poem = "E:\\附加项目\\附加-project";
        String[] s5 = poem.split("\\\\");
        System.out.println(Arrays.toString(s5));//[E:, 附加项目, 附加-project]

        // 6.toCharArray 转换成字符数组
        s = "happy";
        char[] s6 = s.toCharArray();
        System.out.println(Arrays.toString(s6));

        // 7.compareTo 比较两个字符串的大小，如果前者大，则返回正数，后者大，则返回负数，如果相等，返回0
        String a = "jahn";
        String b = "jahy";
        int i = a.compareTo(b);
        System.out.println(i);

        // 8.format 格式字符串
        /*
         * 占位符有: %s 字符串 %c 字符 %d 整型 %.2f 浮点型
         *
         */
        String name = "john";
        int age = 10;
        double score = 98.3 / 3;
        char gender = '男';
        String info = String.format("我的姓名是%s 年龄是%d，成绩是%.2f 性别是%c. 希望大家喜欢我！", name, age, score, gender);
        System.out.println(info);
    }
}
