package practice05;


public class ReturnTest {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if (i == 2 ){
                continue;//0,1,3,4 ,hello
                //break; // 0,1,hello
               // return; //0,1


            }
            System.out.println(i);

        }

        System.out.println("hello");


    }
}
