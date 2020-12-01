package practice;

/**
 * Author:Jude
 * Date:2020-12-01 上午9:01
 */
public class VarArgsExer01 {

    public static void main(String[] args) {

        MethodUtils_ methodUtils_ = new MethodUtils_();
        String tom = methodUtils_.showInfo("Tom", 1, 3, 11.1);
        System.out.println(tom);
    }
}


class MethodUtils_{
    public String showInfo(String name,double...score){
        double sum  = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];

        }
        return name + " " + sum;
    }
}
