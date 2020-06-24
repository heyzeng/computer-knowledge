

/*

	关键字：break和continue


	break :  1.break只能在循环结构和switch-case中使用
			 2.break在循环结构中用来结束当前循环。
			 3.在嵌套循环中用来结束包含它的那层循环的当前循环。

	continue : 1.continue只能使用在循环结构中
			   2.continue在循环结构中用来结束当次循环
			   3.在嵌套循环中用来结束包含它的那层循环的当次循环。

*/
public class breakContinueTest {
    public static void main(String[] args) {

        /*
        for (;;){
            System.out.println("aaa");
            break;
        }
        */

        /*
        for (int i = 0; i < 5; i++) {
            if (i == 2){
                continue;//0,1,3,4 跳过2接着执行
              //  break;// 0,1  到2会跳出
            }
            System.out.println(i);

        }
        */


        abc : for(int i = 1; i <= 3; i++){

            for(int j = 1; j <= 3; j++){
                if(j == 2){

                    break abc; //用来结束外层循环
                }
                System.out.println("j=" + j);
            }

            System.out.println("i=" + i);

        }




    }
}
