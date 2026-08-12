// Last updated: 8/12/2026, 3:11:52 PM
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Find maximum value of each column
        int[] maxCol = new int[n];

        for (int j = 0; j < n; j++) {
            maxCol[j] = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                maxCol[j] = Math.max(maxCol[j], matrix[i][j]);
            }
        }

        // Replace -1 with column maximum
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = maxCol[j];
                }
            }
        }

        return matrix;
    }
}