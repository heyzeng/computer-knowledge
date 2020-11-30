package practice;

/**
 * Author:Jude
 * Date:2020-11-30 下午8:30
 */
public class OverLoadTest {

    public static void main(String[] args) {

        MyPrint myPrint = new MyPrint();
        myPrint.print(10);
        myPrint.print(1,2,3);

    }
}

//要求：类名MyPrint，方法名为print，可以打印 等边三角形，矩形，立方体。示意

class MyPrint{

    public void print (int len) {
        System.out.printf("等边三角形 = %d",len);
    }

    public void print (int len,int width) {
        System.out.printf("矩形 = %d and %d",len,width);
    }

    public void print (int len, int width, int high){
        System.out.printf("长 = %d，宽 = %d , 高 = %d ",len,width,high);
    }
}
