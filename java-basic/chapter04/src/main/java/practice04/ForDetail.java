package practice04;


public class ForDetail {

    public static void main(String[] args) {


        ////for循环的写法变化
        //for(;循环判断条件;) 中的初始化和变量迭代可以不写（写到其它地方），但是两边的分号不能省略。
        for (int i = 0; i < 10; i++) {
            System.out.println("hello world " + i);
        }

        //循环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开，
        //循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开

        int count = 3;
        for (int i = 0,j = 0; i < count; i++ ,j+=2){

            System.out.println(i + " " + j);

        }



    }
}
