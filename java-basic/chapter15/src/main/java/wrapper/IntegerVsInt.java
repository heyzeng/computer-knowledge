package wrapper;

/**
 * Author:ZJF
 * Date:2021-03-12 下午7:07
 */
public class IntegerVsInt {
    public static void main(String[] args) {
        //其它 Double , Byte ,Long , Float 一样的

        //在jdk5是使用手动装箱和拆箱
        //手动装箱
        int i = 10;
        Integer integer = new Integer(i);
        Integer integer1 = Integer.valueOf(i);

        //手动拆箱
        int i1 = integer1.intValue();
        System.out.println(i1);

        //jdk5后，提供自动装箱和拆箱, 本质是做了一个封装
        int k = 20;
        Integer integer3 = k;//本质  Integer.valueOf(k);

        int m = integer1;//本质 integer2.intValue()


        Integer A = 10;
        int  a = 10;
        System.out.println(a == A);
    }
}
