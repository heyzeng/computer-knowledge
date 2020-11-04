package practice02;


public class VarDemo {

    public static void main(String[] args) {

        //希望使用变量来描述一个人信息
        //名字, 年龄， 工资，性别 => 不同的属性，可以使用不同的类型来记录

        String name = "张三";
        int age = 20;
        double sal = 40000.5;
        char gender = '男';

        //使用4句输出
        System.out.println(name);
        System.out.println(age);
        System.out.println(sal);
        System.out.println(gender);

        //细节 该区域的数据可以在同一类型范围内不断变化
        age = 21;
        //变量在同一个作用域(简单理解成在一个方法中)内不能重名
        //int age = 60;
    }
}

class Cat {
    int name;
    int age;

    public void setName(int name) {
        this.name = name;
    }


}
