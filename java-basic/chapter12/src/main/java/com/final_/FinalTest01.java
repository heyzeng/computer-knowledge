package com.final_;

/**
 * Author:ZJF
 * Date:2021-01-14 上午8:41
 */
public class FinalTest01 {
}

//当不希望类被继承时,可以用final修饰
final class A {

}
//class B extends A {
//
//}

class C {
    public void m1() {

    }
    //当不希望父类的某个方法被子类覆盖/重写(override)时,可以用final关键字修饰
    public final void m2() {

    }
}

class D extends C {
    @Override
    public void m1() {
        // TODO Auto-generated method stub
        super.m1();
    }

//	public void m2() {
//		// TODO Auto-generated method stub
//		super.m2();
//	}
}

class E {
    //当不希望类的的某个属性的值被修改,可以用final修饰
    private final double TAX_RATE = 0.08;

//	public void f1() {
//		tax_rate = 0.01;
//	}

    public void f2() {
        //当不希望某个局部变量被修改，可以使用final修饰
        final int n = 10;
        //n = 30;
    }
}
