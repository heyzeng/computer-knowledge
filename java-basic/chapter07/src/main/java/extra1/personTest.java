package extra1;

/*
 * 编写一个Person类，包含name、gender、age、id、score属性，分别为String、String、int、int、double类型。
类中声明一个say方法，方法显示所有属性值。
在另一个TestPerson类中的main方法中，创建Person对象，并访问say方法和所有属性，并将调用结果打印输出。

 */
public class personTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Jude";
        person.gender = "男";
        person.age = 19;
        person.id  = 11;
        person.score  = 100;

        person.say();
    }
}

class Person{

    String name;
    String gender;
    int age;
    int id;
    double score;

    public void say(){
        System.out.println(name + " " + gender + " "+ age + " " + id + " " + score);
    }

}
