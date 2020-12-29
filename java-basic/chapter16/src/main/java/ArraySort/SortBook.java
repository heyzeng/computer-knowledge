package ArraySort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Author:ZJF
 * Date:2020-12-29 上午9:35
 */
public class SortBook {

    public static void main(String[] args) {

        Book[] book = {new Book("西游记",21.9),new Book("红楼梦",12),
                new Book("三国",40)};

        Arrays.sort(book, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() > o2.getPrice()){
                    return -1;
                }else if (o1.getPrice() < o2.getPrice()){
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(Arrays.toString(book));
    }
}

class Book{
    private String name;
    private double price;

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

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
