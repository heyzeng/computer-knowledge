package practiceTwo.extend;

/**
 * Author:ZJF
 * Date:2021-01-06 下午7:03
 */
public class ExtendsExer02 {

    public static void main(String[] args) {

        PC pc = new PC("intel", "256", "500g");
        pc.setBrand("mac");
        pc.showInfo();

        NotePad notePad = new NotePad("inter", "256", "500g");
        notePad.setColor("red");
    }
}

/*
 *编写Computer类，包含CPU、内存、硬盘等属性，
 *getDetails方法用于返回Computer的详细信息
 *编写PC子类，继承Computer类，添加特有属性【品牌brand】
 *编写NotePad子类，继承Computer类，添加特有属性【演示color】
 *编写Test类，在main方法中创建PC和NotePad对象，分别给对象中特有的属性赋值，
 *以及从Computer类继承的属性赋值，并使用方法并打印输出信息。
 */

class Computer {
    private String cpu;
    private String men;
    private String disk;

    public Computer(String cpu, String men, String disk) {
        this.cpu = cpu;
        this.men = men;
        this.disk = disk;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMen() {
        return men;
    }

    public void setMen(String men) {
        this.men = men;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getDetails() {
        return cpu + " " + men + " " + disk;
    }
}

class PC extends Computer {
    private String brand;

    public PC(String cpu, String men, String disk) {
        super(cpu, men, disk);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "PC{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public void showInfo() {
        System.out.println("brand = " + brand);
        System.out.println(getDetails());
    }
}

class NotePad extends Computer {
    private String color;

    public NotePad(String cpu, String men, String disk) {
        super(cpu, men, disk);
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "NotePad{" +
                "color='" + color + '\'' +
                '}';
    }

}
