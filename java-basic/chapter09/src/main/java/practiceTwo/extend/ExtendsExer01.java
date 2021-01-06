package practiceTwo.extend;

/**
 * Author:ZJF
 * Date:2021-01-06 上午10:45
 */
public class ExtendsExer01 {

    public static void main(String[] args) {
        C c = new C();

    }
}

class A{
    public A() {
        System.out.println("a的无参构造器");
    }
}

class B extends A{
    public B() {
        System.out.println("b的无参构造器");
    }

    public B(String name){
        System.out.println("b的有参构造器");
    }
}

class C extends B{
    public C(String name) {
        super("TOM");
        System.out.println("C的有参构造器");
    }

    public C() {
        this("hhh");
        System.out.println("C的无参构造器");
    }
}
