package practiceTwo.encap;

/**
 * Author:Jude
 * Date:2021-01-05 下午10:36
 */
public class EncapTest {

    public static void main(String[] args) {

        Person person = new Person();
        person.setAge(19);
        person.setName("Jim");
        person.Info();
    }
}

class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >60 && age < 10){
            this.age = age;
        }else {
            System.out.println("年龄1-120 默认值18");
            this.age = 18;
        }
    }

    public void Info(){
        System.out.println(name + " " + age);
    }
}