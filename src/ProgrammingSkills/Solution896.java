package ProgrammingSkills;

public class Solution896 {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{6,5,4,4}));
    }

    public static boolean isMonotonic(int[] nums) {
        boolean isIncreasing = nums[0] < nums[nums.length - 1];
        if (isIncreasing) {
            for (int i = 0; i < nums.length - 1; i++) {
                if ((nums[i + 1] - nums[i] < 0 && nums[i + 1] != nums[i]) || nums[i] > nums[nums.length-1]) {
                    return false;
                }
            }
        } else {
            for (int i = nums.length - 1; i >= 1; i--) {
                if ((nums[i] - nums[i - 1] > 0 && nums[i - 1] != nums[i]) || nums[i] > nums[0]) {
                    return false;
                }
            }
        }
        return true;
    }
}
