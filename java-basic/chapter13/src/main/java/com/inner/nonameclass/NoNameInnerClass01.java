package com.inner.nonameclass;

/**
 * Author:ZJF
 * Date:2021-01-20 上午10:08
 */
public class NoNameInnerClass01 {
    public static void main(String[] args) {

        Cat cat = new Cat() {
        };

        //匿名内部类的第一种使用方式
        //解读
        //1. aa 编译类型就是 AA
        //2. aa 的运行类型
		/*
		 	AA() {
			@Override
				public void cry() {
					// TODO Auto-generated method stub
					System.out.println("A cry...");
				}
			}
			就是实现了 A接口的一个子类(无名)
		 */
        //3. 匿名内部类，是一个类，同时也是一个对象
        new AA(){
            @Override
            public void cry() {
                System.out.println("cry");
                cry();//无限递归，死循环
            }
        }.cry();

    }
}

class Outer {

    public void method() {
        AA aa = new AA() {
            @Override
            public void cry() {

            }
        };

        new AA(){
            @Override
            public void cry() {

            }
        }.cry();

        Father jim = new Father("Jim"){
            @Override
            public void test() {
                super.test();
            }
        };

    }
}

interface AA { //接口
    public void cry();
}

class Father {//类

    public Father(String name) {
        super();
        // TODO Auto-generated constructor stub
    }

    public Father() {

    }


    public void test() {
        System.out.println("原test");
    }
}

class Cat {

}
