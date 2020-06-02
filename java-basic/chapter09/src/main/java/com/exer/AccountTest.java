package com.exer;

/*
 * 1.创建程序,在其中定义两个类：Account和AccountTest类体会Java的封装性。
Account类要求具有属性：姓名（长度为2位3位或4位）、余额(必须>20)、密码（必须是六位）
并在AccountTest中测试

String  name=“”;
int len = name.length();

 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("aa");
        account.setLastMoney(50);
        account.setPassword("123456");
    }
}

class Account{
    //姓名（长度为2位3位或4位
    private String name;
    //余额(必须>20)
    private int lastMoney;
    //密码（必须是六位
    private String password;

    //name构造器
    public void setName(String name) {
        if (name.length()== 2 || name.length()==3 || name.length() ==4){
            System.out.println(name);
        }else {
            System.out.println("名字长度不对");
        }
        this.name = name;
    }

    //余额
    public void setLastMoney(int lastMoney) {
        if (lastMoney > 20){
            System.out.println(lastMoney);
        }else {
            System.out.println("余额error");
        }
        this.lastMoney = lastMoney;
    }

    //密码

    public void setPassword(String password) {
        if (password.length()==6){
            System.out.println(password);
        }else {
            System.out.println("password error");
        }
        this.password = password;
    }

}