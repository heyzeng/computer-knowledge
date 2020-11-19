package practice;


import java.sql.SQLOutput;

public class MethodDetail {

    public static void main(String[] args) {

        Cat cat = new Cat();

        System.out.println( cat.M(1));

        //数组要遍历
        int[] m2 = cat.M2(1, 3);
        for (int i = 0; i < m2.length; i++) {
            System.out.println(m2[i]);
        }

        System.out.println(cat.M3());

        B b = new B();
        b.sayHello();


    }
}


class B{
    public void sayHello(){
        A a = new A();
        a.sayHi();
    }

}

class A{

    public void sayHi(){
        System.out.println("hello");
    }


}

class Cat{
    //一个方法至多有一个返回值  [思考，如何返回多个结果, 数组.]
    public int M(int a){
        return a * 2;
    }


    public int[] M2(int n1 ,int n2){

        int[] ints = new int[2];
        ints[0] = n1 + n2;
        ints[1] = n1 - n2;
        return ints;
    }

    //如果方法有返回值，则方法体中最后的执行语句必须为return语句，
    //而且要求返回类型必须和return的值类型一致或兼容
    public int M3(){
        return (int)1.1;
    }

    ////如果方法没有返回值，则方法体中可以没有return语句，返回类型要求写void
    public void M4(){

    }


    //参数类型可以为任意类型，包含基本类型或引用类型
    public void M5(int a, double b, int[] c){

    }

    //调用带参数的方法时，一定对应着参数列表传入相同类型或兼容类型 的参数！
    public void m6(int n1, double d1, int[] arr) {
        //方法体.
        //调用其他方法...
    }


    //方法不能嵌套定义

    public void m7(){
//        public void m8(){
//
//        }
    }

}
