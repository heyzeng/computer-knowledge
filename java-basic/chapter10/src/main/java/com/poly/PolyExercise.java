package com.poly;

/**
 * Author:ZJF
 * Date:2021-01-11 上午9:28
 */
public class PolyExercise {
    public static void main(String[] args) {

        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}

class A {
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A {
    public int i = 20;

	 public int sum() {//注销?
	 return i + 20;
	 }
	public int getI() {
		return i;
	}

	public int sum1() {// 注销?
		return i + 10;
	}
}
