package practice;


public class ObjectUse {

    //方法
    public void sayHi() {
        System.out.println("say hi");
    }

    public void sayOk() {
        sayHi();
    }

    public static void main(String[] args) {

        ObjectUse objectUse = new ObjectUse();

        objectUse.sayHi();
        objectUse.sayOk();
    }
}
