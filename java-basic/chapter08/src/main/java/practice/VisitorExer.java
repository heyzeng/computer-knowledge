package practice;

import java.util.Scanner;

/**
 * Author:Jude
 * Date:2020-12-01 上午9:23
 */
public class VisitorExer {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        do {
            //创建一个游客
            Person__ person = new Person__();
            System.out.println("请输入名字");
            person.name = myScanner.next();
            if (person.name.equals("n")){
                break;
            }

            System.out.println("age ???");
            person.age = myScanner.nextInt();

            person.tickets();
            person.showInfo();
        }while (true);
    }
}

/*
1.一个景区根据游人的年龄收取不同价格的门票。
2.请编写游人类，根据年龄段决定能够购买的门票价格并输出
3.规则：年龄>18 , 门票为20元，其它情况免费。
4.可以循环从控制台输入名字和年龄，打印门票收费情况, 如果名字输入 n ,则退出程序。

*/

class Person__{
    String name;
    int ticket;
    int age;

    public void tickets(){
        if (age > 18){
            ticket = 20;
            System.out.println("your ticket is = " + ticket);
        } else {
            System.out.println("free");
        }
    }

    //show方法
    public void showInfo() {

        if(ticket != 0) {
            System.out.println(name+ " 年龄是" + age + " 应付票价" + ticket);
        } else {
            System.out.println(name+ " 年龄是" + age + " 免费");
        }
    }

}
