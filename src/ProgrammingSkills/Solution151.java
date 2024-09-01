package ProgrammingSkills;

public class Solution151 {
    public static void main(String[] args) {
        System.out.println(reverseWords(" f "));
    }
    public static String reverseWords(String s) {
        String[] words = s.trim().replaceAll("\\s+", " ").split(" ");
//        if (words.length % 2 != 0) return "";
        for (int i = 0; i < words.length / 2; i++) {
            String tempLeft = words[i];
            String tempRight = words[words.length - 1 - i];
            words[i] = tempRight;
            words[words.length - 1 - i] = tempLeft;
        }
        return String.join(" ", words);
    }
}
