package com.override;

/**
 * Author:ZJF
 * Date:2021-01-06 下午8:26
 */
public class OverrideTest {
}

class AAA{
    public int sum(int i,int j){
        return i + j;
    }
}

class BBB extends AAA{
    @Override
    public int sum(int n1, int n2) {
        int res = n1 + n2;
        return res;
    }
}
