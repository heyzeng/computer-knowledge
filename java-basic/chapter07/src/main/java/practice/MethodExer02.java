package practice;


public class MethodExer02 {

    public static void main(String[] args) {

        //编写类AA 新方法：判断一个数是奇数odd还是偶数, 返回boolean
        //根据行、列、字符打印 对应行数和列数的字符，比如：行：4，列：4，字符#,则打印相应的效果

        AA aa = new AA();
        System.out.println(aa.toJudgeOdd(10));

        aa.toPrint(3,3,'#');

    }
}

class AA{


    public boolean toJudgeOdd(int num){

//        if (num % 2 == 0){
//            return false;
//        } else {
//            return true;
//        }

        return num % 2 != 0;

    }

    ////根据行、列、字符打印 对应行数和列数的字符，比如：行：4，列：4，字符#,则打印相应的效果

    public void toPrint(int row,int column,char c){

        //打印行
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                System.out.println(c + " " );
            }
            System.out.println();
        }

    }





}
