package com.homework;

/**
 * Author:ZJF
 * Date:2021-01-21 下午5:44
 */
public class Homework01 {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.showMoney();

        savingsAccount.saveMoney(100);
        savingsAccount.saveMoney(100);
        savingsAccount.saveMoney(100);

        savingsAccount.showMoney();
    }
}

class Bank {
    private double balance;

    public Bank(double initBalance) {
        this.balance = initBalance;
    }

    //存钱
    public void saveMoney(double account){
        balance += account;
    }

    //取钱
    public void withDraw(double account){
        balance -= account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void showMoney(){
        System.out.println("your money is " + balance);
    }
}

class CheckingAccount extends Bank{

    public CheckingAccount(double initBalance) {
        super(initBalance);
    }

    //存钱
    @Override
    public void saveMoney(double account) {
        super.saveMoney(account - 1);
    }

    //取钱
    @Override
    public void withDraw(double account) {
        super.withDraw(account + 1);
    }

    @Override
    public void showMoney() {
        super.showMoney();
    }
}

/*
扩展前一个练习的BankAccount类，
新类SavingsAccount每个月都有利息产生(earnMonthlyInterest方法被调用)，
并且有每月三次免手续费的存款或取款。在earnMonthlyInterest方法中重置交易计数。
*/

class SavingsAccount extends Bank{

    //属性控制 免手续费的次数
    private int count = 3;
    private final double RATE = 0.01;

    public SavingsAccount(double initBalance) {
        super(initBalance);
    }

    public void earnMonthlyInterest() { // 每月初调用一次 1号
        count = 3;
        //调用父类的方法，存入利息
        saveMoney(getBalance() * RATE);
    }

    @Override
    public void saveMoney(double account) {
        if (count > 0){
            super.saveMoney(account);
        }else {
            super.saveMoney(account - 1);
        }
        count--;
    }

    @Override
    public void withDraw(double account) {
        if(count > 0) { //免手续费
            super.withDraw(account);; //没有手续费
        } else {
            super.withDraw(account + 1);
            //1 $ 入银行
        }
        count--;
    }
}
