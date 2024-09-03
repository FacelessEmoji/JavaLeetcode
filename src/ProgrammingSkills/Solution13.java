package ProgrammingSkills;

import java.util.HashMap;
import java.util.Map;

public class Solution13 {
    public static void main(String[] args) {

    }

    public static int romanToInt(String s) {
        int result = 0;
        int length = s.length();

        for (int i = length - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == 'I') {
                result = result >= 5 ? result - 1 : result + 1;
            } else if (c == 'V') {
                result += 5;
            } else if (c == 'X') {
                result = result >= 50 ? result - 10 : result + 10;
            } else if (c == 'L') {
                result += 50;
            } else if (c == 'C') {
                result = result >= 500 ? result - 100 : result + 100;
            } else if (c == 'D') {
                result += 500;
            } else if (c == 'M') {
                result += 1000;
            }
        }

        return result;
    }

//    public static int romanToInt(String s) {
//        Map<String, Integer> romanToInteger = new HashMap<>();
//
//        romanToInteger.put("I", 1);
//        romanToInteger.put("V", 5);
//        romanToInteger.put("X", 10);
//        romanToInteger.put("L", 50);
//        romanToInteger.put("C", 100);
//        romanToInteger.put("D", 500);
//        romanToInteger.put("M", 1000);
//
//        String[] str = s.split("");
//        int result = 0;
//        for (int i = str.length - 1; i >= 0; i++) {
//            if (romanToInteger.get(str[i]) == 1) {
//                result = result <= 5 ? result + 1 : result - 1;
//            } else if (romanToInteger.get(str[i]) == 5) {
//                result += 5;
//            } else if (romanToInteger.get(str[i]) == 10) {
//                result = result < 40 ? result + 10 : result - 10;
//            } else if (romanToInteger.get(str[i]) == 50) {
//                result += 50;
//            } else if (romanToInteger.get(str[i]) == 100) {
//                result = result <= 400 ? result + 100 : result - 100;
//            } else if (romanToInteger.get(str[i]) == 500) {
//                result += 500;
//            } else if (romanToInteger.get(str[i]) == 1000) {
//                result += 1000;
//            }
//        }
//        return result;
//    }
}
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
//
//VIII
//IV
//III
//XIII
//I can be placed before V (5) and X (10) to make 4 and 9.
//X can be placed before L (50) and C (100) to make 40 and 90.
//C can be placed before D (500) and M (1000) to make 400 and 900