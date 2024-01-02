package collection.framework;

public class DiagonalSum {

    public static void main(String[] args) {
        int[][] matrix = {
            {2, 3, 4},
            {5, 6, 7},
            {8, 9, 10}
        };
        
       

        int result = diagonalSum(matrix);
        System.out.println("Output: " + result);
    }

    public static int diagonalSum(int[][] matrix) {
        int sizeOfMatrix = matrix.length;
        int sum = 0;

        for (int i = 0; i < sizeOfMatrix; i++) {
            // Sum elements in the first diagonal
            sum += matrix[i][i];

            // Check if the element is in the second diagonal and not part of the first diagonal
            int secondDiagonalIndex = sizeOfMatrix - 1 - i;
            if (i != secondDiagonalIndex) {
                sum += matrix[i][secondDiagonalIndex];
            }
        }

        return sum;
    }
}

