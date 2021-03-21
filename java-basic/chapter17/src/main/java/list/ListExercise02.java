package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author:ZJF
 * Date:2020-12-30 上午10:14
 */
public class ListExercise02 {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(new Book("1", 1.5, "jim"));
        list.add(new Book("2", 1.2, "Tom"));
        list.add(new Book("3", 1.3, "sim"));

        System.out.println(list.get(0));
        System.out.println("======");
        //遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        sort(list);

        //迭代之后，指针在最下面,需要重置下
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void sort(List list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {

                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);

                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }
}

/*
 使用List的实现类添加三本图书，并遍历，打印如下效果

名称：xx	 	价格：xx  	作者：xx
名称：xx		价格：xx		作者：xx
名称：xx		价格：xx		作者：xx
要求
按价格排序,从低到高(使用冒泡法)
要求使用ArrayList、LinkedList 和 Vector 三种集合实现
结论：主要说明，只要实现了List接口，那么List的实现类都可以使用List接口中的方法

*/

class Book {
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
