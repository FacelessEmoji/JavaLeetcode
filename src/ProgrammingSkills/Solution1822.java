package ProgrammingSkills;

public class Solution1822 {
    public static void main(String[] args) {
        System.out.println(arraySign(new int[]{-1, 1, -1, -3, 3}));
    }

    public static int arraySign(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) return 0;
            if (nums[i] < 0) count += 1;
        }
        return count % 2 == 0 ? 1 : -1;
    }
}
