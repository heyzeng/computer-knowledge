package exer;

//.3 修改上一个程序，在method方法提供m和n两个参数，方法中打印一个m*n的矩形，并计算该矩形的面积， 将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
public class areaTest {
    public static void main(String[] args) {

        Area area = new Area();
        int calculateArea = area.calculateArea(5, 6);
        System.out.println(calculateArea);
    }
}

class Area{

    public int calculateArea(int m,int n){

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

        return m*n;
    }
}


