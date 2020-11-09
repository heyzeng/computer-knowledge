package practice05;


public class HomeWork03 {

    public static void main(String[] args) {

        /*
		输出小写的a-z以及大写的Z―A  [选做]

		化繁为简
		1. 输出小写的a-z
		2. 大写的Z―A

		思路分析
		1. a-z 有 26个字母，因此我们使用循环
		2. 'b' = 'a' + 1 => char 本身就是数
		3. 知识点 ： char 可以 +, -


		*/

        for (char myChar = 'a';  myChar <= 'z'; myChar++) {

            System.out.println(myChar);

        }


        for (char myChar1 = 'Z'; myChar1 >= 'A'; myChar1--){
            System.out.println(myChar1);
        }
    }
}
