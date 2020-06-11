/*

	算术运算符 ： +(正) -（负） +(加) -（减） * / %(取模) 前++ 后++ 前-- 后-- +(连接符)


		后++ ：先赋值再运算（自加1）
		前++ ：先运算（自加1）再赋值
		后-- ：先赋值再运算（自减1）
		前-- ：先运算（自减1）再赋值
		--------------------------------------------------
		后++ ：先运算（赋值）再自加1
		前++ ：先自加1  再运算（赋值）
		后-- ：先运算（赋值）再自减1
		前-- ：先自减1  再运算（赋值）

*/
public class ArithmeticTest{

    public static void main(String[] args){

        int a = -5;
        System.out.println(a);


        int number = 10 / 4; //2
        System.out.println(number);

        double dou = 10 / 4; //2.0
        dou = (10 * 1.0) / 4; //2.5
        dou = 10 / (4 * 1.0);//2.5
        dou = (double)10 / 4;//2.5

        dou = 10 / 4 * 4; //8.0
        dou = 10 * 4 / 4; //10.0  建议：顺序没有影响的情况下，先乘后除
        System.out.println(dou);

        System.out.println("----------------取模-------------------");

        //使用场景 ：判断某个数是否能被整除
        System.out.println(0 % 2); //0
        System.out.println(1 % 2); //1
        System.out.println(2 % 2); //0
        System.out.println(3 % 2); //1
        System.out.println(4 % 2); //0
        System.out.println(5 % 2); //1

        System.out.println("--------------------------");
        //思考：取模结果的正负和谁有关？和被模数有关
        System.out.println(-1 % 3); //-1
        System.out.println(2 % -3); //2
        System.out.println(-5 % -3); //-2

        System.out.println("---------------------- 前++ 后++ 前-- 后-- ------------------------------");

        int num = 10;
        //num++; //后++
        //++num; //前++

        //int num2 = num++; //后++ ：先赋值再运算
        //System.out.println("num=" + num + "  num2=" + num2); //num=11  num2=10


        int num2 = ++num; //前++ ：先运算再赋值
        System.out.println("num=" + num + "  num2=" + num2); //num=11  num2=11


        int nu = 10;

        //int nu2 = nu--; //后-- ：先赋值再运算
        //System.out.println("nu=" + nu + "  nu2=" + nu2); //nu=9  nu2=10


        int nu2 = --nu; //前-- ：先运算再赋值
        System.out.println("nu=" + nu + "  nu2=" + nu2); //nu=9  nu2=9

    }
}

