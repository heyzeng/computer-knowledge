
/*
 	方法的重载：在同个类中方法名相同，形参列表不同构成方法的重载。

 	1.两同一不同 ： 同一个类，同一个方法名。不同的形参列表

 	2.不同的形参列表 ：形参的个数，类型，顺序不一样。

 	3.注意 ：方法的重载和形参列表的名字，返回值类型，权限修饰符无关。

 	4.如何确定调用的方法 ：　方法名 +　形参列表

 */
public class overloadTest {
    public static void main(String[] args) {

        Calculate calculate = new Calculate();
        calculate.run(10.5,12);//10.5 12.0


    }
}

class Calculate{

    public void run(int a,int b){
        System.out.println(a + " " + b);
    }

    public void run(double a, double b){
        System.out.println(a + " " + b);
    }
    // 方法的重载和形参列表的变量名无关
    /*
     * public void add(int aa,int bb){
     *
     * }
     */

    /*
     * 方法的重载和返回值类型无关 public int add(int a,int b){ return 20; }
     */

    /*
     * 方法的重载和权限修饰符无关 private void add(int a,int b){
     *
     * }
     */


}