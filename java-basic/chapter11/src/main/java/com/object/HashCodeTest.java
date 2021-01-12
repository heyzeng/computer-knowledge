package com.object;

/**
 * Author:Jude
 * Date:2021-01-12 下午10:53
 */
public class HashCodeTest {
    public static void main(String[] args) {

        /*
		 *
		 * 两个引用，如果指向的是同一个对象，则哈希值肯定是一样的！
		   两个引用，如果指向的是不同对象，则哈希值是不一样的
		   * hashcode 的值是根据地址值算出来了、hash算法也会产生碰撞、则极小可能相等
		 */
        Object o = new Object();
        Object o1 = o;

        System.out.println(o.hashCode() + " " + o1.hashCode());

        Object o2 = new Object();
        System.out.println(o1.hashCode() + " " + o2.hashCode());
    }
}
