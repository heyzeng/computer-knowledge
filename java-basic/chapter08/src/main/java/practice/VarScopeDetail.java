package practice;

/**
 * Author:Jude
 * Date:2020-12-01 上午9:06
 */
public class VarScopeDetail {

    public static void main(String[] args) {

        AAA aaa = new AAA();
        aaa.m1();
    }
}

class AAA{

    private int num = 10;
    int age;

    public void m1(){
        //属性全局变量和局部变量可以重名，访问时遵循就近原则
    int sum = 101;
        System.out.println(sum);
    }

    public void m2() {
        String name = "tom";

    }
    public void m3() {
        String name = "jack";
    }
    public void m4() {
        Person p = new Person();

    }

}

class Person_{
    String name;
}

