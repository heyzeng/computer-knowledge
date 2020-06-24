package extra1;

/*
 * 1：编程创建一个Box类，在其中定义三个变量表示一个立方体的长、宽和高，
 * 定义一个方法获取立方体的体积。创建一个对象，打印给定尺寸的立方体的体积。
 */
public class boxTest {
    public static void main(String[] args) {

        Box box = new Box();
        box.box_long = 1;
        box.box_wide = 2;
        box.box_high = 3;

        int volume = box.volume();
        System.out.println(volume);

    }

}

class Box{

    int box_long;
    int box_wide;
    int box_high;

    public int volume(){
        return box_high * box_wide * box_long;
    }
}