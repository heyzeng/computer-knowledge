package fortest;

/**
 * Author:ZJF
 * Date:2021-01-28 上午9:26
 */
public class Homework01 {
    public static void main(String[] args) {

        System.out.println(Frock.getNum());
        System.out.println(Frock.getNum());

        Frock frock = new Frock(100);
        System.out.println(frock.getSerialNum());
    }
}

class Frock{
    private static int num = 10000;
    private int serialNum;

    public Frock(int serialNum) {
        this.serialNum = getNum();
    }

    public int getSerialNum() {
        return serialNum;
    }

    public static int getNum(){
        num += 100;
        return num;
    }
}
