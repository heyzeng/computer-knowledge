

/*
	分支结构 ：switch-case

	格式：

		switch(表达式){

		case 常量1：
			执行语句1;
			break;
		case 常量2:
			执行语句2;
			break;

		......
		default:
			执行语句n;
			break;
		}

		说明：
			1.根据表达式和case后面的值进行匹配，一旦匹配成功则执行case中的执行语句，
					直到break或switch-case结尾结束（执行到switch-case中的最后一行代码）。
			2.break：用来结束case语句的。可以省略。
			3.default :如果case都没有匹配成功，则执行default中的执行语句。default的位置是任意的
					default可以省略。
			4.case子句中的值必须是常量，且所有case子句中的值应是不同的
			5.表达式的类型: byte short int char String(jdk1.7) 枚举
*/
public class stwichTest {
    public static void main(String[] args) {
        switch (1){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}
