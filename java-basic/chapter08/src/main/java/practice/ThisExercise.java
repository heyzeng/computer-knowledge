package practice;

/**
 * Author:Jude
 * Date:2020-12-01 上午8:22
 */
public class ThisExercise {

    public static void main(String[] args) {

        House house = new House("his",11.1);
        house.showInfo();

        House house1 = new House("YES", 111, 111);
        house1.showInfo();
    }
}

class House{

    String address;
    double area;
    double price;

    //构造器1
    public House(String address,double area){
        this.address = address;
        this.area = area;
    }

    //构造器2
    public House(String address,double area,double price){
        this(address,area);
        this.price = price;
    }

    public void showInfo() {
        System.out.printf("\n房子信息 地址=%s , 价格=%.2f 面积=%.2f", address, price, area);
    }



}
