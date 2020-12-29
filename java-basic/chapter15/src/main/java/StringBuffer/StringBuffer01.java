package StringBuffer;

/**
 * Author:ZJF
 * Date:2020-12-28 下午4:34
 */
public class StringBuffer01 {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        StringBuffer s = new StringBuffer("");
        for (int i = 0; i < 80000; i++) {
            s.append("hello");
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时=" + (end - start) + " length=" + s.length());

        String str  = null;
        StringBuffer sb = new StringBuffer();
        StringBuffer append = sb.append(str);
        System.out.println(append + " " + append.length()); //null 4

    }
}
