package enum_;

/**
 * Author:ZJF
 * Date:2021-01-22 上午9:07
 */
public class CustomEnum {
    public static void main(String[] args) {

        Gender2 boy = Gender2.BOY;
        Gender2 boy2 = Gender2.BOY;

        System.out.println(boy == boy2);
    }
}

enum Gender2{
    BOY,GIRL;
}
