package com.exer;

import java.util.*;

public class test {
    public static void main(String[] args) {

  //      System.out.println(6|3);

        HashMap<String, String> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        int i =  0;

        while (i < 3){

            String key = sc.next();
            String value = sc.next();
            map.put(key,value);
            i++;
        }
        Iterator<String> it = map.values().iterator();
        while (it.hasNext()){
            System.out.println(it.next() + " --");
        }

        //使用entrySet方法获取key-value值
        Set<Map.Entry<String,String>> set=map.entrySet();
        for(Map.Entry<String,String> entry:set) {
            System.out.print(entry.getKey()+"-");
            System.out.println(entry.getValue());
        }

    }
}