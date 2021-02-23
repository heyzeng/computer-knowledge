package CustomException;

/**
 * Author:ZJF
 * Date:2021-02-22 下午8:02
 */
public class CustomException02 {
    public static void main(String[] args) {

        int i = -1;

        try {
            if (i < 0){
                throw new NegativeException("抛出异常");
            }
        } catch (NegativeException e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
编写应用程序，接收一个数，要求不能输入负数，进行异常处理。要求使用继承 RuntimeException 来实现，注意体会和继承Exception 有什么不同。
*/
class NegativeException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public NegativeException(String message) {
        super(message);
    }
}
