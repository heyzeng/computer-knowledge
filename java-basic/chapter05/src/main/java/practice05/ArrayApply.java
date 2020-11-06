package practice05;


public class ArrayApply {

    public static void main(String[] args) {

        /*
		创建一个char类型的26个元素的数组，分别 放置'A'-'Z‘。使用for循环访问所有元素并打印出来。
		提示：char类型数据运算 'A'+1 -> 'B'，'0'+1 -> '1‘

		*/

        // new 长度为26的类型的数组
        char[] chars = new char[26];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char)('A' + i);//char类型数据运算 'A'+1 -> 'B'，'0'+1 -> '1‘
        }

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

    }
}
