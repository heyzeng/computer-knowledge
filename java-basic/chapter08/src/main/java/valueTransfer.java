

/*
 	值传递：

 		形参：方法声明时的参数
		实参：方法调用时实际传给形参的参数值


		1.在调用方法时如果传递的是基本数据类型，那么传递的是变量中的具体的值。
		2.在调用方法时如果传递的是引用数据类型，那么传递的是该对象的地址值。

 */
public class valueTransfer {
    public static void main(String[] args) {


        valueTransfer valueTransfer = new valueTransfer();

        //需求：交换两个变量中的值
        int m = 10, n = 5;
        //调用方法
        valueTransfer.swapData(m, n);

        System.out.println("m=" + m + " n=" + n);

        System.out.println("----------------------------------------------");

        Number number = new Number();
        number.m = 10;
        number.n = 5;
        System.out.println("交换前number.m=" + number.m  + " number.n=" + number.n);
        //交换数据
       valueTransfer.swapData(number);

        System.out.println("交换后number.m=" + number.m  + " number.n=" + number.n);

    }


    public void swapData(Number number){
        int temp = number.m;
        number.m = number.n;
        number.n = temp;
    }

    public void swapData(int a,int b){
        System.out.println("a" + a + " b=" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a" + a + " b=" + b);
    }
}

class Number{
    int m;
    int n;
}