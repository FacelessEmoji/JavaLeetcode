import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1768 {
    public String mergeAlternately(String word1, String word2) {
        String[] letters1 = word1.split("");
        String[] letters2 = word2.split("");

        List<String> result = new ArrayList<>();

        int minLength = Math.min(letters1.length, letters2.length);

        for (int i = 0; i < minLength; i++) {
            result.add(letters1[i]);
            result.add(letters2[i]);
        }
        if (letters1.length > letters2.length) {
            result.addAll(List.of(Arrays.copyOfRange(letters1, minLength, letters1.length)));
        } else result.addAll(List.of(Arrays.copyOfRange(letters2, minLength, letters2.length)));

        return String.join("", result);
    }
}
