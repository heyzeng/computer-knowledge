package Date;

import java.util.Calendar;

/**
 * Author:Jude
 * Date:2021-08-02 下午11:34
 */
public class DateGen02 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c + " " + c.getClass());

        //格式化
        //说明: Calender 没有专门的格式化方法，所以需要程序员自己来组合显示
        //中国人 yyyy-MM-dd hh:mm:ss
        System.out.println(c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1)
                + "-" + c.get(Calendar.DAY_OF_MONTH) + " " + c.get(Calendar.HOUR_OF_DAY)
                + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
    }
}
