package practice03;


import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("name");
        String name = scanner.next();


        System.out.println("age");
        int score = scanner.nextInt();


        System.out.println("salary");
        double salary = scanner.nextDouble();
    }
}
