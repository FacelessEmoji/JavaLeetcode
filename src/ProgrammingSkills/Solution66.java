package ProgrammingSkills;

import java.util.Arrays;

public class Solution66 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1,9,9})));
    }

    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1]++;
            return digits;
        }

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                if (i == 0) {
                    int[] newDigits = new int[digits.length + 1];
                    newDigits[0] = 1;
                    System.arraycopy(digits, 0, newDigits, 1, newDigits.length - 1);
                    return newDigits;
                }

            } else if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
        }
        return digits;
    }
}
