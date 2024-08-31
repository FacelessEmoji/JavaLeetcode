import java.util.Arrays;

public class Solution242 {
    public boolean isAnagram(String s, String t) {
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        Arrays.sort(s_arr);
        Arrays.sort(t_arr);
        if (s_arr.length != t_arr.length){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s_arr[i] != t_arr[i]) {
                return false;
            }
        }

        return true;
    }
}
