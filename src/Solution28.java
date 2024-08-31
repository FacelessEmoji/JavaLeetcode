public class Solution28 {
    public static void main(String[] args) {
        System.out.println(strStr("babba", "bbb"));
    }

public static int strStr(String haystack, String needle) {
    int i = 0;
    int j = 0;
    boolean flag = false;
    int result = 0;

    while (i < haystack.length()) {
        if (haystack.charAt(i) == needle.charAt(j)) {
            System.out.println(haystack.charAt(i));
            j++;
            if (j == needle.length()) {
                flag = true;
                result = i - j + 1;
                break;
            }
        } else if (j > 0) {
            i -= j;
            j = 0;
        }
        i++;
    }
    return flag ? result : -1;
}
}
