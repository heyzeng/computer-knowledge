package Date;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Author:Jude
 * Date:2021-08-02 下午11:37
 */
public class DateGen03 {
    public static void main(String[] args) {

        //第三代日期的基本使用
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        System.out.println(now.getDayOfYear());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getMinute());

        // 格式化
        DateTimeFormatter ss = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
        
    }
}
