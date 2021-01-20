package com.inner.nonameclass;

/**
 * Author:ZJF
 * Date:2021-01-20 上午10:36
 */
public class NoNameInnerClassApply02 {
    public static void main(String[] args) {

        CallPhone callPhone = new CallPhone();

        callPhone.alarmBell(new Bell() {
            @Override
            public void ring() {
                System.out.println("hello");
            }
        });


        callPhone.alarmBell(new Bell() {
            @Override
            public void ring() {
                System.out.println("hi");
            }
        });
    }
}

interface Bell{
    void ring();
}

class CallPhone {
    public void alarmBell(Bell bell){
         bell.ring();
    }
}
