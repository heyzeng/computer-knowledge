package extra;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student();
        student.name = "Tom";
        student.age = 100;

        String say = student.say();
        System.out.println(say);


        String ss = new Student().say();
        System.out.println(ss);
    }
}
