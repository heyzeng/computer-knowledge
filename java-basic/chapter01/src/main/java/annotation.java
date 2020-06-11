//单行注释
//注释的作用 ：1.提高了代码的阅读性  2.调试程序的重要手段
//注意：当我们进行编译的时候，注释是不会写入到字节码文件中的。

/*
	多行注释

	注意 ：多行注释不能嵌套使用
*/


//下面的这个类是一个Demo
/*

	第一个程序的总结：

	创建 ：创建一个以".java"结尾的文件，该文件叫做源文件
	编译 ：javac 源文件名.java  - 生成一个或多个字节码文件
				(源文件中有几个类就生成几个字节码文件)
	运行 ：java 字节码文件名 - 运行程序


	说明：
		 1.以.java结尾的文件叫做源文件，以.class文件结尾的叫做字节码文件
		 2.一个源文件中可以有多个类，类名不可以相同。
		 3.java严格区分大小写
		 4.public 修饰的类的类名必须和源文件名称一致
		 5.一个源文件中可以有多个类，但是只能有一个类可以被public所修饰。
		 6.每行代码写完后必须以";"结尾
*/
/**
 @author jude
 @version 1.0

 javadoc -d  开发工具的名字
 mydoc  生成文档所在的目录的名字
 -author -version  文档上的注解
 Demo.java  源文件
 */
public class annotation {
    public static void main(String[] args) {
        System.out.println("hello word");
    }
}
