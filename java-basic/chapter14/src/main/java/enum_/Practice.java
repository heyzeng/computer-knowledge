package enum_;

/**
 * Author:ZJF
 * Date:2020-12-25 上午9:57
 */
public class Practice {

    public static void main(String[] args) {

        Week[] values = Week.values();
        for (Week e:values) {
            System.out.println(e);

        }
    }
}

enum Week{

    //枚举常量
    Monday("星期一"),Tuesday("星期二"),Wednesday("星期三"),
    Thursday("星期四"), Friday("星期五"),Saturday("星期流"),Sunday("星期日");

    private String name;

    Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                '}';
    }
}
