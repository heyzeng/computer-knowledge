package extra1;

/*

 请输入第一个整数：10
 请输入第二个整数：5

 10 * 5 = 50
 10 + 5 = 15
 10 - 5 = 5
 10 / 5 = 2

 */
public class computerTest {
    public static void main(String[] args) {

        Test test = new Test();
        test.calculate(10,5);
    }
}

class Test{

    public void calculate(int a,int b){
        System.out.println(a*b);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
    }
}