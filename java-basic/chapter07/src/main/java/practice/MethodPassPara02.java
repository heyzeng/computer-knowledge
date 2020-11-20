package practice;

//基本数据类型传递
public class MethodPassPara02 {

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        T3 t3 = new T3();
        t3.test100(arr);

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }
    }
}

class T3
{
    public void test100(int[] arr ) {

        arr[0] = 100;
    }
}
