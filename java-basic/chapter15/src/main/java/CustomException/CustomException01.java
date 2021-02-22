package CustomException;

/**
 * Author:ZJF
 * Date:2021-01-28 上午9:48
 */
public class CustomException01 {
    public static void main(String[] args) {

        int age = 200;

        try {
            if (!(age >= 1 && age <= 100)){
                throw new AgeException("不合理");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

//自定义异常
class AgeException extends Exception{

    private static final long serialVersionUID = 1L;

    public AgeException(String message) {
        super(message);
    }
}

