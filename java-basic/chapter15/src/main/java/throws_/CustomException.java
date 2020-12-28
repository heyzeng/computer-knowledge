package throws_;

/**
 * Author:Jude
 * Date:2020-12-26 上午11:48
 */
public class CustomException {

    public static void main(String[] args) throws Exception {

        int age = 200;

        try {
            if (!(age >=1 && age <= 100)){
                throw new AgeException("不在1~100这个范围");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

//自定义异常
class AgeException extends Exception{
    
    public AgeException(String s) {
        super(s);
    }
}
