package practice03;


public class AssignOper {

    public static void main(String[] args) {

        int a = 9;
        int b = 34;

        int temp = a;
        a = b;
        b = temp;

        System.out.printf("%d,%d",a,b);
    }
}
