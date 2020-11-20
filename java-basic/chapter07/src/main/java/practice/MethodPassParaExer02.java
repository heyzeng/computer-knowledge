package practice;


public class MethodPassParaExer02 {//类n

    public static void main(String[] args) {

        MyTools myTools = new MyTools();

        int[] arr ={1,3,4};
        int[] newArr =  myTools.copyArray(arr,1);

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }



    }





}


//编写类MyTools类，编写一个方法可以打印二维数组的数据
class MyTools{

    public void printToArr(int[][] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                System.out.println(arr[i][j] + "\t");

            }
            System.out.println();
        }
    }

    //编写一个方法copyArray，可以复制一个数组，返回复制的数组
    //扩展：可以接收一个参数，指定拷贝原数组的多少个元素
    public int[] copyArray(int[] arr, int size){


        if (size < 0 || size > arr.length){
            System.out.println("no");
        }

        int[] newArr = new int[size];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];

        }
        return newArr;

    }

    public Person copyPerson(Person p){

        Person person = new Person();
        person.age = p.age;
        person.name = p.name;

        return person;

    }
}
