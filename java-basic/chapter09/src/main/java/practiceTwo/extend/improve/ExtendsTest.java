package practiceTwo.extend.improve;

/**
 * Author:ZJF
 * Date:2021-01-06 下午8:00
 */
public class ExtendsTest {

    public static void main(String[] args) {

        Pupil pupil = new Pupil();
        pupil.testing();
        pupil.setName("小米");
        pupil.setScore(12);
//        pupil.info();
//        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.testing();
    }
}
