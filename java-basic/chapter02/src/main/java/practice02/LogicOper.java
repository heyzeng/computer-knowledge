package practice02;

public class LogicOper {

    public static void main(String[] args) {

        //演示 && 短路与
        //演示 & 逻辑与
        double score = 70;
        if (score > 60 && score < 100 ){
            System.out.println("ok1");
        }

        if (score > 60 & score < 100 ){
            System.out.println("ok2");
        }


        //区别举例
			/*
			(1) &&短路与：如果第一个条件为false，则第二个条件不会判断，最终结果为false，效率高
			(2) & 逻辑与：不管第一个条件是否为false，第二个条件都要判断，效率低
			*/

        int a = 100;
        int b = 8;

        if (a <8 & ++b> 100){

            System.out.println("ok3");

        }
        System.out.printf("%d,%d",a,b);
    }
}
