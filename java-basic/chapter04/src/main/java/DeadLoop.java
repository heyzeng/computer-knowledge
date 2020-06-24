;

/*

	死循环 ：

	for循环的死循环格式 ：   for(;;){}
	while循环的死循环格式 ：  while(true){}

	如何退出死循环？
		1.将循环条件变成false
		2.通过使用break终止死循环。
				break作用：在循环结构中用来终止循环。在switch-case用来结束switch-case结构。
				注意 ：break只能用在循环结构和switch-case结构中。
*/
public class DeadLoop {
    public static void main(String[] args) {

//        while (true){
//            System.out.println("开始");
//            break;
//            System.out.println("结束");


//            for(;;){
//                System.out.println("hello");
//                break;
//            }

        boolean boo = true;

        while (boo) {
            System.out.println("start");
            boo = false;
        }

        }
    }
