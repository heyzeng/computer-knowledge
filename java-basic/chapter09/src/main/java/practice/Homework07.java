package practice;

/**
 * Author:Jude
 * Date:2020-12-07 上午11:02
 */
public class Homework07 {

    public static void main(String[] args) {

        Tom tom = new Tom();
        Random random = new Random();

        tom.showTimes[0] = tom.game(tom.stone(),random.randomNum());
        tom.showTimes[1] = tom.game(tom.scissor(),random.randomNum());
        tom.showTimes[2] = tom.game(tom.cloth(),random.randomNum());

        for(int i = 0; i < 3; i++){
            System.out.printf("第%d局tom:"+tom.showTimes[i],i+1);
            System.out.println();
        }
    }
}

class Tom{

    char[][] arr = {{'平','赢','输'},{'赢','平','输'},{'输','赢','平'}};//二维
    char[] showTimes = new char[3];

    //石头
    public char stone(){
        return 0;
    }

    //剪刀
    public int scissor(){
        return 1;
    }

    //布
    public int cloth(){
        return 2;
    }

    /*
     * 参数1gesture 类型 int   手势
     * 参数2random  类型int    电脑手势
     * 返回结果                类型int    输赢结果0平 1赢 2输
     */

    public char game(int gesture,int random){
        return arr[gesture][random];
    }
}


class Random {

    public int randomNum(){
        return (int)(Math.random() * 3);
    }
}
