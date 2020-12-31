package map;

import java.util.*;

/**
 * Author:ZJF
 * Date:2020-12-31 上午10:32
 */
public class HashMapForeach {

    public static void main(String[] args) {

        HashMap map = new HashMap();

        map.put("邓超", new Object());//k-v
        map.put("邓超", "孙俪"); //替换
        map.put("王宝强", "马蓉");
        map.put("宋喆", "马蓉");
        map.put("刘令博", null);
        map.put(null, "刘亦菲");

        map.put("鹿晗", "关晓彤");

        System.out.println("-----------one---------------");
        // first ergodic
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object key = iterator.next();
            System.out.println(key + " " + map.get(key) );
        }

        System.out.println("-----------two---------------");
        //second ergodic
        for (Object key : set) {
            System.out.println(key + " " + map.get(key));
        }

        System.out.println("-----------three---------------");
        //third ergodic
        Set entrySet = map.entrySet();//1. 把所有的k-v(entry) , 放入到一个集合
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()){
            //1. entrySet 中存放的元素 的运行类型是 HashMap$Node
            //Object object =  iterator2.next();
            Map.Entry node = (Map.Entry)iterator1.next();
            System.out.println(node.getKey() + " " + node.getValue() );
        }

        System.out.println("-----------four---------------");
        //fourth ergodic
        for (Object entry: entrySet) {
            Map.Entry node = (Map.Entry)entry;//obj 的编译类型Object, obj运行类型 HashMap$Node
            System.out.println(node.getKey() + " " + node.getValue());
        }

        System.out.println("-----------get values---------------");
        //to get value
        Collection values = map.values();
        System.out.println(values);
    }
}
