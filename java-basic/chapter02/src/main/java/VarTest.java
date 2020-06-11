

/*

	变量 ：可以在同一类型范围内不断变化的量。（作用：用来存储数据）

	变量的格式 ： 变量的类型  变量名 = 变量值


	说明：
		 1.同一个作用域内的变量名不能相同
		 2.作用域 ：声明那个变量所在的那对大括号内
		 3.变量可以做运算
		 4.同一个变量可以被多次赋值，后一次赋值覆盖前一次赋值
		 5.变量应该先声明再使用
*/
public class VarTest{

    public void say(){

        int number2 = 80;
    }

    public static void main(String[] args){

        //声明一个变量并赋值
        int number = 20;

        //System.out.println(number); //输出变量名为number的那个值。


        //声明变量
        int number2;

        //注意 ：如果需要使用已经声明的变量，那么直接写上变量名即可。不要写成int number2 = 50
        number2 = 50;

        System.out.println(number2);

		/*
		下面的代码会发生错误 ： 同一个作用域中的变量名不能相同
		int number2 = 80;
		System.out.println(number2);
		*/

        System.out.println("------------------------------------------");



        int sum = number + number2; //变量可以做运算
        System.out.println(sum);


        System.out.println("------------------------------------------");

        int num = 50;
        //代码是从上向下依次执行
        System.out.println(num); //50

        num = 150; //同一个变量可以被多次赋值，后一次赋值覆盖前一次赋值

        System.out.println(num); //150


        System.out.println("------------------------------------------");

        int num2 = 100;

        num2 = num2 + 50; //将num2中的值取出和50做运算，然后再把结果赋值给num2

        System.out.println(num2); //150

        System.out.println("------------------------------------------");

        int n1 = 10,n2 = 20,n3 = 50; //同时声明了三个变量并给三个变量赋值
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        int nu1,nu2,nu3;
        //nu1 = 100;
        //nu2 = 200;
        //nu3 = 300;
        nu1 = nu2 = nu3 = 100;
        System.out.println(nu1);
        System.out.println(nu2);
        System.out.println(nu3);


    }
}
