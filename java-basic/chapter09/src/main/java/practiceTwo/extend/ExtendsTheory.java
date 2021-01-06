package practiceTwo.extend;

/**
 * Author:ZJF
 * Date:2021-01-06 下午7:23
 */
public class ExtendsTheory {

    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.age);
        System.out.println(son.f1());
    }
}

class GrandPa {
        String name = "段大爷";
        String hobby = "遛鸟";
//	public void say() {
//		System.out.println("GrandPa say..");
//	}
        }

class Father extends GrandPa {
    String name = "段正纯";
    int age = 30;
//	public void say() {
//		System.out.println("Father say..");
//	}
}

class Son extends Father {
    public String name = "段誉";

    public String f1() {
        return super.name;
    }

//	public void say() {
//		System.out.println("son say..");
//	}
}
