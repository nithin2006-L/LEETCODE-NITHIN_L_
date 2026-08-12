// Last updated: 8/12/2026, 3:17:47 PM
// class Solution {
//     int fun( int i, int j, int m, int n) {
//         if( i==m-1&&j==n-1)
//         return 1;
//         if(j>=n||i>=m)
//         return 0;
//         return fun(i,j+1,m,n) + fun(i+1,j,m,n);
//     }
//     public int uniquePaths(int m, int n){
//         int c=fun(0,0,m,n);
//         return c;
//     }
// }

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++)
            dp[i][0] = 1;
        for(int j = 0; j < n; j++)
            dp[0][j] = 1;
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}