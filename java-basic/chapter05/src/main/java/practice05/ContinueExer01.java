package practice05;


public class ContinueExer01 {

    public static void main(String[] args) {


        //continue实现 打印1――100之内的奇数[要求使用for循环+continue]

        for (int i = 1; i < 101; i++) {

            if (i % 2 !=0){
                System.out.println(i);
                continue;
            }

        }
    }
}
