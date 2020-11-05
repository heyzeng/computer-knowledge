package practice03;


public class LogicOper {

    public static void main(String[] args) {

        //演示基本使用
        int score = 65;

        if(score > 300 || score < 100) { //只要有一个条件成立，为true
            System.out.println("ok1");
        }

        if(score > 63 | score < 3) { //只要有一个条件成立，为true
            System.out.println("ok2");
        }

        //演示区别
        int a = 3;
        int b = 10;
        if( a > 1 || b++ < 20) { //短路 或
            System.out.println("ok3");
        }
        System.out.printf("a = %d , b = %d\n", a, b); // a = 3, b = 10

        if( a > 1 | b++ < 20) { //逻辑 或
            System.out.println("ok4");
        }

        System.out.printf("a = %d , b = %d\n", a, b); // a = 3, b = 11


        // 取反的操作 !

        int n1 = 20;
        int n2 = 10;

        System.out.println(n1 > n2);  //true
        System.out.println(!(n1 > n2)); //false


        // 逻辑异或
        System.out.println( (4 < 1) ^ (6 > 3) ); //T


    }
}
