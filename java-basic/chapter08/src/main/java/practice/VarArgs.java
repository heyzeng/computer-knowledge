package practice;

/**
 * Author:Jude
 * Date:2020-12-01 上午8:40
 */
public class VarArgs {

    //可变参数
    //说明
    //1. double... 后面的三个小点，是规定
    //2. 这时 args 称为 可变形参
    //3. args 可变形参的本质就是数组
    //4. 实参可以传递数组，但是需要通过 数组名
    //5. 不能在定义 sum(double[] arr), 会认为重复定义
    public double sumDouble(double...args){
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        VarArgs varArgs = new VarArgs();
        double v = varArgs.sumDouble(1.0, 2, 3.1);
        System.out.println(v);


    }
}
