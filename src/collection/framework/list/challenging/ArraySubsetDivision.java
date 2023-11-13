package collection.framework.list.challenging;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySubsetDivision {

    public static void main(String[] args) {
        int[] array = {3, 7, 5, 6, 2};
        List<Integer> subsetA = findSubsetA(array);

        System.out.println("Subset A: " + subsetA);
    }

    public static List<Integer> findSubsetA(int[] array) {
        int sum = Arrays.stream(array).sum();
        int halfSum = sum / 2;

        // Create a 2D array to store the dynamic programming results
        boolean[][] dp = new boolean[array.length + 1][halfSum + 1];

        // Initialize the first column to true
        for (int i = 0; i <= array.length; i++) {
            dp[i][0] = true;
        }

        // Fill the dynamic programming array
        for (int i = 1; i <= array.length; i++) {
            for (int j = 1; j <= halfSum; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= array[i - 1]) {
                    dp[i][j] |= dp[i - 1][j - array[i - 1]];
                }
            }
        }

        List<Integer> subsetA = new ArrayList<>();
        int maxSum = 0;

        // Backtrack to find the subset A with maximal sum
        for (int i = array.length; i >= 1; i--) {
            if (halfSum >= array[i - 1] && dp[i - 1][halfSum - array[i - 1]]) {
                subsetA.add(array[i - 1]);
                halfSum -= array[i - 1];
                maxSum += array[i - 1];
            }
        }

        System.out.println("Subset A Sum: " + maxSum);
        return subsetA;
    }
}
