package practiceTwo.encap;

/**
 * Author:Jude
 * Date:2021-01-05 下午11:14
 */
public class EncapExercise {

    public static void main(String[] args) {

        System.out.println(new Person2("j",18000,12.1,"doctor"));
    }
}


//name的长度在 2-6 之间
//年龄必须在 1-120

class Person2{

    private String name;
    private int age;
    private double sal;
    private String job;

    public Person2(String name, int age, double sal, String job) {
        setName(name);
        setAge(age);
        this.sal = sal;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {//name的长度在 2-6 之间
        if (name.length() >= 2 && name.length() <=  6){
            this.name = name;
        }else {
            this.name = "no name";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120){
            this.age = age;
        }else {
            this.age = 18;
        }
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                ", job='" + job + '\'' +
                '}';
    }
}