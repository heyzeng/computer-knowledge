package practice;

/**
 * Author:Jude
 * Date:2020-12-01 上午8:30
 */
public class ThisTest {

    public static void main(String[] args) {

        Dog_ dog_ = new Dog_("Tim",111);
        System.out.println("dog的地址(hashcode=)" + dog_.hashCode());
        dog_.showInfo();

        Dog_ dog_1 = new Dog_("Jude", 100);
        System.out.println(dog_1.hashCode());
        dog_1.showInfo();

        dog_1.m1();
        dog_.m1();


    }
}

class Dog_{

    public String name;
    public int age;

    //构造器
    public  Dog_(String name,int age ){
        System.out.println(this.hashCode());
        this.name = name;
        this.age = age;
    }

    public void m1() {
        System.out.println(this.name);
        System.out.println("m1 this.hashCode=" + this.hashCode());
    }

    public void showInfo(){
        System.out.println(name + "\t" + age + "\t");
    }

}
