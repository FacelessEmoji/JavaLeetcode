package ProgrammingSkills;

public class Solution657 {
    public static void main(String[] args) {
        System.out.println(judgeCircle("LL"));
    }

    public static boolean judgeCircle(String moves) {
        int horizontal_count = 0, vertical_count = 0;
        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            switch (c) {
                case 'U':
                    vertical_count++;
                    break;
                case 'D':
                    vertical_count--;
                    break;
                case 'L':
                    horizontal_count++;
                    break;
                case 'R':
                    horizontal_count--;
                    break;
            }
        }
        return horizontal_count == 0 && vertical_count == 0;
    }
}
