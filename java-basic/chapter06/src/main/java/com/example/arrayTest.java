package com.example;

/*
1.求数组元素的最大值、最小值、平均数、总和 、查找等

2.数组的复制、反转

3.数组元素的排序

 */
public class arrayTest {
    public static void main(String[] args) {

        int[] nums = {19, 3, 2, 4};
        //求数组元素的最大值
        int numberMax = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int number = nums[i];
            // 如果数组中的元素大于maxNumber,那么就将该数据赋值给maxNumber
            if (numberMax < number) {
                numberMax = number;
            }
        }

        System.out.println(numberMax);

        System.out.println("-------------------求数组中的最小值-----------");

        int numberMin = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int number = nums[i];
            if (numberMin > number) {
                numberMin = number;
            }
        }

        System.out.println(numberMin);

        System.out.println("-------------------求数组中元素的和 和  平均数----------");


        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("sum = " + sum + " avg = " + sum / nums.length);

        System.out.println("-------------------线性查找----------");

        int findNumber = 100;
        int index = -1; //注意 ：不能写0，因为索引值是从0开始的

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];

            if (findNumber == number) { //找到了
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("亲没有找到您要的商品哟");
        } else {
            System.out.println("index=" + index);
        }


        System.out.println("--------------------------数组的复制-------------");

        int[] copyNumbers = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            //取出nums元素
            int number = nums[i];
            //讲取出来的元素赋值给复制数组
            copyNumbers[i] = number;
        }

        //copyNumbers[0] = 10000;
        for (int i = 0; i < copyNumbers.length; i++) {
            System.out.print(copyNumbers[i] + " ");
        }
        System.out.println();

        System.out.println("-----------------------反转 -------------------------");
        /*
		//第一种方式 ：利用空数组进行反转
		int[] reverseNumbers = new int[numbers.length];
		//倒着取出numbers中的数据，正序放入到reverseNumbers
		for (int i = numbers.length - 1; i >= 0; i--) {
			reverseNumbers[numbers.length - i - 1] = numbers[i];
		}

		for (int i = 0; i < reverseNumbers.length; i++) {
			System.out.print(reverseNumbers[i] + " ");
		}
		*/
/*
        //第二种方式：
        for(int i = 0,j = nums.length - 1; i < nums.length / 2; i++,j--){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        */

        System.out.println();

        System.out.println("-------------------------------");

        //首尾交换，看清楚中止条件
        for (int i = 0; i < nums.length / 2; i++) {

            int temp = nums[i];
            nums[i] = nums[nums.length -1- i];
            nums[nums.length -1 -i] = temp;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[ i] + "\t");

        }
    }
}
