package com.example;


public class arrayTest03 {
    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "东哥";
        names[2] = "奶茶";


        String[] names2 = names;
        names2[0] = "龙哥";

        for (int i = 0; i < names2.length; i++) {
            System.out.println(names2[i]);
        }

        System.out.println("-----------------------------------------");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
