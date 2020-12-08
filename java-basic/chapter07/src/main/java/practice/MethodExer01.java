package practice;

/**
 * Author:Jude
 * Date:2020-12-08 上午9:28
 */
public class MethodExer01 {

    public static void main(String[] args) {

        AAA aaa = new AAA();
        aaa.len = 10;
        aaa.width = 100;
        double calculateArea = aaa.calculateArea();
        System.out.println(calculateArea);

        double calculateArea2 = aaa.calculateArea2(10, 200);
        System.out.println(calculateArea2);

        aaa.toPrintArea();
        aaa.toPrintArea2(100,10);

    }
}

class AAA{

    int width;
    int len;

    // 无返回值。可以访问属性值
    public double calculateArea(){
        System.out.println(width);
        System.out.println(len);
        return width * len;
    }

    // 可以传参
    public double calculateArea2(int myWidth,int myLen){
        return myWidth * myLen;
    }

    public void toPrintArea(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void toPrintArea2(int m,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
