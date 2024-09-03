package ProgrammingSkills;

public class Solution58 {
    public static void main(String[] args) {

    }

    //    public static int lengthOfLastWord(String s) {
//        String[] words = s.trim().replaceAll("\\s+", " ").split(" ");
//        return words[words.length - 1].length();
//    }
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            result++;
        }

        return result;
    }
}
