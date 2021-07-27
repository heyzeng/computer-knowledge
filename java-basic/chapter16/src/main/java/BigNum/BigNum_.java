package BigNum;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Author:Jude
 * Date:2021-07-27 下午11:28
 */
public class BigNum_ {
    public static void main(String[] args) {
        //long num = 33333333333333333333333566L;
//        BigInteger bigInteger = new BigInteger("33333333333333333333333566");
//        System.out.println(bigInteger);

        BigInteger b1 = new BigInteger("123456789023457999999009989923390023456688");
        System.out.println(b1);

        BigInteger b2 = new BigInteger("200");
        // 2.调用常见的运算方法
        // System.out.println(b1+b2); 不能使用 这样的 + 方法运行
        System.out.println(b1.add(b2));// 加
        System.out.println(b1.subtract(b2));// 减
        System.out.println(b1.multiply(b2));// 乘
        System.out.println(b1.divide(b2));// 除

        BigInteger n3 = new BigInteger("100");

        System.out.println(b1.add(n3));

        //存小数
        BigDecimal bigDecimal = new BigDecimal("1.11111111111111111111111");
        System.out.println(bigDecimal);

        BigDecimal b4 = new BigDecimal("3");
        System.out.println(bigDecimal.divide(b4, BigDecimal.ROUND_CEILING));// 除
    }
}
