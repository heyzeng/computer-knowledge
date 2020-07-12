package com.java2;

/*

 	package（包） : Java为了对所有的类进行统一管理和划分所以有了包的概念

 	说明：
 		1.命名规则应该遵守标识符的规则和规范。
 		2.包名 ：机构的类型(com.org).机构的名称.项目名.模块名
 		3.每 "."一次代表一层目录
 		4.不同包中的类名可以相同，同一个包中的类名不能相同。
 		5.类中声明的package com.java2;也是用来告诉编译器字节码文件所放的目录。


    import:
		1.在源文件中使用import显式的导入指定包下的类或接口
		2.声明在包的声明和类的声明之间。
		3.如果需要导入多个类或接口，那么就并列显式多个import语句即可
		4.举例：可以使用java.util.*的方式，一次性导入util包下所有的类或接口。
		5.如果导入的类或接口是java.lang包下的，或者是当前包下的，则可以省略此import语句。
		6.如果在代码中使用不同包下的同名的类。那么就需要使用类的全类名的方式指明调用的是哪个类。
		7.import static组合的使用：调用指定类或接口下的静态的属性或方法
		8.如果已经导入java.a包下的类。那么如果需要使用a包的子包下的类的话，仍然需要导入。

 */
import java.util.*;
import static java.lang.System.out;

public class packageImport {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new Date();

        ////全类名 ：包含包名在内的类的全名称。
        new com.java2.a().hashCode();
        new com.java2.b().say();
    }



}
