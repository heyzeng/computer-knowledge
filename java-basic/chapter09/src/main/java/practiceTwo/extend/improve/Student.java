package practiceTwo.extend.improve;

/**
 * Author:ZJF
 * Date:2021-01-06 下午7:55
 */
public class Student {
    private String name;
    private double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String info(){
        return score + " " + name;
    }

    public void showInfo(){
        System.out.println(score + " " + name );
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
