package com.codeblock;

/**
 * Author:ZJF
 * Date:2021-01-14 上午8:45
 */
public class CodeBlockDetail2 {
    public static void main(String[] args) {

        new DDD();
    }
}

//(1) getNUm 被调用 (2) DDD 的静态代码块...(3) DDD 的普通代码块..(4)getTotal 被调用(5)DDD 构造器..

class DDD  {

    public static int num = getNum();//1
    public String name = "tom";

    //普通的代码块，可以调用任意成员
    {
        System.out.println(num);
        System.out.println(name);
        System.out.println(getTotal());
    }

    //静态代码块，只能调用静态成员.
    static {
        System.out.println(num);
        //静态方法
    }

    {
        System.out.println("DDD 的普通代码块.."); // 3
    }
    public int total = getTotal(); //4
    static {
        System.out.println("DDD 的静态代码块..."); //2
    }

    public DDD() {
        System.out.println("DDD 构造器..");// 5
    }

    public static int getNum() {
        System.out.println("getNUm 被调用");
        return 10;
    }

    public int getTotal() {
        System.out.println("getTotal 被调用");
        return 50;
    }

}
