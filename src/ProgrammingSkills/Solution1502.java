package ProgrammingSkills;

import java.util.Arrays;

public class Solution1502 {
    public static void main(String[] args) {
        System.out.println(canMakeArithmeticProgression(new int[]{1,3,4}));
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 2; i >= 1; i--) {
            if (arr[i] - arr[i - 1] != arr[i + 1] - arr[i]) {
                return false;
            }
        }
        return true;
    }
}
