package practice;


public class MethodExer04 {

    public static void main(String[] args) {

        T t = new T();
        t.toPrint(9,9);




    }
}


//打印9*9

class T{

    public void toPrint(int n1, int n2){

        for (int i = 1; i <= n1; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.printf("%d * %d = %d ",j,i,j*i);
            }
            System.out.println();
        }
    }
}
