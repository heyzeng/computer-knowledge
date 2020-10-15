package practice01;


public class EscapeChar {
    public static void main(String[] args) {
        //演示转义字符的使用
        //\t  ：一个制表位，实现对齐的功能
        System.out.println("aa\tbb\t");
        //\ 输出
        System.out.println("c:\\user\\jude");
        //\n  ：换行符
        System.out.println("你好！\n 哈哈");
        // \"  :一个"
        System.out.println("\"hello,word\"");
        // \'  ：一个'
        System.out.println("\'hello,word\'");

        //\r  :一个回车
        //说明: \r 表示 回车 , 把 \r 后面的内容输出到当前行的 最前面，如果前面有内容，则覆盖
        System.out.println("哈哈哈\r你好啊");//你好啊

        System.out.println("姓名\t年龄\t籍贯\t住址\njohn\t12\t北京\t上海");
    }
}
