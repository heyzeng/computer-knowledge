package practice;

/**
 * Author:Jude
 * Date:2020-12-01 上午9:21
 */
public class VarScopeTest {

    public static void main(String[] args) {

        A a = new A();
        a.m1();
        a.m2();
        a.m3();
    }
}


class A {
    int num = 10;//属性
    int age;  //默认0

    public void m1() {
        int total = 30; //局部变量
        System.out.println(num);
    }

    public void m2() {
        //不能使用total
        System.out.println(num);
    }

    public void m3() {
        //全局变量可以不赋值，直接使用，因为有默认值，局部变量必须赋值后，才能使用，因为没有默认值
        System.out.println(age);
        int personNum = 9; //局部变量
        System.out.println(personNum);
    }}
