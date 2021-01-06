package practiceTwo.extend;

/**
 * Author:Jude
 * Date:2021-01-05 下午11:28
 */
public class ExtendsDetail {

    public static void main(String[] args) {

        AA aa = new AA("Jim");
        int n1 = aa.n1;
        System.out.println(n1);

        System.out.println("------");
        BB bb = new BB();
        bb.run();
    }
}

class DD {
    public DD() {
        System.out.println("yes dd被调用");
    }
}

class AA extends DD {
    // 属性
    public int n1 = 10;
    protected int n2 = 20;
    int n3 = 30;
    private int n4 = 40;

    public int N4() {
        return n4;
    }

    public AA() {
        System.out.println("A被调用");
    }


    public AA(String name) {

    }

    public AA(int n1) {

    }

}

class BB extends AA {
    // 子类继承了所有的属性和方法，只是私有的属性不能直接访问，需要通过公共的方法去访问
    public void run() {
        System.out.println(n1 + " " + n2 + " " + n3);
        System.out.println(N4());
    }

    //子类没有继承父类的构造器，但必须调用父类的构造器， 完成父类的初始化.
    //至于调用父类的哪个构造器，无所谓，但是一定要调用一个
    //默认有一句话 super(), 父类的无参构造器
    //如果希望指定去调用父类的某个构造方法，则显示的调用一下
    //super在使用时，需要放在方法体的第一句位置
    //super() 和 this() 都只能放在构造方法句首，因此这两个方法不能共存在一个方法中
    public BB() {
//        super(10);
        System.out.println("BB() 构造器..");
    }
}

