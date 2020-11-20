package practice;


public class MethodExer03 {

    public static void main(String[] args) {

        /*
        定义小小计算器类(Calcuator)，实现加减乘除四个功能分四个方法完成:
        要求：返回运算的结果，并能够提示 不能除 0 的情况*/

        Calculate calculate = new Calculate();
        System.out.println(calculate.divide(1,0));

        if (calculate.flag){
            System.out.println("yes");
        }else {
            System.out.println("dont divide");
        }
    }
}


class Calculate{

    boolean flag = true;

    public double add(double n1,double n2){
        return n1 + n2;
    }

    public double subtract(double n1,double n2){
        return n1 - n2;
    }

    public double ride(double n1, double n2){
        return  n1 * n2;
    }

    public double divide(double n1,double n2){

        if (n2 == 0){
          flag = false;
          return -1;
        }else {
         return  n1 / n2;
        }
    }

}
