package ProgrammingSkills;

import java.util.ArrayList;
import java.util.List;

public class Solution682 {
    public static void main(String[] args) {

    }

    public static int calPoints(String[] operations) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                Integer temp = result.get(result.size() - 1) + result.get(result.size()- 2);
                result.add(temp);
            } else if (operations[i].equals("C")) {
                result.remove(result.size() - 1);
            } else if (operations[i].equals("D")) {
                result.add(result.get(result.size() - 1) * 2);
            } else result.add(Integer.parseInt(operations[i]));
        }
        return result.stream().reduce(0, Integer::sum);
    }
}
