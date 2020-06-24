package java3;


public class demo {
    public static void main(String[] args) {

        Peson peson = new Peson();
        peson.name = "Tom";


        Peson peson1 = new Peson();
        peson1.name = "li";

        peson.say();
        peson1.say();

        Peson peson2 = new Peson();
        peson2.age = 1000;

        peson2.say();


    }
}

class Peson{
    //属性
    int age = 10;
    String name = "Jude";

    //方法
    public void say(){
        System.out.println(name +" " + age );
    }

}
