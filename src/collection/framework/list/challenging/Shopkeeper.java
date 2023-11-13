package collection.framework.list.challenging;

import java.util.List;

public class Shopkeeper {
    public static int minMoves(List<Integer> quantity) {
        int n = quantity.size();
        
        // Calculate the total sum of quantities
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += quantity.get(i);
        }
        
        // If the total sum is not divisible by 2, it is not possible to split the quantities equally
        if (totalSum % 2 != 0) {
            return -1;
        }
        
        int targetSum = totalSum / 2;
        int[] prefixSum = new int[n];
        prefixSum[0] = quantity.get(0);
        
        // Calculate the prefix sum of quantities
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + quantity.get(i);
        }
        
        int minMoves = Integer.MAX_VALUE;
        
        // Find the minimum number of moves for each possible split point
        for (int i = 0; i < n - 1; i++) {
            int firstHalfSum = prefixSum[i];
            
            // If the first half sum is greater than the target sum, it is not a valid split point
            if (firstHalfSum > targetSum) {
                break;
            }
            
            int secondHalfSum = prefixSum[n - 1] - prefixSum[i];
            int moves = Math.abs(firstHalfSum - targetSum);
            
            // If the second half sum is greater than the target sum, update the number of moves
            if (secondHalfSum > targetSum) {
                moves += secondHalfSum - targetSum;
            }
            
            minMoves = Math.min(minMoves, moves);
        }
        
        return (minMoves == Integer.MAX_VALUE) ? -1 : minMoves;
    }

    public static void main(String[] args) {
        List<Integer> quantity = List.of(3,4,5,7); // Example input
        
        int minMoves = minMoves(quantity);
        System.out.println("Minimum number of moves: " + minMoves);
    }
}


