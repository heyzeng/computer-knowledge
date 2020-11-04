package practice02;



public class TypeConvert2Detail {

    public static void main(String[] args) {

        //把小数点后面，全部去掉
        int i = (int)1.99;
        System.out.println(i);


        int j = 10000; // 如果j 大了，就有数据溢出
        byte j1 = (byte)j;
        System.out.println(j1); //16


        //强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
        int res = (int)(10 * 3.5 + 6 * 1.5);
        System.out.println("res=" + res);


        //强制转换，并不会对原来的变量的数据类型有任何影响

        double d = 1.1;
        int k = (int)d;

        //d的数据类型仍然是 double!!!!


        //char类型可以保存 int的常量值，但不能保存int的变量值，需要强转
        //	int n = 1;
        //	char c = n; //当代码执行到这里 , n 是已经有空间

        //下面的逻辑
        //(1) 1 是一个具体值
        //(2) 编译器先判断 1 是否能够保存到 char 范围类, 如果可以，则通过，否则，就不通过
        char c2 = 6553;

    }
}
