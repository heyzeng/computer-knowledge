package practiceTwo.extend;

/**
 * Author:ZJF
 * Date:2021-01-06 上午11:00
 */
public class Pupil {
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

    public void Test(){
        System.out.println("testing");
    }

    public void showInfo(){
        System.out.println(name + " " + score);
    }
}
