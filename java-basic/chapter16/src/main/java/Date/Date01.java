package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author:Jude
 * Date:2021-07-27 下午11:50
 */
public class Date01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println("====");

        //使用SimpleDateFormat 进行格式化输出
        //解读
        //1. "yyyy年MM月dd日 hh:mm:ss E" 各个字母是格式化符合
        //2. 不是乱写的，是规定好
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd  HH-mm-ss E");
//        System.out.println(simpleDateFormat);
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        //第二种用法
        //通过一个毫秒，得到对应的日期
        Date date1 = new Date(100000000L);
        System.out.println(date1);
        System.out.println(simpleDateFormat.format(date1));

        //第三种使用，将一个String 格式化 转成Date 对象
        //注意 s 格式需要 和 sdf 格式匹配，否则ParseException
        String s = "1996-01-01  10-20-30 星期一";
        try {
            Date parse = simpleDateFormat.parse(s);
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
