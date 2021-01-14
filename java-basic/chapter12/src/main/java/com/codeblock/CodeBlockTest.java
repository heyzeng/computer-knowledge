package com.codeblock;

/**
 * Author:ZJF
 * Date:2021-01-14 上午9:08
 */
public class CodeBlockTest {
    public static void main(String[] args) {

        new AA();
    }
}

class AA {
    {
        System.out.println("normal code block");
    }

    public AA() {
        System.out.println("a");
    }
}
