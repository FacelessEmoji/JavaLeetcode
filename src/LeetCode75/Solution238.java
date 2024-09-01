package LeetCode75;

import java.util.Arrays;

public class Solution238 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        // Count prefix for each
        result[0] = 1;
        result[1] = nums[0];
        for (int i = 2; i < nums.length; i++) {
            result[i] = nums[i - 1] * result[i - 1];
        }

        // Working suffix with extra array
//        int[] tempResult = new int[nums.length];
//        tempResult[result.length - 1] = 1;
//        tempResult[result.length - 2] = nums[result.length - 1];
//        for (int i = nums.length - 3; i >= 0; i--) {
//            tempResult[i] = nums[i + 1] * tempResult[i + 1];
//        }
//        System.out.println(Arrays.toString(tempResult));


        int temp = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            temp *= nums[i + 1];
            result[i] *= temp;
        }

        return result;
    }
}
//F*ck me it seems to be working!

//2,3,4,5
//1,0,0,0
//
//1,0,0,0
//1,2,0,0
//1,2,2*3,0
//1,2,2*3,2*3*4

// Два массива, в одном будут префиксные произведения для s[i]
// В другом суффиксные