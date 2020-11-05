package practice03;


public class ThreeOper {

    public static void main(String[] args) {

        int a  = 10;
        int b = 40;

        //这条语句的意思是，如果A>B的话，就将100赋给C，否则就将200赋给C；
        int c = a > b ? 100 : 200;
        System.out.println(c);


        int d = a > b ? a++ : --b; //  (1)  b = b - 1 (2) d = b
        System.out.println("d=" + d);// 39


        int aa = 711;
        int bb = 2;
        int cc = 90;

        int max1 = aa > bb ? aa : bb;
        int max2 = max1 > cc ? max1 : cc;

        System.out.println(max2);



    }
}
