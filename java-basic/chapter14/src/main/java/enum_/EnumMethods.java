package enum_;

/**
 * Author:ZJF
 * Date:2021-01-22 上午9:05
 */
public class EnumMethods {
    public static void main(String[] args) {

        System.out.println(Season.AUTUMN);
    }
}

enum Season2{

    SPRING("春天", "温暖"), //0
    SUMMER("夏天", "炎热"), //1
    AUTUMN("秋天", "凉爽"), //2
    WINTER("冬天", "寒冷"); //3

    private String name;// 季节名称
    private String description;// 季节描述

    private Season2(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
