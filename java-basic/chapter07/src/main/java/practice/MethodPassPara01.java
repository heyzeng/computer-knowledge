package practice;

//基本数据类型传递
public class MethodPassPara01 {

    public static void main(String[] args) {

        T2 t2 = new T2();

        int a = 10;
        int b = 20;
        t2.swap(a,b);
        System.out.printf("a=%d b=%d\n", a, b);


    }
}

class T2{

    public void swap(int num1, int num2){

        int temp = 0;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.printf("num1=%d num2=%d\n", num1, num2);
    }
}
