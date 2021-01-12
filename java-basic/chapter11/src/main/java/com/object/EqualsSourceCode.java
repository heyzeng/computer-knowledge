package com.object;

/**
 * Author:ZJF
 * Date:2021-01-12 上午9:31
 */
public class EqualsSourceCode {
    public static void main(String[] args) {

        /*
		 * 说明
		 * 1. 只能判断引用类型
		 * 2. 判断的是地址是否相等
		 * 3. 子类中往往重写该方法,比如 String, Integer ...
		 * public boolean equals(Object obj) {
        		return (this == obj);
    		}
		 *
		 */
        Object o = new Object();

        String string1 = new String("hello");
        String string2 = new String("hello");

        System.out.println(string1 == string2);//false

        /**
         *  String 子类重写了 Object 的equals, 变成 判断两个字符串内容是否相同
         *
         *  public boolean equals(Object anObject) {
         *         if (this == anObject) { //如果是同一个对象 返回 T
         *             return true;
         *         }
         *         if (anObject instanceof String) { //判断类型
         *         // 下面就是判断 两个字符串的 每个字符是否相同, => 即判断两个字符串内容是否相同
         *             String anotherString = (String)anObject;
         *             int n = value.length;
         *             if (n == anotherString.value.length) {
         *                 char v1[] = value;
         *                 char v2[] = anotherString.value;
         *                 int i = 0;
         *                 while (n-- != 0) {
         *                     if (v1[i] != v2[i])
         *                         return false;
         *                     i++;
         *                 }
         *                 return true;
         *             }
         *         }
         *         return false;
         *     }
         */
        System.out.println(string1.equals(string2));//true


        Integer integer = new Integer(100);
        Integer integer2 = new Integer(100);

        /**
         *  public boolean equals(Object obj) {
         *         if (obj instanceof Integer) {
         *             return value == ((Integer)obj).intValue();
         *         }
         *         return false;
         *     }
         */
        System.out.println(integer.equals(integer2));


    }
}
