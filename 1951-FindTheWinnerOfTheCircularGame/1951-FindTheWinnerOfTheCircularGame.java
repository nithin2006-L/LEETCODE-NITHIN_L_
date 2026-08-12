// Last updated: 8/12/2026, 3:12:55 PM
 class Solution {
public int findTheWinner(int n, int k) {
    return helper(n,k)+1;
}
public int helper(int n,int k){
    if(n==1)
        return 0;
    else
        return (helper(n-1,k)+k)%n;
}
 }
// public int findTheWinner(int n, int k) {
//     int ans = 0;

//     for(int i = 2; i <= n; i++) {
//         ans = (ans + k) % i;
//     }

//     return ans + 1;
// }
//  }