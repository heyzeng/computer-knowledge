package practice04;


import java.util.Scanner;

public class MultiForExer01 {

    public static void main(String[] args) {

        /*
			统计3个班成绩情况，每个班有5名同学，
			求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。

			统计三个班及格人数，每个班有5名同学。 10min  15:47 评讲

			化繁为简(能力 完成的事情->分解  )

			1. 给3个班(5个学生)， 输出成绩
			2. 求出各个班的平均分
			3. 所有班级的平均分
			4. 统计三个班及格人数

			思路分析

			1. 双层循环可以搞定

			    使用 外层循环 i 控制班级个数， j 控制学生
				定义变量 score 接收成绩
				使用扫描器

			2. 求出各个班的平均分
			    定义一个变量 classTotalScore 记录 各个班的总分

			3. 所有班级的平均分
				定义一个变量 allClassTotalScore 记录 所有班的总分

			4. 定义一个变量 passNum

			5. 做活
				int classNum int stuNum

			*/

        double score = 0.0;
        double classTotalScore = 0.0;
        double allClassTotalScore = 0.0; //所有班的总分
        int classNum = 4;
        int stuNum = 7;
        int passNum = 0; //及格人数

        System.out.println("please enter score");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <classNum; i++) { //control class

            for (int j = 0; j < stuNum; j++) { //control student

                classTotalScore = 0.0;
                System.out.printf("请输入第%d班的第%d学生的成绩" , i , j);
                score = scanner.nextDouble();

                //calculate the pass score
                if(score >= 60){
                    passNum ++;
                }
                classTotalScore +=score;
            }
            allClassTotalScore +=classTotalScore;
            System.out.printf("%d班级的总分是%.2f 平均分是=%.2f\n", i,  classTotalScore, classTotalScore / stuNum);
        }
        System.out.printf("所有班级的总分是%.2f 平均分是=%.2f\n",  allClassTotalScore, allClassTotalScore / (stuNum * classNum));
        System.out.printf("及格人数%d", passNum);
    }
}
