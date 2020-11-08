package practice05;


public class ContinueTest2 {

    public static void main(String[] args) {

        lable1:
        for (int i = 0; i < 4; i++) {

            lable2:
            for (int j = 0; j < 6; j++) {

                if (j ==2 ){
                    continue lable1;
                }
                System.out.println("j" + j);
            }
        }
    }
}
