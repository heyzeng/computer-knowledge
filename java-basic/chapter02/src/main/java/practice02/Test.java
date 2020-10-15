package practice02;




import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /**
         * 定义两个变量，分别保存键盘输入的两个整数【键盘输入可选，如果不用输入，可以直接用变量保存】
         *
         * 示例效果如下：
         *
         *
         * 请输入第一个整数：10
         * 请输入第二个整数：5
         *
         * *************************************
         *
         * 	    小小计算器
         *
         *
         * *************************************
         *
         *
         * 10 + 5 =15
         *
         * 10 - 5 = 5
         *
         * 10 * 5 = 50
         *
         * 10 / 5 = 2
         */
        int m = 10;
        int n = 5;
        //Scanner m = new Scanner(System.in);
        //Scanner n = new Scanner(System.in);

        System.out.println("*************************************\n");
        System.out.println("             小小计算器                 \n");
        System.out.println("*************************************");

        System.out.printf("%d + %d = %d\n",m,n,(m+n) );
        System.out.printf("%d - %d = %d\n",m,n,(m-n));
        System.out.printf("%d * %d = %d\n",m,n,(m*n));
        System.out.printf("%d / %d = %d\n",m,n,(m/n));


        /**
         * 定义变量保存 秒数，打印输出 xx小时xx分钟xx秒
         *
         * 思路：先转化为小时，然后分钟，然后秒
         */

        int seconds = 345678;
        int hour = seconds / 3600;
        int minute = (seconds /60) % 60 ;
        int second = seconds % 60;

        System.out.printf("%d小时%d分钟%d秒",hour,minute,second);


        int a=5+4; // 9
        int b=a*2; // 18
        int c=b/4; // 4
        int d=b-c; //16
        int e=-d; // -16
        int f=e%4; // -4
        double g=18.4; //18.4
        double h=g%4; // a-int(a/b)*b = 18.4 - int(18.4/4)*4=18.4 - 16 = 2.4
        int i=3; //3
        int j=i++; // j=3 i=4
        int k=++i; //k=5 i=5
        System.out.println("a="+a);
        System.out.println("b="+b);//
        System.out.println("c="+c);//
        System.out.println("d="+d);//
        System.out.println("e="+e);//
        System.out.println("f="+f);//
        System.out.println("g="+g); //
        System.out.println("h="+h);//
        System.out.println("i="+i);//
        System.out.println("j="+j);
        System.out.println("k="+k);


        int nn=3, mm=4; // 可以, 把相同类型的变量，放在一行定义.

        System.out.println("n<m is "+(nn<mm)); // true
        System.out.println("n=m is "+((++nn)==mm)); // nn= 4 mm = 4 true
        System.out.println("n>m is "+((++nn)>mm)); // nn =5 mm = 4 true
        System.out.println("n is "+nn);} //nn = 5
}

