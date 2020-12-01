package practice;

/**
 * Author:Jude
 * Date:2020-11-30 下午8:41
 */
public class ThisDetail {

    public static void main(String[] args) {

        AA aa = new AA();
        aa.n3();

        System.out.println(aa.name);

        AA aThis = new AA("this");
        System.out.println(aThis.name);

    }
}

class AA{

    String name = "Jim";
    int age = 10;

    public AA(){
        this("TIMMM");
    }

    public AA(String name){
        //this用于区分当前类的成员和局部变量
        this.name = name;
    }

    public void n1(){
        //this关键字可以用来访问本类的属性、方法、构造器
        System.out.println(this.age);
    }

    public void n2 (){
        System.out.println("hi");
    }

    public void n3(){
        //访问成员方法的语法：this.方法名(参数列表);
        System.out.println("n3");
        this.n2(); //可以访问 本类的 hi();
    }

}
