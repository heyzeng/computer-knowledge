package com.poly;

/**
 * Author:ZJF
 * Date:2021-01-12 上午8:12
 */
public class PolyOverride {
    public static void main(String[] args) {

        AA aa = new AA();
        aa.hi("yes");

        BB bb = new BB();
        bb.hi("no");

    }
}

class AA {
    public void hi(String name) {
        System.out.println("AA " + name);
    }
}

class BB extends AA{
    @Override
    public void hi(String name) {
        super.hi(name);
    }
}
