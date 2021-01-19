package com.interface_;

/**
 * Author:ZJF
 * Date:2021-01-19 上午10:43
 */
public class InterfaceVsExtends {
    public static void main(String[] args) {

        LitterMonkey litterMonkey = new LitterMonkey("litterMonkey");
        litterMonkey.climbing();
        litterMonkey.flying();
        litterMonkey.swimming();

        System.out.println("====");
        test1(litterMonkey);
        System.out.println("====");
        test2(litterMonkey);
    }

    public static void test1(Monkey m){
        m.climbing();
    }

    public static void test2(FishAble f){
        f.swimming();

        if (f instanceof LitterMonkey){
            ((LitterMonkey) f).flying();
            ((LitterMonkey) f).climbing();
        }
    }
}

class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void climbing(){
        System.out.println(name + " is climbing");
    }
}

interface FishAble{
    public void swimming();
}

interface BirdAble{
    public void flying();
}

class LitterMonkey extends Monkey implements FishAble,BirdAble{

    public LitterMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + " is swimming");
    }

    @Override
    public void flying() {
        System.out.println(getName() + " is flying");
    }
}
