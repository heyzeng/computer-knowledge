package practice05;


public class ContinueTest {

    public static void main(String[] args) {



        int i = 0;

        while (i <= 4){
            i++;
            if (i == 2){
                continue;
            }
            System.out.println(i); //?5
        }
    }
}
