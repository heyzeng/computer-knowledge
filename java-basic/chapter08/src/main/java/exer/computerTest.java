package exer;


public class computerTest {

    public static void main(String[] args) {

        Computer computer = new Computer();
        int[] numbers = {1,2,3,4,5};

        int sum = computer.add(numbers);
        System.out.println(sum);
    }

}

class Computer{

    public int add(int[] numbers){ //形参是为了告诉方法的调用者，调用方法需要传递方法所需要的数据。
        //当调用方法时才会执行方法体。
        int sum = 0; //用来统计所有的数的和
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }
}