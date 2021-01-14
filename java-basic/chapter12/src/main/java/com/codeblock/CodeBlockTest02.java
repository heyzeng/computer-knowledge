package com.codeblock;

/**
 * Author:ZJF
 * Date:2021-01-14 上午9:14
 */
public class CodeBlockTest02 {
    public static void main(String[] args) {

        new Movie();

        new Movie("Jim");
    }
}

class Movie{

    private String name;
    private double price;
    private String director;

    //普通代码块随着构造器的加载而加载，静态代码库只会加载一次
    {
        System.out.println("hello");
    }

    public Movie() {

    }

    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
