package enum_;

/**
 * Author:ZJF
 * Date:2021-01-22 上午8:47
 */
public class EnumSeason {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
    }
}

class Season{

    //相当于恶汉式的单例
    public final static Season spring = new Season("SPRING","春天");
    public final static Season SUMMER = new Season("夏天", "炎热");
    public final static Season AUTUMN = new Season("秋天", "凉爽");
	public final static Season WINTER = new Season("冬天", "寒冷");
    private String name;// 季节名称
    private String description;// 季节描述

    public Season(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
