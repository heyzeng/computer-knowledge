package practice02;


public class FloatDetail {
    public static void main(String[] args) {

        //细节 Java 的浮点型常量默认为double型，声明float型常量，须后加‘f’或‘F’
        // 1.1 默认 double , 直接在 1.1F
        float a = 1.1F;

        //2. 十进制数形式：如：5.12       512.0f        .512   (必须有小数点)
        //    科学计数法形式:如：5.12e2 [5.12 *10^2 ]      5.12E-2   [5.12 /(10^2) ]
        double d1 = .512;
        double d2 = 5.12E2;
        double d3 = 5.12E-2;
        System.out.println(d1+ " " + d2 + " " + d3);


        //3. 通常情况下，应该使用double型，因为它比float型更精确
        double num9 = 2.1234567851;
        float num10 =  2.1234567851F;

        System.out.println(num9 + " "  + num10);


        //4. 浮点数使用陷阱: 2.7 和 8.1 / 3  比较
        //不好理解

        double d11 = 2.7;
        double d12 = 8.1 /3; // 数学 2.7 , 但是在计算运算时，发生了精度损失 2.69999999997
        System.out.println(d11 + " " + d12);

        //在开发中，如果需要比较两个小数是否相等， 可以比较两个数的差值的绝对值，是否在某个精度范围
        //System.out.println(Math.abs(d4-d5));

        if ( d11 == d12 ){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }

        if (Math.abs(d11-d12) < 0.000001){
            System.out.println("相等");
        }else {
            System.out.println("不等");}
    }
}
