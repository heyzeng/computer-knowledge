package practice02;


public class Exercise01 {
    public static void main(String[] args) {

        // p38
        //  int temp =i (temp =1) ;i = i+1 (i=2) ;int i =temp (i=1)
        int i = 1;
        i= i++;
        System.out.println(i);//i=1

        // j = j+1 (j =2); int temp = j (2) ;j = temp
        int j = 1;
        j= ++j;
        System.out.println(j);//i=2

    }
}
