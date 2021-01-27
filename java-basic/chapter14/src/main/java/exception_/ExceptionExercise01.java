package exception_;

/**
 * Author:ZJF
 * Date:2021-01-25 下午4:14
 */
public class ExceptionExercise01 {

    public static int method() {
        int i = 1;
        try {
            i++; // 2
            String[] names = new String[3];
            if (names[1].equals("john")) { // 空指针异常
                System.out.println(names[1]);
            } else {
                names[3] = "lucy";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return ++i; // 不是立即返回 i= i+1 = 3 temp = 3
        } finally {
            ++i; // 4
            System.out.println("i=" + i);// 4
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
