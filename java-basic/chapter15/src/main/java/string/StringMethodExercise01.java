package string;

/**
 * Author:ZJF
 * Date:2021-03-09 下午7:36
 */
public class StringMethodExercise01 {
    public static void main(String[] args) {

        String email = "12@qq.com";
        System.out.println(isEmail(email));

        String s = "    hello world   ";
        System.out.println(MyTrim(s));



    }


    /*
     * 判断邮箱是否合法，要求里面必须包含@和. 而且 @ 必须在. 的前面 案例：不使用系统提供的trim
     * 方法，自己写一个myTrim方法，去除字符串两端的空格，比如 "     hello world   " => 返回 “hello world”
     *
     */

   // 判断邮箱是否合法，要求里面必须包含@和. 而且 @ 必须在. 的前面
   // 通过下标索引判断
    public static boolean isEmail(String email){
        int index1 = email.indexOf("@");
        int index2 = email.indexOf(".");
        return index1 < index2 && index1 > 0;
    }

    //自己写一个myTrim方法，去除字符串两端的空格，比如 "     hello world   " => 返回 “hello world”
    public static String MyTrim(String text){
        int left = -1;
        int right = text.length();
        while (text.charAt(left + 1) ==' ')
        left += 1;

        while (text.charAt(right -1) == ' ')
        right -=1;

        return text.substring(left + 1 ,right);
    }
}

