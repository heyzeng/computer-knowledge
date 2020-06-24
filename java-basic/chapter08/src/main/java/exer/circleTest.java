package exer;

/*
 * 利用面向对象的编程方法，设计类Circle计算圆的面积
 */
public class circleTest {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.r = 100;
        circle.area();
    }
}

class Circle{

    double r;

    public void area(){
        System.out.println(Math.PI * r * r);
    }
}
