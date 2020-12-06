package practice;

/**
 * Author:Jude
 * Date:2020-12-04 上午10:19
 */
public class Homework05 {

    public static void main(String[] args) {

        Result hw = new Result();
        Result hwInfo = hw.getInfo(1, 2, 30, 1.1);
        System.out.println(hwInfo.max +" " + hwInfo.min +" " + hwInfo.sum);


    }

}


//方法
//编写方法，可以接收个数不等的 double 值 , 返回他们的和， 最大值，最小值

class Result {
    double min,max,sum;

    public Result getInfo(double...nums){

        //判断数组个数，如果个数为1，直接返回
        Result result = new Result();

        if (nums.length == 0){
            result.max = Double.NaN;
            result.min = Double.NaN;
            result.sum = Double.NaN;
            return result;
        }

        //做对比

        result.max = nums[0];
        result.min = nums[0];
        result.sum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (result.max < nums[i]){
                result.max = nums[i];
            }else if (min > nums[i]){
                result.min = nums[i];
            }
            result.sum += nums[i];
            }

        return result;

    }
}