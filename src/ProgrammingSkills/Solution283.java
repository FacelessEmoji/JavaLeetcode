package ProgrammingSkills;

public class Solution283 {
    public static void main(String[] args) {
        int[] test = {0, 1, 4, 5, 0, 3, 12};
        moveZeroes(test);
    }

    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
//        for (int i = 0; i < nums.length - 1; i++) {
//            System.out.println(Arrays.toString(nums));
//            if (nums[i] == 0) {
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (nums[j] != 0) {
//                        int temp = nums[i];
//                        nums[i] = nums[j];
//                        nums[j] = temp;
//                    }
//                }
//            }
//            System.out.println(Arrays.toString(nums) + " " +  i);
//        }
//    }
}
