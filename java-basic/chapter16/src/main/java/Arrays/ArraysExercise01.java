package Arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Author:Jude
 */
public class ArraysExercise01 {
    public static void main(String[] args) {

        Books[] books = {new Books("西游记", 111), new Books("三国演义", 11), new Books("红楼梦", 12)};

        Arrays.sort(books, new Comparator<Books>() {
            @Override
            public int compare(Books o1, Books o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(Arrays.toString(books));
    }
}

class Books {
    private String name;
    private double price;

    public Books(String name, double price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
