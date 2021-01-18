package com.abstract_;

/**
 * Author:ZJF
 * Date:2021-01-15 上午9:54
 */
public class TemplatePattern {
    public static void main(String[] args) {

//        CodeOne codeOne = new CodeOne();
//        codeOne.calculateTime();
//
//        CodeTwo codeTwo = new CodeTwo();
//        codeTwo.calculateTime();

        timeCal(new CodeOne());
        timeCal(new CodeTwo());

    }

    //动态绑定
    public static void timeCal(Temple temple){
        temple.calculateTime();
    }
}

//calculate time
abstract class Temple{
    public abstract void code();

    public void calculateTime(){
        long start = System.currentTimeMillis();
        code();
        long end  = System.currentTimeMillis();

        System.out.println("calculate time = " + (end -start));
    }
}

class CodeOne extends Temple{

    @Override
    public void code() {
       String str = "";
        for (int i = 0; i < 10000; i++) {
            str += "hello" + i;
        }
    }
}


class CodeTwo extends Temple{

    @Override
    public void code() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("hello" + i);
        }
    }
}
