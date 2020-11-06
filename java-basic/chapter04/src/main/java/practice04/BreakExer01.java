package practice04;


import java.util.Scanner;

public class BreakExer01 {

    public static void main(String[] args) {

        /*
			实现登录验证，有三次机会，如果用户名为”张无忌” ,
			密码”888”提示登录成功，否则提示还有几次机会，请使用for 循环+break完成
			*/

        Scanner scanner = new Scanner(System.in);
        String name = "" ;
        String password = "";
        int chances = 3;

        for (int i = 0; i < chances; i++) {

            System.out.println("name");
            name = scanner.next();
            System.out.println("password");
            password = scanner.next();

            if ("张无忌".equals(name) && "888".equals(password)){
                System.out.println("success");
                break;
            }else {
                System.out.printf("you have %d chances",chances-i);
            }
        }
        }
}
