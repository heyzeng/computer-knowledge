
/*
 	数组中常见的异常：
 	1.下角标越界 :ArrayIndexOutOfBoundsException
 	2.空指针异常 :NullPointerException
 */
public class arrayException {
    public static void main(String[] args) {

        //1.下角标越界 :ArrayIndexOutOfBoundsException
        //		int[] numbers = new int[2];

        //numbers[2] = 100; 下角标越界
        //numbers[-1] = 100; 下角标越界


        //2.空指针异常
        String[] strs = new String[2];
        //strs[0]获取索引值为0的元素。元素类型为String
        //System.out.println(strs[0].equals("aaa")); //空指针异常

        String str = "aaa";
        str = null;
//		System.out.println(str.equals("aaa")); //空指针异常 因为str的值为null


        String[][] strs2 = new String[2][];

        //String[] sss = strs2[0]; //取出来的二维数组的元素为null
        //因为sss的值为null所以会发生空指针异常
//		System.out.println(sss[0]); //strs2[0][0]

        /*
         * 只要某个变量的值为null那么它就不能做任何事情（调用方法，调用属性）。会发生空指针异常
         */
        //因为二维数组的元素为null ,所以再取二维数组元素的元素会发生空指针异常。
        System.out.println(strs2[0][0]);
    }
}
