package practice04;


public class Exam04 {

    public static void main(String[] args) {

     //实现对三个整数进行排序，输出时按照从小到大的顺序输出。
        int n1 = 5, n2 = 3, n3 = 1;
        int temp = 0;

        if (n1 > n2){

            temp = n1;
            n1 = n2;
            n2 = temp;

        }

        if (n2 > n3){

            temp = n2;
            n2 =n3;
            n3 = temp;
        }

        if (n1 > n2){

            temp = n1;
            n1 = n2;
            n2 = temp;

        }
        System.out.printf("%d,%d,%d",n1,n2,n3);

    }
}
