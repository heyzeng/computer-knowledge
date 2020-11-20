package practice;


public class ObjectUse2 {

    int num = 100;

    public static void main(String[] args) {

        ObjectUse2 objectUse2 = new ObjectUse2();

        System.out.println(objectUse2.num); //100
        objectUse2.f1(); //++

        System.out.println(objectUse2.num); //101
        objectUse2.f1(); //++

        System.out.println(objectUse2.num); //102
        objectUse2.f2();

        ObjectUse2 ou2 = new ObjectUse2();
        ou2.f2(); // 100



    }


    public void f1() {
        num++;
    }

    public void f2() {
        System.out.println("num=" + num);
    }

    //方法
    public void sayHi() {
        System.out.println("say hi");
    }

    public void sayOk() {
        sayHi();
    }
}
