package practice;

/**
 * Author:Jude
 * Date:2020-11-21 11:17 下午
 */
public class Homework03 {

    public static void main(String[] args) {

        Circular circular = new Circular();
        circular.radius = 10.1;
        circular.area();
        circular.perimeter();
    }
}

/*
定义一个圆类
	定义属性：半径
提供显示圆周长功能的方法
提供显示圆面积的方法
*/

class Circular{

    double radius;

    //提供显示圆周长功能的方法
    public void perimeter(){
        System.out.printf("per = %.2f \n" , 2 * Math.PI * radius);

    }

    public void area(){
        System.out.printf("ar = %.2f \n",  Math.PI * radius);
    }

}