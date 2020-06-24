package extra;


public class yangHui {
    public static void main(String[] args) {

        //创建一个二维数组
        int[][] numbers = new int[10][];

        for(int i = 0 ;i < numbers.length; i++){ //i指的是二维数组的索引值

            //初始化二维数组的元素
            numbers[i] = new int[i + 1];
            //将二维数组元素的第一个元素和最后一个元素赋值为1
            numbers[i][0] = numbers[i][i] = 1;

            //遍历一维数组。给数组中的元素填充数值(第一个和最后一个元素不需要再进行填充)
            for(int j = 1 ; j < numbers[i].length - 1; j++){

                numbers[i][j] = numbers[i-1][j] + numbers[i-1][j-1];
            }
        }

        //遍历值得到杨辉三角
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
