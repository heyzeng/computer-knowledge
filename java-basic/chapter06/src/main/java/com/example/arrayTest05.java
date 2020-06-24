package com.example;


public class arrayTest05 {
    public static void main(String[] args) {
        String[][] persons = new String[3][];
        persons[0] = new String[2];
        persons[1] = new String[3];
        persons[2] = new String[2];

        persons[0][1] = "20";
        persons[2][0] = "小龙哥";

        //后一次赋值赋值前一次赋值
        persons = new String[2][2];

        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons[i].length; j++) {
                System.out.print(persons[i][j] + " ");
            }
            System.out.println();
        }
    }
}
