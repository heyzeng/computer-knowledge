package practice;


import java.util.Scanner;

public class BoxExer {

    public static void main(String[] args) {

        Box box = new Box();

        Scanner scanner = new Scanner(System.in);
        double h = scanner.nextDouble();
        box.high = h;

        double w = scanner.nextDouble();
        box.weight = w;

        double l = scanner.nextDouble();
        box.length = l;

        System.out.println(box.volume());//3.3000000000000003
    }
}


/*
编程创建一个Box类，在其中定义三个属性表示一个立方体的长、宽和高，长宽高可以通过控制台输入。
定义一个方法获取立方体的体积(volume)。
创建一个对象，打印给定尺寸的立方体的体积
*/
class  Box{

    double high;
    double weight;
    double length;

    public double volume(){
        return high * weight * length;
    }
}
