// Last updated: 8/12/2026, 3:13:47 PM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int row,col;
        int [][]result=new int[matrix[0].length][matrix.length];
        for(row=0;row<matrix.length;row++){
            for(col=0;col<matrix[0].length;col++){
                result[col][row]=matrix[row][col];
            }
        }
        return result;
    }
}