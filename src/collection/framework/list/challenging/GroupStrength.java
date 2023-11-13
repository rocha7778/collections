package collection.framework.list.challenging;

import java.util.ArrayList;
import java.util.List;

public class GroupStrength {
    public static void main(String[] args) {
        int n = 5;
        List<Integer> group = new ArrayList<>();
        group.add(n);
        List<Integer> maxGroup = findMaxStrengthGroup(n, group);
        int leader = maxGroup.get(maxGroup.size() - 1);
        int groupSize = maxGroup.size();
        int strength = leader * groupSize;
        System.out.println("Maximum strength of the group: " + strength);
    }

    public static List<Integer> findMaxStrengthGroup(int n, List<Integer> group) {
        int sum = getDigitFactorialSum(n);
        if (sum > n) {
            group.add(sum);
            return findMaxStrengthGroup(sum, group);
        } else {
            return group;
        }
    }

    public static int getDigitFactorialSum(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        return sum;
    }

    public static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}

