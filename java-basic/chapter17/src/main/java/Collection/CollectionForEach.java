package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author:ZJF
 * Date:2020-12-30 下午5:25
 */
public class CollectionForEach {

    public static void main(String[] args) {

        //1. 先通过 iterator() 返回一个 迭代器 Iterator
        //2.  迭代器 Iterator 有两个核心方法 hasNext()  ,  next() 取出对象，并继续后移
        //3. 遍历使用 while
        List col = new ArrayList();
        col.add(new Book("三国演义", "罗贯中",10.1));
        col.add(new Book("小李飞刀", "古龙",5.1));
        col.add(new Book("红楼梦", "曹雪芹",34.6));
        col.add(new Book("十万个为什么", "佚名",16.7));

        Iterator iterator = col.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("====================================");

        iterator = col.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

class Book{
    private String name;
    private String writer;
    private double price;

    public Book(String name, String writer, double price) {
        this.name = name;
        this.writer = writer;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", writer='" + writer + '\'' +
                ", price=" + price +
                '}';
    }
}
