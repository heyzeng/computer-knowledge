package string;

/**
 * Author:ZJF
 * Date:2020-12-28 下午4:29
 */
public class String03 {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        String s = new String("");
        for (int i = 0; i < 80000; i++) {
            s +="Hello";
        }

        long end = System.currentTimeMillis();

        System.out.println("cost time " + (end - start));
    }
}
