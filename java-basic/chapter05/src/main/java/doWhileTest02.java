
/*


	do-while和while的区别？
		while的循环体可能一次也不执行。
		do-while的循环体至少执行一次。

*/

public class doWhileTest02 {
    public static void main(String[] args) {

        boolean boo = false;

        while(boo){
            System.out.println("while");
        }

        do{
            System.out.println("do - while");

        }while(boo);

    }
}
