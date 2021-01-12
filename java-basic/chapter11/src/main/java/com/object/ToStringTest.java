package com.object;

/**
 * Author:Jude
 * Date:2021-01-12 下午10:56
 */
public class ToStringTest {
    public static void main(String[] args) {

        Object o = new String("hello");
        System.out.println(o.getClass());//class java.lang.String

        /**
         * public String toString() {
         *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
         *     }
         */
        System.out.println(o.hashCode() + " " + o.toString() + " " + o);

        //子类往往重写toString方法，用于返回对象的属性信息
        //当直接输出一个对象时，toString 方法会被默认的调用
        Monster monster = new Monster("小妖怪", "喜欢巡山~", 1000);
        System.out.println(monster.toString());
        System.out.println(monster);
    }
}

class Monster {
    private String name;
    private String skill;
    private double sal;
    public Monster(String name, String skill, double sal) {
        super();
        this.name = name;
        this.skill = skill;
        this.sal = sal;
    }
    @Override
    public String toString() {
        return "Monster 妖怪 [name=" + name + ", skill=" + skill + ", sal=" + sal + "]";
    }


}