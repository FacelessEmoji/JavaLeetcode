public class Solution459 {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("babbabbabbabbab"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        char temp = s.charAt(0);
        for (int i = 1; i < s.length() / 2 + 1; i++) {
            if (temp == s.charAt(i)) {
                String temp_sub_s = s.substring(0, i);
                if (s.length() % temp_sub_s.length() == 0) {
                    if (temp_sub_s.repeat(s.length() / temp_sub_s.length()).equals(s)) return true;
                }
            }
        }
        return false;
    }
}
