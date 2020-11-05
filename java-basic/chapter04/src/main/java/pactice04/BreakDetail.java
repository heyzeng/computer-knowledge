package pactice04;

public class BreakDetail {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 2){
                    break;
                }

                System.out.println("i=" + i + " j=" + j);

            }
        }
    }
}
