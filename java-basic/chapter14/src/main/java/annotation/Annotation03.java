package annotation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author:ZJF
 * Date:2021-01-22 上午9:27
 */
public class Annotation03 {
    public static void main(String[] args) {

        @SuppressWarnings({ "rawtypes", "unchecked", "unused" })
        List list = new ArrayList();
        list.add("");
        list.add("");
        list.add("");
        int i;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object = (Object) iterator.next();

        }

    }

    @SuppressWarnings("unused")
    public static void m1() {
        String  name = "tom";
    }
}
