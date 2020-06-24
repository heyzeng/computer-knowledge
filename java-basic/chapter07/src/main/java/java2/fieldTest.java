package java2;

/*
 * 属性（成员变量） ：
 *
 *
 * 变量的分类 ：  1.按照类型分：基本数据类型 vs 引用数据类型
 * 			 2.按照位置分 ：成员变量  vs 局部变量
 *
 *
 * 成员变量和局部变量的相同和不同点？
 *
 * 			相同点：1.声明的格式都一样。
 * 				  2.都是先声明后使用
 * 				  3.都有作用域
 *
 * 			不同点：
 * 				位置 ：
 * 					成员变量 ：声明在类中，方法等结构外。
 * 					局部变量 ：在方法，构造器等结构内声明的变量。
 * 				默认值：
 * 					成员变量：成员变量的默认值和一维数组元素的默认值相同。
 * 					局部变量 ：没有默认值
 * 				权限修饰符：
 * 					成员变量 ：可以使用四种权限修饰符(private protected public 缺省的(default))
 * 					局部变量：没有权限修饰符（不能使用权限修饰符）
 * 				内存：
 * 					成员变量 ：在堆中
 * 					局部变量 ：在栈中
 */
public class fieldTest {
    public static void main(String[] args) {


        int age = 10;//成员表量

        System.out.println(age);
    }
}

class Animal{

    //属性
    public String name;
    protected int age;
    private int sex;

    public Animal(){ //了解  构造器
        String address = "ssss"; //局部变量
    }

    public Animal(String school){ //形参 - 局部变量
        String address = "ssss"; //局部变量
    }

    {
        //了解 代码块

    }

    public void show(int age){ //形参 - 局部变量
        int score = 20; //局部变量
    }


}