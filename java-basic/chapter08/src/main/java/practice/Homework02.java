package practice;

import java.util.Scanner;

/**
 * Author:Jude
 * Date:2020-11-21 11:05 下午
 */
public class Homework02 {

    public static void main(String[] args) {

        Book book = new Book();
        book.price = 101;
        book.show();

    }
}

/*
定义方法，实现更改某本书的价格，
具体：如果价格>150,则更改为150，如果价格>100,更改为100，否则不变

需要提前定义好Book书类，并提供价格属性以及显示价格的方法
*/

class Book{

    int price;

    public void show(){
        System.out.println("书的价格" + price);
    }
    public void getPrice(int price){
        if (price > 150){
            price = 150;
            System.out.println("价格150" + price);
        }else if (price > 100  && price < 150){
            price = 100;
            System.out.println("价格100" + price);
        }

    }
}