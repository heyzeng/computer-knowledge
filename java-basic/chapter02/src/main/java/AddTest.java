import java.util.Random;

public class AddTest {
    public static void main(String[] args) {

        //hello1003
        System.out.println("hello" + 100 +3);


        // 60% 的概率输出 YES，40% 的概率输出 NO
        System.out.println((new Random().nextInt() % 100) > 60 ? "YES" : "NO");
            }


}
