package com.java;
/*

 	可变形参：形参的个数是可变的。

 	格式 ：方法名(int ... numbers)

 	说明：
 		1.可变形参的个数可以是0个1个或多个。
 		2.可变形参的底层就是一个数组，使用方式和使用数组一样
 		3.在两个方法中如果可变形参的类型（形参）和数组的类型（形参）相同，那么这两个方法不构成重载
 		4.如果一个方法的形参列表中有多个形参，那么可变形参必须放在形参列表的最后一个。
 		5.一个方法中最多只能有一个可变形参。而且可变形参必须放在形参列表的最后一个
 */

public class MoreArgsTest {
    public static void main(String[] args) {

        MoreArgsTest moreArgsTest = new MoreArgsTest();
        moreArgsTest.add(1,3);
        moreArgsTest.add(1,4,4,7,7,7,7,7,7,7);

    }

    //可变形参的个数可以是0个1个或多个。
    public void add(int...numbers){////声明了一个可变形参
        //可变形参的底层就是一个数组，使用方式和使用数组一样
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
    //如果一个方法的形参列表中有多个形参，那么可变形参必须放在形参列表的最后一个。
    public void add(String str, double... numbers) { //声明了一个可变形参

    }
//一个方法中最多只能有一个可变形参。而且可变形参必须放在形参列表的最后一个
	/*
	public void add(int ... numbers,int ... numbers2){ //声明了一个可变形参

	}
	*/


	/*
	 * 在两个方法中如果可变形参的类型和数组的类型相同，那么这两个方法不构成重载
	public void add(int[] numbers){
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println(sum);
	}
	*/


	/*
	//需求：求两个数的和
	public void add(int a,int b){

	}
	//需求：求三个数的和
	public void add(int a,int b,int c){

	}
	*/

    //需求：求一百个数的和

}
