package practice05;


public class ArrayDetail {

    public static void main(String[] args) {

        //数组是多个相同类型数据的组合，实现对这些数据的统一管理
        //int[] arr = {1, 2, 4, 1.0};//错误 1.0是double

        //数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用

        int[] arr1 ={ };
        System.out.println(arr1.length);

        double[] arr2 = {};
        String[] arr3 = {"tom","jack"};


        //数组创建后，如果没有赋值，
        //有默认值int 	0，short 0, byte 0, long 0, float 0.0,double 0.0，char \u0000，boolean false，String null(空)

        short[] shorts = new short[3];
        boolean[] booleans = new boolean[3];
        for (int i = 0; i < shorts.length; i++) {
            System.out.println(shorts[i] + " ===== " + booleans[i]);

        }


    }
}
